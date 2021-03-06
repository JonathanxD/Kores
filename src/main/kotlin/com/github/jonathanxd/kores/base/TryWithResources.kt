/*
 *      Kores - Java source and Bytecode generation framework <https://github.com/JonathanxD/Kores>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2021 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/) <jonathan.scripter@programmer.net>
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
package com.github.jonathanxd.kores.base

import com.github.jonathanxd.kores.Instructions

/**
 * Try-with-resources
 *
 * @property variable Variable to try-with-resources (value must be [AutoCloseable]).
 * @property body Body of try-with-resources
 * @property catchStatements Catch clauses/Exception handlers
 * @property finallyStatement Finally statement (in bytecode generator the finally statement is inlined).
 */
data class TryWithResources(
    val variable: VariableDeclaration,
    override val body: Instructions,
    override val catchStatements: List<CatchStatement>,
    override val finallyStatement: Instructions
) : TryStatementBase {
    init {
        BodyHolder.checkBody(this)
    }

    override fun builder(): Builder = Builder(this)

    class Builder() : TryStatementBase.Builder<TryWithResources, Builder> {

        lateinit var variable: VariableDeclaration
        var body: Instructions = Instructions.empty()
        var catchStatements: List<CatchStatement> = emptyList()
        var finallyStatement: Instructions = Instructions.empty()

        constructor(defaults: TryWithResources) : this() {
            this.variable = defaults.variable
            this.body = defaults.body
            this.catchStatements = defaults.catchStatements
            this.finallyStatement = defaults.finallyStatement
        }

        /**
         * See [TryWithResources.variable]
         */
        fun variable(value: VariableDeclaration): Builder {
            this.variable = value
            return this
        }

        override fun body(value: Instructions): Builder {
            this.body = value
            return this
        }

        override fun catchStatements(value: List<CatchStatement>): Builder {
            this.catchStatements = value
            return this
        }

        override fun finallyStatement(value: Instructions): Builder {
            this.finallyStatement = value
            return this
        }

        override fun build(): TryWithResources =
            TryWithResources(this.variable, this.body, this.catchStatements, this.finallyStatement)

        companion object {
            @JvmStatic
            fun builder(): Builder = Builder()

            @JvmStatic
            fun builder(defaults: TryWithResources): Builder = Builder(defaults)
        }

    }
}

