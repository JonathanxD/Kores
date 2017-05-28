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
import com.github.jonathanxd.codeapi.base.CodeModifier;
import com.github.jonathanxd.codeapi.base.EnumDeclaration;
import com.github.jonathanxd.codeapi.base.EnumEntry;
import com.github.jonathanxd.codeapi.base.MethodDeclaration;
import com.github.jonathanxd.codeapi.base.TypeDeclaration;
import com.github.jonathanxd.codeapi.factory.Factories;
import com.github.jonathanxd.codeapi.helper.Predefined;
import com.github.jonathanxd.codeapi.literal.Literals;
import com.github.jonathanxd.codeapi.util.CodeTypes;

import org.junit.Test;

import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

public class EnumTest_ {


    public static TypeDeclaration $() {

        return EnumDeclaration.Builder.Companion.builder()
                .modifiers(SetsKt.setOf(CodeModifier.PUBLIC))
                .implementations(CollectionsKt.listOf(CodeTypes.getCodeType(MyItf.class)))
                .qualifiedName("com.MyEnum")//CodeAPI.sourceOfParts(Predefined.invokePrintln(CodeAPI.argument(Literals.STRING("A"), String.class)))
                .entries(
                        EnumEntry.Builder.builder()
                                .name("A")
                                .methods(MethodDeclaration.Builder.builder()
                                        .modifiers(SetsKt.setOf(CodeModifier.PUBLIC))
                                        .annotations(Factories.overrideAnnotation())
                                        .returnType(Types.VOID)
                                        .name("v")
                                        .body(CodeSource.fromVarArgs(
                                                Predefined.invokePrintln(Literals.STRING("A"))
                                        ))
                                        .build())
                                .build(),
                        EnumEntry.Builder.builder()
                                .name("B")
                                .methods(MethodDeclaration.Builder.builder()
                                        .modifiers(CodeModifier.PUBLIC)
                                        .annotations(Factories.overrideAnnotation())
                                        .returnType(Types.VOID)
                                        .name("v")
                                        .body(CodeSource.fromVarArgs(
                                                Predefined.invokePrintln(Literals.STRING("B"))
                                        ))
                                        .build())
                                .build())
                .build();
    }

    @Test
    public void test() {
        $();
    }


    public interface MyItf {
        void v();
    }

}
