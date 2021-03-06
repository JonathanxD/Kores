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
package com.github.jonathanxd.kores.operator

import com.github.jonathanxd.kores.Instruction
import com.github.jonathanxd.kores.base.Named
import com.github.jonathanxd.iutils.string.ToStringHelper

/**
 * Operator.
 *
 * Example of operators: Increment, Decrement, Less_than, etc...
 */
sealed class Operator(override val name: String) : Instruction, Named {

    override fun toString(): String {
        return ToStringHelper.defaultHelper(this::class.java.simpleName)
            .add("name", this.name)
            .toString()
    }

    override fun builder(): Builder = Builder(this)

    /**
     * Mathematical operator
     */
    class Math(name: String) : Operator(name)

    /**
     * Conditional operator
     */
    class Conditional(name: String) : Operator(name)

    class Builder() : Named.Builder<Operator, Builder> {

        lateinit var name: String

        constructor(defaults: Operator) : this() {
            this.name = defaults.name
        }

        override fun name(value: String): Builder {
            this.name = value
            return this
        }

        override fun build(): Operator {
            return Operators.knownOperators[this.name]
                    ?: throw IllegalArgumentException("Cannot find operator: $name")
        }

    }
}
