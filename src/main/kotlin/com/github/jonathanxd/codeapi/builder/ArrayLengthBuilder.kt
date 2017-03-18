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
package com.github.jonathanxd.codeapi.builder

import com.github.jonathanxd.codeapi.base.ArrayLength
import com.github.jonathanxd.codeapi.base.impl.ArrayLengthImpl

// Generated by BuilderGen
open class ArrayLengthBuilder() : ArrayLength.Builder<ArrayLength, ArrayLengthBuilder> {

    /**
     * See [ArrayLength.arrayType]
     */
    lateinit var arrayType: com.github.jonathanxd.codeapi.type.CodeType

    /**
     * See [ArrayLength.target]
     */
    lateinit var target: com.github.jonathanxd.codeapi.CodePart

    constructor(defaults: ArrayLength) : this() {
        this.arrayType = defaults.arrayType
        this.target = defaults.target
    }


    /**
     * See [ArrayLength.arrayType]
     */
    override fun withArrayType(value: com.github.jonathanxd.codeapi.type.CodeType): ArrayLengthBuilder {
        this.arrayType = value
        return this
    }


    /**
     * See [ArrayLength.target]
     */
    override fun withTarget(value: com.github.jonathanxd.codeapi.CodePart): ArrayLengthBuilder {
        this.target = value
        return this
    }

    override fun build(): ArrayLength = ArrayLengthImpl(
            arrayType = this.arrayType,
            target = this.target
    )


    companion object {
        @JvmStatic
        fun builder() = ArrayLengthBuilder()
    }
}