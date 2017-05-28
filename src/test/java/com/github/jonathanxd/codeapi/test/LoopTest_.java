/*
 *      CodeAPI - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2017 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/ & https://github.com/TheRealBuggy/) <jonathan.scripter@programmer.net>
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

import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.Types;
import com.github.jonathanxd.codeapi.base.ClassDeclaration;
import com.github.jonathanxd.codeapi.base.CodeModifier;
import com.github.jonathanxd.codeapi.base.ConstructorDeclaration;
import com.github.jonathanxd.codeapi.base.InvokeType;
import com.github.jonathanxd.codeapi.base.TypeDeclaration;
import com.github.jonathanxd.codeapi.base.VariableAccess;
import com.github.jonathanxd.codeapi.factory.Factories;
import com.github.jonathanxd.codeapi.factory.InvocationFactory;
import com.github.jonathanxd.codeapi.helper.Predefined;
import com.github.jonathanxd.codeapi.literal.Literals;
import com.github.jonathanxd.codeapi.operator.Operators;

import org.junit.Test;

import java.io.PrintStream;

import static com.github.jonathanxd.codeapi.factory.VariableFactory.variable;
import static java.util.Collections.singletonList;

public class LoopTest_ {

    public static TypeDeclaration $() {

        VariableAccess accessX = Factories.accessVariable(Types.INT, "x");
        VariableAccess accessI = Factories.accessVariable(Types.INT, "i");
        VariableAccess accessU = Factories.accessVariable(Types.INT, "u");

        ClassDeclaration codeClass = ClassDeclaration.Builder.builder()
                .modifiers(CodeModifier.PUBLIC)
                .superClass(Types.OBJECT)
                .qualifiedName("fullName." + LoopTest_.class.getSimpleName())
                .constructors(ConstructorDeclaration.Builder.builder()
                        .modifiers(CodeModifier.PUBLIC)
                        .body(CodeSource.fromVarArgs(

                                variable(Types.INT, "x", Literals.INT(0)),

                                Factories.whileStatement(
                                        Factories.ifExprs(Factories.check(accessX, Operators.LESS_THAN, Literals.INT(17))),
                                        CodeSource.fromVarArgs(
                                                Predefined.invokePrintln(accessX),
                                                Factories.operateAndAssign(Types.INT, "x", Operators.ADD, Literals.INT(1))
                                        )
                                ),

                                Factories.forStatement(variable(Types.INT, "i", Literals.INT(0)),
                                        Factories.ifExprs(Factories.check(accessI, Operators.LESS_THAN, Literals.INT(100))),
                                        Factories.operateAndAssign(Types.INT, "i", Operators.ADD, Literals.INT(1)),
                                        CodeSource.fromVarArgs(
                                                Factories.ifStatement(Factories.check(accessI, Operators.EQUAL_TO, Literals.INT(5)),
                                                        CodeSource.fromVarArgs(Factories.continueFlow()),
                                                        CodeSource.empty()),
                                                Predefined.invokePrintln(accessI)
                                        )),


                                variable(Types.INT, "u", Literals.INT(0)),

                                Factories.doWhileStatement(
                                        Factories.ifExprs(Factories.check(accessU, Operators.LESS_THAN, Literals.INT(5))),
                                        CodeSource.fromVarArgs(
                                                Predefined.invokePrintln(accessU),
                                                Factories.operateAndAssign(Types.INT, "u", Operators.ADD, Literals.INT(1)),
                                                Factories.ifStatement(Factories.ifExprs(Factories.check(accessU, Operators.EQUAL_TO, Literals.INT(2))),
                                                        CodeSource.fromVarArgs(Factories.breakFlow()))
                                        )),
                                // Chama um metodo Virtual (metodos de instancia) na Classe PrintStream
                                InvocationFactory.invoke(InvokeType.INVOKE_VIRTUAL, PrintStream.class,
                                        // Acessa uma variavel estatica 'out' com tipo PrintStream na classe System
                                        Factories.accessStaticField(System.class, PrintStream.class, "out"),
                                        // Especificação do metodo
                                        "println",
                                        // Informa que o metodo é println, recebe String e retorna um void
                                        Factories.typeSpec(Types.VOID, Types.STRING),
                                        // Adiciona um argumento String
                                        singletonList(Literals.STRING("Hello World")))
                        ))
                        .build())
                .build();


        return codeClass;

    }

    @Test
    public void test() {
        $();
    }


    private static final class BCLoader extends ClassLoader {

        public Class<?> define(String name, byte[] bytes) {
            return super.defineClass(name, bytes, 0, bytes.length);
        }
    }
}
