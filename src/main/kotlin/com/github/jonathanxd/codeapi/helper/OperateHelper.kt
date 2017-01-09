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
package com.github.jonathanxd.codeapi.helper

import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.base.impl.OperateImpl
import com.github.jonathanxd.codeapi.operator.Operator
import com.github.jonathanxd.codeapi.operator.Operators

class OperateHelper private constructor(private var part: CodePart?) {

    /**
     * Plus (+).
     *
     * @param value 2nd value to add.
     * @return This.
     */
    operator fun plus(value: CodePart): OperateHelper {
        val operation = Operators.ADD

        return this.operate(operation, value)
    }

    /**
     * Subtract (-).
     *
     * @param value 2nd value to divide.
     * @return This.
     */
    fun subtract(value: CodePart): OperateHelper {
        val operation = Operators.SUBTRACT

        return this.operate(operation, value)
    }

    /**
     * Multiply (*)
     *
     * @param value 2nd value to divide.
     * @return This.
     */
    fun multiply(value: CodePart): OperateHelper {
        val operation = Operators.MULTIPLY

        return this.operate(operation, value)
    }

    /**
     * Multiply (/)
     *
     * @param value 2nd value to divide.
     * @return This.
     */
    fun divide(value: CodePart): OperateHelper {
        val operation = Operators.DIVISION

        return this.operate(operation, value)
    }

    /**
     * Remainder (%)
     *
     * @param value 2nd value to remainder.
     * @return This.
     */
    fun remainder(value: CodePart): OperateHelper {
        val operation = Operators.REMAINDER

        return this.operate(operation, value)
    }

    /**
     * Negate value.
     *
     * @return This.
     */
    fun neg(): OperateHelper {
        val operation = Operators.SUBTRACT

        return this.operate(operation, null)
    }

    // &
    /**
     * Inclusive or (&amp;).
     *
     * @param value 2nd value to operate.
     * @return This.
     */
    fun or(value: CodePart): OperateHelper {
        val operation = Operators.BITWISE_INCLUSIVE_OR

        return this.operate(operation, value)
    }

    // ^
    /**
     * Exclusive or (&#94;).
     *
     * @param value 2nd value to operate.
     * @return This.
     */
    fun xor(value: CodePart): OperateHelper {
        val operation = Operators.BITWISE_EXCLUSIVE_OR

        return this.operate(operation, value)
    }


    /**
     * Bitwise not (~).
     *
     * @param value 2nd value to operate.
     * @return This.
     */
    fun not(value: CodePart): OperateHelper {
        val operation = Operators.UNARY_BITWISE_COMPLEMENT

        return this.operate(operation, value)
    }

    // >>
    /**
     * Bitwise shift right (>>).
     *
     * @param value 2nd value to operate.
     * @return This.
     */
    fun shiftRight(value: CodePart): OperateHelper {
        val operation = Operators.SIGNED_RIGHT_SHIFT
        return this.operate(operation, value)
    }

    /**
     * Bitwise logical shift right (>>>).
     *
     * @param value 2nd value to operate.
     * @return This.
     */
    fun logicalShiftRight(value: CodePart): OperateHelper {
        val operation = Operators.UNSIGNED_RIGHT_SHIFT

        return this.operate(operation, value)
    }

    /**
     * Bitwise left shift (<<).
     *
     * @param value 2nd value to operate.
     * @return This.
     */
    fun leftShift(value: CodePart): OperateHelper {
        val operation = Operators.SIGNED_LEFT_SHIFT

        return this.operate(operation, value)
    }

    private fun operate(operation: Operator, value: CodePart?): OperateHelper {
        this.part = OperateImpl(this.part!!, operation, value)

        return this
    }

    fun build(): CodePart {
        return this.part!!
    }

    companion object {

        @JvmStatic
        fun builder(part: CodePart): OperateHelper {
            return OperateHelper(part)
        }
    }
}