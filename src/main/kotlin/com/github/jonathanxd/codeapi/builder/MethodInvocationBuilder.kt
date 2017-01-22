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

import com.github.jonathanxd.codeapi.base.impl.MethodInvocationImpl
import com.github.jonathanxd.codeapi.base.MethodInvocation

// Generated by BuilderGen
open class MethodInvocationBuilder(): MethodInvocation.Builder<MethodInvocation, MethodInvocationBuilder> {

    /**
     * See [MethodInvocation.localization]
     */
    lateinit var localization: com.github.jonathanxd.codeapi.type.CodeType

    /**
     * See [MethodInvocation.arguments]
     */
    var arguments: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart> = emptyList()

    /**
     * See [MethodInvocation.spec]
     */
    lateinit var spec: com.github.jonathanxd.codeapi.base.MethodSpecification

    /**
     * See [MethodInvocation.invokeType]
     */
    lateinit var invokeType: com.github.jonathanxd.codeapi.common.InvokeType

    /**
     * See [MethodInvocation.invokeDynamic]
     */
    var invokeDynamic: com.github.jonathanxd.codeapi.common.InvokeDynamic? = null

    /**
     * See [MethodInvocation.target]
     */
    lateinit var target: com.github.jonathanxd.codeapi.CodePart

    constructor(defaults: MethodInvocation) : this() {
        this.localization = defaults.localization
        this.arguments = defaults.arguments
        this.spec = defaults.spec
        this.invokeType = defaults.invokeType
        this.invokeDynamic = defaults.invokeDynamic
        this.target = defaults.target
    }


    /**
     * See [MethodInvocation.localization]
     */
    override fun withLocalization(value: com.github.jonathanxd.codeapi.type.CodeType): MethodInvocationBuilder {
        this.localization = value
        return this
    }


    /**
     * See [MethodInvocation.arguments]
     */
    override fun withArguments(value: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart>): MethodInvocationBuilder {
        this.arguments = value
        return this
    }


    /**
     * See [MethodInvocation.arguments]
     */
    override fun withArguments(vararg values: com.github.jonathanxd.codeapi.CodePart): MethodInvocationBuilder {
        this.arguments = values.toList()
        return this
    }


    /**
     * See [MethodInvocation.spec]
     */
    override fun withSpec(value: com.github.jonathanxd.codeapi.base.MethodSpecification): MethodInvocationBuilder {
        this.spec = value
        return this
    }


    /**
     * See [MethodInvocation.invokeType]
     */
    override fun withInvokeType(value: com.github.jonathanxd.codeapi.common.InvokeType): MethodInvocationBuilder {
        this.invokeType = value
        return this
    }


    /**
     * See [MethodInvocation.invokeDynamic]
     */
    override fun withInvokeDynamic(value: com.github.jonathanxd.codeapi.common.InvokeDynamic?): MethodInvocationBuilder {
        this.invokeDynamic = value
        return this
    }


    /**
     * See [MethodInvocation.target]
     */
    override fun withTarget(value: com.github.jonathanxd.codeapi.CodePart): MethodInvocationBuilder {
        this.target = value
        return this
    }

    override fun build(): MethodInvocation = MethodInvocationImpl(
            localization = this.localization,
            arguments = this.arguments,
            spec = this.spec,
            invokeType = this.invokeType,
            invokeDynamic = this.invokeDynamic,
            target = this.target
    )


    companion object {
        @JvmStatic
        fun builder() = MethodInvocationBuilder()
    }
}