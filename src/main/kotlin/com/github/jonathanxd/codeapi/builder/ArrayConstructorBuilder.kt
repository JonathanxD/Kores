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

import com.github.jonathanxd.codeapi.base.impl.ArrayConstructorImpl
import com.github.jonathanxd.codeapi.base.ArrayConstructor

// Generated by BuilderGen
open class ArrayConstructorBuilder(): ArrayConstructor.Builder<ArrayConstructor, ArrayConstructorBuilder> {

    /**
     * See [ArrayConstructor.arguments]
     */
    var arguments: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart> = emptyList()

    /**
     * See [ArrayConstructor.arrayType]
     */
    lateinit var arrayType: com.github.jonathanxd.codeapi.type.CodeType

    /**
     * See [ArrayConstructor.dimensions]
     */
    var dimensions: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart> = emptyList()

    constructor(defaults: ArrayConstructor) : this() {
        this.arguments = defaults.arguments
        this.arrayType = defaults.arrayType
        this.dimensions = defaults.dimensions
    }


    /**
     * See [ArrayConstructor.arguments]
     */
    override fun withArguments(value: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart>): ArrayConstructorBuilder {
        this.arguments = value
        return this
    }


    /**
     * See [ArrayConstructor.arguments]
     */
    override fun withArguments(vararg values: com.github.jonathanxd.codeapi.CodePart): ArrayConstructorBuilder {
        this.arguments = values.toList()
        return this
    }


    /**
     * See [ArrayConstructor.arrayType]
     */
    override fun withArrayType(value: com.github.jonathanxd.codeapi.type.CodeType): ArrayConstructorBuilder {
        this.arrayType = value
        return this
    }


    /**
     * See [ArrayConstructor.dimensions]
     */
    override fun withDimensions(value: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart>): ArrayConstructorBuilder {
        this.dimensions = value
        return this
    }


    /**
     * See [ArrayConstructor.dimensions]
     */
    override fun withDimensions(vararg values: com.github.jonathanxd.codeapi.CodePart): ArrayConstructorBuilder {
        this.dimensions = values.toList()
        return this
    }

    override fun build(): ArrayConstructor = ArrayConstructorImpl(
            arguments = this.arguments,
            arrayType = this.arrayType,
            dimensions = this.dimensions
    )


    companion object {
        @JvmStatic
        fun builder() = ArrayConstructorBuilder()
    }
}