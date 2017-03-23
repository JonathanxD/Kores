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

import com.github.jonathanxd.codeapi.CodeAPI;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.Types;
import com.github.jonathanxd.codeapi.base.ClassDeclaration;
import com.github.jonathanxd.codeapi.base.FieldDeclaration;
import com.github.jonathanxd.codeapi.base.MethodDeclaration;
import com.github.jonathanxd.codeapi.base.TypeDeclaration;
import com.github.jonathanxd.codeapi.common.CodeModifier;
import com.github.jonathanxd.codeapi.common.CodeParameter;
import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.literal.Literals;
import com.github.jonathanxd.codeapi.type.PlainCodeType;
import com.github.jonathanxd.codeapi.util.Modifiers;
import com.github.jonathanxd.iutils.annotation.Named;
import com.github.jonathanxd.iutils.object.Pair;

import java.lang.reflect.Modifier;

import kotlin.collections.SetsKt;

import static com.github.jonathanxd.codeapi.CodeAPI.enumValue;
import static com.github.jonathanxd.codeapi.CodeAPI.getJavaType;
import static com.github.jonathanxd.codeapi.CodeAPI.sourceOfParts;
import static com.github.jonathanxd.codeapi.CodeAPI.values;
import static com.github.jonathanxd.codeapi.CodeAPI.visibleAnnotation;
import static kotlin.collections.CollectionsKt.listOf;

public class AnnotatedTest_ {
    //


    public static Pair<@Named("Main class") TypeDeclaration, @Named("Source") CodeSource> $() {

        PlainCodeType plainCodeType = new PlainCodeType("java.lang.invoke.MethodHandle.PolymorphicSignature", true);

        TypeDeclaration typeDeclaration = ClassDeclaration.Builder.Companion.builder()
                .withModifiers(Modifiers.fromJavaModifiers(Modifier.PUBLIC))
                .withGenericSignature(GenericSignature.empty())
                .withAnnotations(listOf(
                        visibleAnnotation(Simple.class,
                                values("value", new Object[]{
                                        enumValue(MyEnum.class, "A"), enumValue(MyEnum.class, "B"), enumValue(MyEnum.class, "C")
                                })
                        ))
                )
                .withQualifiedName("test.AnnotatedTestClass")
                .withBody(sourceOfParts(
                        MethodDeclaration.Builder.Companion.builder()
                                .withModifiers(SetsKt.setOf(CodeModifier.PUBLIC, CodeModifier.STATIC))
                                .withAnnotations(listOf(visibleAnnotation(plainCodeType)))
                                .withGenericSignature(GenericSignature.empty())
                                .withName("polymorphic")
                                .withReturnType(Types.OBJECT)
                                .withParameters(listOf(new CodeParameter(Types.OBJECT, "first", listOf(visibleAnnotation(getJavaType(Deprecated.class))))))
                                .withBody(sourceOfParts(CodeAPI.returnValue(Types.OBJECT, Literals.NULL)))
                                .build(),
                        FieldDeclaration.Builder.Companion.builder()
                                .withModifiers(SetsKt.setOf(CodeModifier.PUBLIC, CodeModifier.STATIC))
                                .withAnnotations(listOf(visibleAnnotation(Simple.class,
                                        values("value", new Object[]{
                                                enumValue(MyEnum.class, "A")
                                        }))))
                                .withType(Types.STRING)
                                .withName("field")
                                .withValue(Literals.NULL)
                                .build()
                ))
                .build();

        return Pair.of(typeDeclaration, sourceOfParts(typeDeclaration));
    }

    public enum MyEnum {
        A,
        B,
        C
    }

    public @interface Simple {
        MyEnum[] value() default {};

        MyEnum myEnum() default MyEnum.A;
    }

}
