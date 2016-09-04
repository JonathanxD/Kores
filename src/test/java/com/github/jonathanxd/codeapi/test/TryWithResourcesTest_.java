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

import com.github.jonathanxd.codeapi.CodeAPI;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.common.CodeModifier;
import com.github.jonathanxd.codeapi.common.CodeParameter;
import com.github.jonathanxd.codeapi.common.TypeSpec;
import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.helper.Helper;
import com.github.jonathanxd.codeapi.helper.PredefinedTypes;
import com.github.jonathanxd.codeapi.impl.CodeClass;
import com.github.jonathanxd.codeapi.impl.CodeConstructor;
import com.github.jonathanxd.codeapi.impl.CodeField;
import com.github.jonathanxd.codeapi.impl.CodeMethod;
import com.github.jonathanxd.codeapi.impl.TryWithResourcesImpl;
import com.github.jonathanxd.codeapi.interfaces.TryWithResources;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.types.PlainCodeType;
import com.github.jonathanxd.iutils.annotations.Named;
import com.github.jonathanxd.iutils.object.Bi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;

import static com.github.jonathanxd.codeapi.CodeAPI.aClass;
import static com.github.jonathanxd.codeapi.CodeAPI.annotations;
import static com.github.jonathanxd.codeapi.CodeAPI.enumValue;
import static com.github.jonathanxd.codeapi.CodeAPI.sourceOfParts;
import static com.github.jonathanxd.codeapi.CodeAPI.values;
import static com.github.jonathanxd.codeapi.CodeAPI.visibleAnnotation;
import static java.lang.reflect.Modifier.PUBLIC;

/**
 * Created by jonathan on 03/09/16.
 */
public class TryWithResourcesTest_ {
    //

    public static Bi<@Named("Main class") CodeClass, @Named("Source") CodeSource> $() {

        TryWithResources tryWithResources = new TryWithResourcesImpl(
                new CodeField("trm", Helper.getJavaType(Trm.class),
                        CodeAPI.invokeConstructor(
                                Trm.class
                        )),
                Helper.sourceOf(
                        CodeAPI.invokeVirtual(Trm.class, Helper.accessLocalVariable("trm", Trm.class), "read", new TypeSpec(PredefinedTypes.VOID))
                )
        );

        CodeClass codeClass = aClass(PUBLIC,
                "test.TryWithResourcesTestClass", codeClass1 -> sourceOfParts(
                        new CodeConstructor(codeClass1,
                                Collections.singletonList(CodeModifier.PUBLIC),
                                Collections.emptyList(),
                                Helper.sourceOf(
                                        tryWithResources
                                ))
                ));

        return new Bi<>(codeClass, sourceOfParts(codeClass));
    }


    public static class Trm implements AutoCloseable {

        public void read() throws Throwable {
            throw new IllegalStateException("Unable to read");
        }

        @Override
        public void close() throws Exception {
            throw new IllegalStateException("Failed to close");
        }
    }
}
