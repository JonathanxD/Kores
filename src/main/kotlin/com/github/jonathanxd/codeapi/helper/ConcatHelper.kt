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

import com.github.jonathanxd.codeapi.CodeInstruction
import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.base.Concat
import com.github.jonathanxd.codeapi.literal.Literals
import java.util.*

/**
 * Concatenation helper.
 */
class ConcatHelper private constructor() {

    private val concatenations = ArrayList<CodeInstruction>()

    /**
     * Concatenate [codePart].
     */
    fun concat(codePart: CodeInstruction): ConcatHelper {
        this.concatenations.add(codePart)
        return this
    }

    /**
     * Concatenate [str].
     */
    fun concat(str: String): ConcatHelper {
        this.concatenations.add(Literals.STRING(str))
        return this
    }

    /**
     * Builds [Concat] instance with concatenations.
     */
    fun build(): Concat {
        return Concat(this.concatenations)
    }

    companion object {

        /**
         * Creates a [ConcatHelper] instance.
         */
        @JvmStatic
        fun builder(): ConcatHelper {
            return ConcatHelper()
        }

        /**
         * Creates a [ConcatHelper] instance and concatenate [part].
         */
        @JvmStatic
        fun builder(part: CodeInstruction): ConcatHelper {
            val concatHelper = ConcatHelper()

            return concatHelper.concat(part)
        }

        /**
         * Creates a [ConcatHelper] instance and concatenate [str].
         */
        @JvmStatic
        fun builder(str: String): ConcatHelper {
            val concatHelper = ConcatHelper()

            return concatHelper.concat(str)
        }
    }
}
