/*
 *      ${expr} - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2016 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/ & https://github.com/TheRealBuggy/) <jonathan.scripter@programmer.net>
 *      Copyright (c) contributors
 *
 *
 *      Permission is hereby granted, free of charge, to any person obtaining a copy
 *      of this software and associated documentation files (the "Software"), to deal
 *      in the Software without restriction, including without limitation the rights
 *      to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *      copies of the Software, and to permit persons to whom the Software is
 *      furnished to do so, subject to the following conditions:
 *
 *      The above copyright notice and this permission notice shall be included in
 *      all copies or substantial portions of the Software.
 *
 *      THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *      IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *      FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *      AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *      LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *      OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *      THE SOFTWARE.
 */
package com.github.jonathanxd.codeapi.helper;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.MethodType;
import com.github.jonathanxd.codeapi.gen.GenericGenerator;
import com.github.jonathanxd.codeapi.interfaces.CatchBlock;
import com.github.jonathanxd.codeapi.interfaces.Expression;
import com.github.jonathanxd.codeapi.interfaces.Group;
import com.github.jonathanxd.codeapi.interfaces.Named;
import com.github.jonathanxd.codeapi.interfaces.IfBlock;
import com.github.jonathanxd.codeapi.keywords.Keyword;
import com.github.jonathanxd.codeapi.keywords.Keywords;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.operators.Operators;
import com.github.jonathanxd.codeapi.storage.StorageKeys;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.types.NullType;
import com.github.jonathanxd.codeapi.util.CodeParameter;
import com.github.jonathanxd.codeapi.util.MultiVal;

import java.util.Collection;

/**
 * Created by jonathan on 07/05/16.
 */
public final class Helper {

    private static final None NONE = new None();

    //invoke(Helper.accessThis(), Helper.none(), Helper.methodSpec());
    public static CodePart invoke(CodePart target, MethodSpec methodSpec) {
        return new MethodInvocationImpl(target, methodSpec);
    }

    public static CodePart construct(CodePart firstExpression, CodeType type) {
        return new MethodInvocationImpl(expression(firstExpression, expression(Keywords.NEW)), new MethodSpec(type, MethodType.CONSTRUCTOR));
    }

    public static CodePart accessLocalVariable(String name) {
        return accessVariable(accessLocal(), name);
    }

    public static CodePart accessVariable(CodePart localization, String name) {
        return new SimpleVariableAccess(localization, name);
    }

    public static CodePart simpleVariable(String name) {
        return new SimpleVariableAccess(null, name);
    }

    public static CodePart setVariable(CodePart localization, String variable, CodePart value) {
        CodePart var = new SimpleVariableAccess(localization, variable);
        return expression(var, expression(Operators.ASSIGNMENT, new NonExpressionExpr(value)));
    }

    public static CodePart setVariableInline(CodePart localization, String variable, CodePart value) {
        CodePart var = new SimpleVariableAccess(localization, variable);
        return expression(var, expression(Operators.ASSIGNMENT, expression(value)));
    }

    public static Group group(Expression expression) {
        return new SimpleGroup(expression);
    }

    public static CodeType nullType() {
        return NullType.getNullType();
    }

    @SuppressWarnings("unchecked")
    public static CatchBlock catchBlock(Collection<CodeType> catchExceptions, String variable, CodeSource body) {
        CatchExBlock exBlock = new CatchExBlock();

        catchExceptions.stream().map(ex -> new CodeParameter(variable, ex)).forEach(exBlock::addParameter);

        exBlock.addBody(body);

        return exBlock;
    }

    public static IfBlock ifExpression(MultiVal<Group> groups, CodeSource body /*, ElseBlock else*/) {
        IfBlock ifBlock = new SimpleIfBlock();

        ifBlock.addAll(StorageKeys.GROUPS, groups.iterator());

        ifBlock.setBody(body);

        return ifBlock;
    }

    public static CodePart tryCatchBlock(CodePart expression) {
        return new TryCatchBlock(expression);
    }

    public static CodePart tryCatchBlock(CodePart expression, Collection<CatchBlock> catchBlocks) {
        return new TryCatchBlock(expression, catchBlocks);
    }

    public static CodePart surround(CodePart toSurround, Collection<CatchBlock> catchBlocks) {
        TryCatchBlock tryCatchBlock = new TryCatchBlock(null, catchBlocks);

        tryCatchBlock.addBody(sourceOf(toSurround));

        return tryCatchBlock;
    }

    public static CodePart surround(CodeSource toSurround, Collection<CatchBlock> catchBlocks) {
        TryCatchBlock tryCatchBlock = new TryCatchBlock(null, catchBlocks);

        tryCatchBlock.addBody(toSurround);

        return tryCatchBlock;
    }

    public static CodePart localizedAtType(CodeType type) {
        return new LocalizedAtType(type);
    }

    public static Expression expression(CodePart expression, Expression nestedExpression) {
        return new SimpleExpression(expression, nestedExpression);
    }

    public static Expression expression(CodePart expression) {
        return new SimpleExpression(expression, null);
    }

    public static Keyword accessThis() {
        return Keywords.THIS;
    }

    /**
     * Access local variable. Same as {@code null}.
     *
     * @return Access to local variable. Same as {@code null}.
     */
    public static CodePart accessLocal() {
        return null;
    }

    public static boolean isNone(CodePart codePart) {
        return codePart == NONE;
    }

    public static boolean isNone(Named named) {
        return named == NONE;
    }

    @SuppressWarnings("unchecked")
    public static <T extends CodePart & Named> T none() {
        return (T) NONE;
    }

    public static CodeSource sourceOf(CodePart... parts) {
        CodeSource source = new CodeSource();

        for (CodePart part : parts) {
            source.add(part);
        }

        return source;
    }


    public static CodeType getJavaType(Class<?> aClass) {
        return new JavaType(aClass);
    }

    public static CodePart declarePackage(String packageName) {
        return expression(Keywords.PACKAGE, expression(Literals.STRING(packageName)));
    }

    final private static class JavaType implements CodeType, GenericGenerator {
        private final Class<?> type;

        private JavaType(Class<?> type) {
            this.type = type;
        }

        @Override
        public String getType() {
            return type.getCanonicalName();
        }
    }

    final private static class None implements CodePart, Named {

        @Override
        public String getName() {
            throw new IllegalStateException("Empty element");
        }

        @Override
        public boolean isExpression() {
            throw new IllegalStateException("Empty element");
        }
    }

    private static final class NonExpressionExpr extends SimpleExpression implements GenericGenerator {

        public NonExpressionExpr(CodePart expression) {
            this(expression, null);
        }

        public NonExpressionExpr(CodePart expression, Expression nextExpression) {
            super(expression, nextExpression);
        }

        @Override
        public boolean isExpression() {
            return false;
        }
    }

}
