/*
 *      CodeAPI - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
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
package com.github.jonathanxd.codeapi.test;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.gen.common.PlainSourceGenerator;
import com.github.jonathanxd.codeapi.helper.Helper;
import com.github.jonathanxd.codeapi.helper.MethodSpec;
import com.github.jonathanxd.codeapi.impl.CodeClass;
import com.github.jonathanxd.codeapi.impl.CodeField;
import com.github.jonathanxd.codeapi.impl.CodeMethod;
import com.github.jonathanxd.codeapi.interfaces.Expression;
import com.github.jonathanxd.codeapi.keywords.Keywords;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.operators.Operators;
import com.github.jonathanxd.codeapi.util.CodeArgument;
import com.github.jonathanxd.codeapi.util.CodeModifier;
import com.github.jonathanxd.codeapi.util.CodeParameter;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.github.jonathanxd.codeapi.helper.Helper.accessLocalVariable;
import static com.github.jonathanxd.codeapi.helper.Helper.createFor;
import static com.github.jonathanxd.codeapi.helper.Helper.declarePackage;
import static com.github.jonathanxd.codeapi.helper.Helper.end;
import static com.github.jonathanxd.codeapi.helper.Helper.expression;
import static com.github.jonathanxd.codeapi.helper.Helper.expressions;
import static com.github.jonathanxd.codeapi.helper.Helper.getJavaType;
import static com.github.jonathanxd.codeapi.helper.Helper.sourceOf;

/**
 * Created by jonathan on 12/05/16.
 */
public class TestForLoop {
    private static final TestForLoop TEST_FOR_LOOP = new TestForLoop();

    @Test
    public void simpleTest() {

        CodeSource source = new CodeSource();

        CodePart packageDeclaration = declarePackage("me.jonathanscripter.codeapi.test");

        PlainSourceGenerator generator = PlainSourceGenerator.INSTANCE;

        source.add(packageDeclaration);

        CodeClass codeClass = new CodeClass("me.jonathanscripter.codeapi.test.Nomade",
                Arrays.asList(CodeModifier.PUBLIC),
                null,
                null,
                sourceOf(
                        createMethod()
                ));

        source.add(codeClass);
        String gen = generator.gen(source);

        System.out.println(gen);
    }

    private CodePart createMethod() {

        CodeSource methodSource = new CodeSource();

        CodeMethod method = new CodeMethod("printX", Arrays.asList(),
                Arrays.asList(new CodeParameter("y", getJavaType(Integer.TYPE)), new CodeParameter("obj", getJavaType(Object.class))),
                getJavaType(Void.TYPE),
                methodSource);

        CodeField xField = new CodeField("x", Helper.getJavaType(Integer.TYPE), Collections.emptyList(), Literals.INT(0));

        CodePart invokePrintln = Helper.invoke(Helper.accessVariable(Helper.localizedAtType(Helper.getJavaType(System.class)), "out"), new MethodSpec("println", Collections.emptyList()).addArgument(new CodeArgument(accessLocalVariable("obj"))));

        Expression addToX = expressions(Operators.INCREMENT, accessLocalVariable(xField.getName()));

        methodSource.add(
                createFor(expression(xField), expressions(accessLocalVariable(xField.getName()), Operators.LESS_THAN, accessLocalVariable("y")), addToX,
                        sourceOf(invokePrintln,
                                end(Keywords.BREAK)))
        );


        return method;
    }

}
