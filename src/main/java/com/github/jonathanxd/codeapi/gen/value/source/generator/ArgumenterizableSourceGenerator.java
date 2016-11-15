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
package com.github.jonathanxd.codeapi.gen.value.source.generator;

import com.github.jonathanxd.codeapi.common.CodeArgument;
import com.github.jonathanxd.codeapi.gen.value.CodeSourceData;
import com.github.jonathanxd.codeapi.gen.value.PlainValue;
import com.github.jonathanxd.codeapi.gen.value.TargetValue;
import com.github.jonathanxd.codeapi.gen.value.Value;
import com.github.jonathanxd.codeapi.gen.value.ValueGenerator;
import com.github.jonathanxd.codeapi.gen.value.source.PlainSourceGenerator;
import com.github.jonathanxd.codeapi.interfaces.Argumenterizable;
import com.github.jonathanxd.codeapi.util.Parent;
import com.github.jonathanxd.iutils.data.MapData;
import com.github.jonathanxd.iutils.optional.Require;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jonathan on 09/05/16.
 */
public class ArgumenterizableSourceGenerator implements ValueGenerator<Argumenterizable, String, PlainSourceGenerator> {

    public static final ArgumenterizableSourceGenerator INSTANCE = new ArgumenterizableSourceGenerator();

    private static final String NORMAL_OPEN_TAG = "(";
    private static final String NORMAL_CLOSE_TAG = ")";

    private static final String ARRAY_OPEN_TAG = "{";
    private static final String ARRAY_CLOSE_TAG = "}";

    private ArgumenterizableSourceGenerator() {
    }

    @Override
    public List<Value<?, String, PlainSourceGenerator>> gen(Argumenterizable argumenterizable, PlainSourceGenerator plainSourceGenerator, Parent<ValueGenerator<?, String, PlainSourceGenerator>> parents, CodeSourceData codeSourceData, MapData data) {

        List<Value<?, String, PlainSourceGenerator>> values = new ArrayList<>();

        String OPEN_TOKEN = argumenterizable.isArray() ? ARRAY_OPEN_TAG : NORMAL_OPEN_TAG;
        String CLOSE_TOKEN = argumenterizable.isArray() ? ARRAY_CLOSE_TAG : NORMAL_CLOSE_TAG;

        values.add(PlainValue.create(OPEN_TOKEN));

        Collection<CodeArgument> arguments = argumenterizable.getArguments();

        Iterator<CodeArgument> iterator = arguments.iterator();

        while (iterator.hasNext()) {
            CodeArgument argument = iterator.next();

            if (argument.isCasted()) {
                values.add(PlainValue.create(OPEN_TOKEN + Require.require(argument.getType()).getCanonicalName() + CLOSE_TOKEN));
            }

            values.add(TargetValue.create(Require.require(argument.getValue()).getClass(), Require.require(argument.getValue()), parents));

            if (iterator.hasNext())
                values.add(PlainValue.create(", "));

        }

        values.add(PlainValue.create(CLOSE_TOKEN));

        return values;
    }

}