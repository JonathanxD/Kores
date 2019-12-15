/*
 *      Kores - Java source and Bytecode generation framework <https://github.com/JonathanxD/Kores>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2019 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/) <jonathan.scripter@programmer.net>
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
package com.github.jonathanxd.kores.test;

import com.github.jonathanxd.kores.Instructions;
import com.github.jonathanxd.kores.Types;
import com.github.jonathanxd.kores.base.ClassDeclaration;
import com.github.jonathanxd.kores.base.KoresParameter;
import com.github.jonathanxd.kores.base.ConstructorDeclaration;
import com.github.jonathanxd.kores.base.TypeDeclaration;
import com.github.jonathanxd.kores.factory.Factories;
import com.github.jonathanxd.kores.helper.Predefined;
import com.github.jonathanxd.kores.literal.Literals;
import com.github.jonathanxd.kores.operator.Operators;

import org.junit.Test;

import java.util.Collections;

public class ComplexIfTest3_ {
    //
    public static TypeDeclaration $() {

        return ClassDeclaration.Builder.builder()
                .specifiedName("test.ComplexIf3")
                .constructors(
                        ConstructorDeclaration.Builder.builder()
                                .parameters(new KoresParameter(Collections.emptyList(), Collections.emptySet(), Types.BOOLEAN, "h"),
                                        new KoresParameter(Collections.emptyList(), Collections.emptySet(), Types.BOOLEAN, "x"),
                                        new KoresParameter(Collections.emptyList(), Collections.emptySet(), Types.BOOLEAN, "y"),
                                        new KoresParameter(Collections.emptyList(), Collections.emptySet(), Types.BOOLEAN, "z"),
                                        new KoresParameter(Collections.emptyList(), Collections.emptySet(), Types.BOOLEAN, "p"),
                                        new KoresParameter(Collections.emptyList(), Collections.emptySet(), Types.BOOLEAN, "v"))
                                .body(Instructions.fromVarArgs(
                                        Factories.ifStatement(
                                                Factories.ifExprs(
                                                        Factories.accessVariable(Types.BOOLEAN, "h"),
                                                        Operators.AND,
                                                        Factories.accessVariable(Types.BOOLEAN, "x"),
                                                        Operators.AND,
                                                        Factories.ifExprs(Factories.accessVariable(Types.BOOLEAN, "y"), Operators.OR, Factories.accessVariable(Types.BOOLEAN, "z")),
                                                        Operators.OR,
                                                        Factories.ifExprs(Factories.accessVariable(Types.BOOLEAN, "p"), Operators.OR, Factories.accessVariable(Types.BOOLEAN, "v"))
                                                        ),
                                                Instructions.fromVarArgs(Predefined.invokePrintlnStr(Literals.STRING("true"))),
                                                Instructions.fromVarArgs(Predefined.invokePrintlnStr(Literals.STRING("false")))
                                        )

                                )).build()
                ).build();
    }

    @Test
    public void test() {
        $();
    }


}
