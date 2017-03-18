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

import com.github.jonathanxd.codeapi.base.CatchStatement
import com.github.jonathanxd.codeapi.base.impl.CatchStatementImpl

// Generated by BuilderGen
open class CatchStatementBuilder() : CatchStatement.Builder<CatchStatement, CatchStatementBuilder> {

    /**
     * See [CatchStatement.exceptionTypes]
     */
    var exceptionTypes: kotlin.collections.List<com.github.jonathanxd.codeapi.type.CodeType> = emptyList()

    /**
     * See [CatchStatement.body]
     */
    var body: com.github.jonathanxd.codeapi.CodeSource = com.github.jonathanxd.codeapi.CodeSource.empty()

    /**
     * See [CatchStatement.variable]
     */
    lateinit var variable: com.github.jonathanxd.codeapi.base.VariableDeclaration

    constructor(defaults: CatchStatement) : this() {
        this.exceptionTypes = defaults.exceptionTypes
        this.body = defaults.body
        this.variable = defaults.variable
    }


    /**
     * See [CatchStatement.exceptionTypes]
     */
    override fun withExceptionTypes(value: kotlin.collections.List<com.github.jonathanxd.codeapi.type.CodeType>): CatchStatementBuilder {
        this.exceptionTypes = value
        return this
    }


    /**
     * See [CatchStatement.exceptionTypes]
     */
    override fun withExceptionTypes(vararg values: com.github.jonathanxd.codeapi.type.CodeType): CatchStatementBuilder {
        this.exceptionTypes = values.toList()
        return this
    }


    /**
     * See [CatchStatement.body]
     */
    override fun withBody(value: com.github.jonathanxd.codeapi.CodeSource): CatchStatementBuilder {
        this.body = value
        return this
    }


    /**
     * See [CatchStatement.variable]
     */
    override fun withVariable(value: com.github.jonathanxd.codeapi.base.VariableDeclaration): CatchStatementBuilder {
        this.variable = value
        return this
    }

    override fun build(): CatchStatement = CatchStatementImpl(
            exceptionTypes = this.exceptionTypes,
            body = this.body,
            variable = this.variable
    )


    companion object {
        @JvmStatic
        fun builder() = CatchStatementBuilder()
    }
}