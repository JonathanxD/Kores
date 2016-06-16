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
package com.github.jonathanxd.codeapi.gen.common.source;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.gen.CodeSourceData;
import com.github.jonathanxd.codeapi.gen.Generator;
import com.github.jonathanxd.codeapi.gen.TargetValue;
import com.github.jonathanxd.codeapi.gen.Value;
import com.github.jonathanxd.codeapi.gen.ValueImpl;
import com.github.jonathanxd.codeapi.gen.common.PlainSourceGenerator;
import com.github.jonathanxd.codeapi.interfaces.IfExpr;
import com.github.jonathanxd.codeapi.interfaces.IfExpressionable;
import com.github.jonathanxd.codeapi.operators.Operator;
import com.github.jonathanxd.codeapi.operators.Operators;
import com.github.jonathanxd.codeapi.util.Data;
import com.github.jonathanxd.codeapi.util.Parent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jonathan on 09/05/16.
 */
public class IfExpressionableSourceGenerator implements Generator<IfExpressionable, String, PlainSourceGenerator> {

    public static final IfExpressionableSourceGenerator INSTANCE = new IfExpressionableSourceGenerator();

    private IfExpressionableSourceGenerator() {
    }

    @Override
    public List<Value<?, String, PlainSourceGenerator>> gen(IfExpressionable ifExpressionable, PlainSourceGenerator plainSourceGenerator, Parent<Generator<?, String, PlainSourceGenerator>> parents, CodeSourceData codeSourceData, Data data) {

        List<Value<?, String, PlainSourceGenerator>> values = new ArrayList<>();

        values.add(ValueImpl.create("("));

        Collection<CodePart> ifExprs = ifExpressionable.getIfExprsAndOps();

        Iterator<CodePart> iterator = ifExprs.iterator();

        while (iterator.hasNext()) {

            CodePart simpleExpr = iterator.next();

            if(simpleExpr instanceof IfExpr) {

                IfExpr ifExpr = (IfExpr) simpleExpr;

                values.add(ValueImpl.create("("));

                CodePart expr1 = ifExpr.getExpr1();
                CodePart expr2 = ifExpr.getExpr2();
                Operator operation = ifExpr.getOperation();

                if (expr1 != null) {
                    values.add(TargetValue.create(expr1.getClass(), expr1, parents));
                }

                if (operation != null) {
                    values.add(TargetValue.create(operation.getClass(), operation, parents));
                }

                if (expr2 != null) {
                    values.add(TargetValue.create(expr2.getClass(), expr2, parents));
                }

                values.add(ValueImpl.create(")"));
            } else if(simpleExpr == Operators.OR) {
                values.add(ValueImpl.create("||"));
            } else if(simpleExpr == Operators.AND) {
                values.add(ValueImpl.create("&&"));
            }



        }

        values.add(ValueImpl.create(")"));


        return values;
    }

}
