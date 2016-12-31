/*
 *      CodeAPI - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2016 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/ & https://github.com/TheRealBuggy/) <jonathan.scripter@programmer.net>
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

import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.builder.ArrayStoreBuilder
import com.github.jonathanxd.codeapi.helper.Helper
import com.github.jonathanxd.codeapi.literals.Literals
import com.github.jonathanxd.codeapi.types.CodeType
import com.github.jonathanxd.codeapi.util.CodePartUtil
import com.github.jonathanxd.iutils.optional.Require

/**
 * Constructor of array type.
 */
interface ArrayConstructor : ArgumentHolder, Typed {

    /**
     * Type of the array.
     */
    val arrayType: CodeType

    /**
     * Array dimensions
     */
    val dimensions: Array<CodePart>

    /**
     * Array values
     */
    val arrayValues: List<ArrayStore>
        get() {
            val arguments = this.arguments
            val arrayStores = mutableListOf<ArrayStore>()

            for (i in arguments.indices) {
                val argument = arguments[i]

                val argumentValue = Require.require(argument.value)

                arrayStores.add(
                        ArrayStoreBuilder().build {
                            arrayType = this@ArrayConstructor.arrayType.toArray(this@ArrayConstructor.dimensions.size)
                            target = null
                            index = Literals.INT(i)
                            valueType = argument.type.orElse(CodePartUtil.getType(argumentValue))
                            value = argumentValue
                        }
                )
            }

            return arrayStores
        }

    override val type: CodeType?
        get() = this.arrayType

    override val array: Boolean
        get() = true
}