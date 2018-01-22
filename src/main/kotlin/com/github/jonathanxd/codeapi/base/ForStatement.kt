/*
 *      CodeAPI - Java source and Bytecode generation framework <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2018 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/) <jonathan.scripter@programmer.net>
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
package com.github.jonathanxd.codeapi.base

import com.github.jonathanxd.codeapi.CodeInstruction
import com.github.jonathanxd.codeapi.CodeSource

/**
 * For statement.
 *
 * for(forInit; forExpression; forUpdate)
 *
 * @property forInit For initialization (ex: `int i = 0`, `int i = 0, x = 9`).
 * @property forExpression For expression. See [IfExpressionHolder.expressions]. (ex: `i < 10`)
 * @property forUpdate For update. (ex: `i++`, `i++. x++`)
 * @property body Body of for statement (ex: `println(i)`).
 */
data class ForStatement(
    val forInit: List<CodeInstruction>,
    val forExpression: List<CodeInstruction>,
    val forUpdate: List<CodeInstruction>,
    override val body: CodeSource
) : IfExpressionHolder, BodyHolder, CodeInstruction {
    init {
        BodyHolder.checkBody(this)
    }

    override val expressions: List<CodeInstruction>
        get() = this.forExpression

    override fun builder(): Builder = Builder(this)

    class Builder() :
        IfExpressionHolder.Builder<ForStatement, Builder>,
        BodyHolder.Builder<ForStatement, Builder> {

        var forInit: List<CodeInstruction> = emptyList()
        var forExpression: List<CodeInstruction> = emptyList()
        var forUpdate: List<CodeInstruction> = emptyList()
        var body: CodeSource = CodeSource.empty()

        constructor(defaults: ForStatement) : this() {
            this.forInit = defaults.forInit
            this.forExpression = defaults.forExpression
            this.forUpdate = defaults.forUpdate
        }

        override fun expressions(value: List<CodeInstruction>): Builder = this.forExpression(value)

        override fun expressions(vararg values: CodeInstruction): Builder =
            this.forExpression(values.toList())

        /**
         * See [ForStatement.forInit]
         */
        fun forInit(value: List<CodeInstruction>): Builder {
            this.forInit = value
            return this
        }

        /**
         * See [ForStatement.forInit]
         */
        fun forInit(vararg values: CodeInstruction): Builder = forInit(values.toList())

        /**
         * See [ForStatement.forExpression]
         */
        fun forExpression(value: List<CodeInstruction>): Builder {
            this.forExpression = value
            return this
        }

        /**
         * See [ForStatement.forExpression]
         */
        fun forExpression(vararg values: CodeInstruction): Builder = forExpression(values.toList())

        /**
         * See [ForStatement.forUpdate]
         */
        fun forUpdate(value: List<CodeInstruction>): Builder {
            this.forUpdate = value
            return this
        }

        /**
         * See [ForStatement.forUpdate]
         */
        fun forUpdate(vararg values: CodeInstruction): Builder = forUpdate(values.toList())

        override fun body(value: CodeSource): Builder {
            this.body = value
            return this
        }

        override fun build(): ForStatement =
            ForStatement(this.forInit, this.forExpression, this.forUpdate, this.body)

        companion object {
            @JvmStatic
            fun builder(): Builder = Builder()

            @JvmStatic
            fun builder(defaults: ForStatement): Builder = Builder(defaults)
        }

    }
}
