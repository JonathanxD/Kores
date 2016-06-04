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

import com.github.jonathanxd.codeapi.gen.Generator;
import com.github.jonathanxd.codeapi.gen.TargetValue;
import com.github.jonathanxd.codeapi.gen.Value;
import com.github.jonathanxd.codeapi.gen.common.PlainSourceGenerator;
import com.github.jonathanxd.codeapi.impl.CodeClass;
import com.github.jonathanxd.codeapi.impl.CodeInterface;
import com.github.jonathanxd.codeapi.interfaces.Bodied;
import com.github.jonathanxd.codeapi.interfaces.Extender;
import com.github.jonathanxd.codeapi.interfaces.Implementer;
import com.github.jonathanxd.codeapi.interfaces.Modifierable;
import com.github.jonathanxd.codeapi.interfaces.Named;
import com.github.jonathanxd.codeapi.keywords.Keyword;
import com.github.jonathanxd.codeapi.util.CodeSourceData;
import com.github.jonathanxd.codeapi.util.Data;
import com.github.jonathanxd.codeapi.util.Parent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jonathan on 09/05/16.
 */
public class ClassSourceGenerator implements Generator<CodeClass, String, PlainSourceGenerator> {

    public static final ClassSourceGenerator INSTANCE = new ClassSourceGenerator();

    private ClassSourceGenerator() {
    }

    @Override
    public List<Value<?, String, PlainSourceGenerator>> gen(CodeClass codeClass, PlainSourceGenerator plainSourceGenerator, Parent<Generator<?, String, PlainSourceGenerator>> parents, CodeSourceData codeSourceData, Data data) {

        List<Value<?, String, PlainSourceGenerator>> values = new ArrayList<>(Arrays.asList(
                TargetValue.create(Modifierable.class, codeClass, parents),

                TargetValue.create(Keyword.class, codeClass.getKeyword(), parents),

                TargetValue.create(Named.class, codeClass, parents),
                TargetValue.create(Extender.class, codeClass, parents),
                TargetValue.create(Implementer.class, codeClass, parents),

                TargetValue.create(Bodied.class, codeClass, parents)
        ));

        return values;
        /*
        plainSourceGenerator.generateTo(Modifierable.class, codeInterface) +
                " interface " +
                plainSourceGenerator.generateTo(Named.class, codeInterface) + " " +
                plainSourceGenerator.generateTo(Implementer.class, codeInterface);
                */
    }

}
