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

import com.github.jonathanxd.codeapi.base.SwitchStatement
import com.github.jonathanxd.codeapi.base.impl.SwitchStatementImpl

// Generated by BuilderGen
open class SwitchStatementBuilder() : SwitchStatement.Builder<SwitchStatement, SwitchStatementBuilder> {

    /**
     * See [SwitchStatement.value]
     */
    lateinit var value: com.github.jonathanxd.codeapi.base.Typed

    /**
     * See [SwitchStatement.switchType]
     */
    lateinit var switchType: com.github.jonathanxd.codeapi.common.SwitchType

    /**
     * See [SwitchStatement.cases]
     */
    var cases: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Case> = emptyList()

    constructor(defaults: SwitchStatement) : this() {
        this.value = defaults.value
        this.switchType = defaults.switchType
        this.cases = defaults.cases
    }


    /**
     * See [SwitchStatement.value]
     */
    override fun withValue(value: com.github.jonathanxd.codeapi.base.Typed): SwitchStatementBuilder {
        this.value = value
        return this
    }


    /**
     * See [SwitchStatement.switchType]
     */
    override fun withSwitchType(value: com.github.jonathanxd.codeapi.common.SwitchType): SwitchStatementBuilder {
        this.switchType = value
        return this
    }


    /**
     * See [SwitchStatement.cases]
     */
    override fun withCases(value: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Case>): SwitchStatementBuilder {
        this.cases = value
        return this
    }


    /**
     * See [SwitchStatement.cases]
     */
    override fun withCases(vararg values: com.github.jonathanxd.codeapi.base.Case): SwitchStatementBuilder {
        this.cases = values.toList()
        return this
    }

    override fun build(): SwitchStatement = SwitchStatementImpl(
            value = this.value,
            switchType = this.switchType,
            cases = this.cases
    )


    companion object {
        @JvmStatic
        fun builder() = SwitchStatementBuilder()
    }
}