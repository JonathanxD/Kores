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
package com.github.jonathanxd.codeapi.gen.value

import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.common.Data
import com.github.jonathanxd.codeapi.gen.Appender

/**
 * Value.
 *
 * A value is a holder of information.
 *
 * Values can have different behaviors, a value process the provided information and generate the
 * [TARGET] object directly or indirectly.
 *
 * @param T        Type of value.
 * @param TARGET   Target object type.
 * @param C        Generator type.
 */
interface Value<out T, TARGET, in C> {

    /**
     * Gets the value.
     *
     * @return Value.
     */
    val value: T

    /**
     * Apply the information.
     *
     * @param value          Current value.
     * @param generator      Generator.
     * @param appender       Appender.
     * @param codeSourceData Data of the source.
     * @param data           Data of the processing environment.
     */
    fun apply(value: CodePart, generator: C, appender: Appender<TARGET>, codeSourceData: CodeSourceData, data: Data)
}
