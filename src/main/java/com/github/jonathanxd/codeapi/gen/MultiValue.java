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
package com.github.jonathanxd.codeapi.gen;

import com.github.jonathanxd.codeapi.util.Data;

import java.util.List;

/**
 * Created by jonathan on 09/05/16.
 */
public class MultiValue<TARGET, C extends AbstractGenerator<TARGET, C>> implements Value<List<Value<?, TARGET, C>>, TARGET, C> {

    private final List<Value<?, TARGET, C>> value;

    public MultiValue(List<Value<?, TARGET, C>> value) {
        this.value = value;
    }

    public static <TARGET, C extends AbstractGenerator<TARGET, C>> Value<List<Value<?, TARGET, C>>, TARGET, C> create(List<Value<?, TARGET, C>> value) {
        return new MultiValue<>(value);
    }

    @Override
    public void apply(TARGET value, C generator, Appender<TARGET> appender, CodeSourceData codeSourceData, Data data) {
        //println
        for (Value<?, TARGET, C> g : this.getValue()) {
            g.apply(value, generator, appender, codeSourceData, data);
        }
    }

    @Override
    public List<Value<?, TARGET, C>> getValue() {
        return value;
    }
}
