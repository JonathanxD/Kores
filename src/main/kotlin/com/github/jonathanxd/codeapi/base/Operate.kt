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
import com.github.jonathanxd.codeapi.builder.self
import com.github.jonathanxd.codeapi.common.CodeNothing
import com.github.jonathanxd.codeapi.operator.Operator
import com.github.jonathanxd.codeapi.operator.Operators
import com.github.jonathanxd.codeapi.type
import java.lang.reflect.Type

/**
 * Operate a value and return result of operation.
 *
 * @property target Target part to operate.
 * @property operation Operation.
 * @property value Second argument of the operation, may be [CodeNothing].
 * Some operations may not require a second argument and some can behave different without them,
 * example, if a second argument is provided for [Operators.SUBTRACT], the operation
 * will be `target-value`, otherwise, if [CodeNothing] is provided, the operation will be `-target` (or negative target).
 */
data class Operate(
    val target: CodeInstruction,
    val operation: Operator.Math,
    override val value: CodeInstruction
) : ValueHolder, Typed, CodeInstruction {

    override val type: Type
        get() = this.target.type

    val hasSecondArg: Boolean
        get() = this.value != CodeNothing

    override fun builder(): Builder = Builder(this)

    class Builder() :
        ValueHolder.Builder<Operate, Builder>,
        Typed.Builder<Operate, Builder> {

        lateinit var target: CodeInstruction
        lateinit var operation: Operator.Math
        var value: CodeInstruction = CodeNothing

        constructor(defaults: Operate) : this() {
            this.target = defaults.target
            this.operation = defaults.operation
            this.value = defaults.value
        }

        override fun type(value: Type): Builder = self()

        /**
         * See [Operate.target]
         */
        fun target(value: CodeInstruction): Builder {
            this.target = value
            return this
        }

        /**
         * See [Operate.operation]
         */
        fun operation(value: Operator.Math): Builder {
            this.operation = value
            return this
        }

        override fun value(value: CodeInstruction): Builder {
            this.value = value
            return this
        }

        override fun build(): Operate = Operate(this.target, this.operation, this.value)

        companion object {
            @JvmStatic
            fun builder(): Builder = Builder()

            @JvmStatic
            fun builder(defaults: Operate): Builder = Builder(defaults)
        }

    }

}
