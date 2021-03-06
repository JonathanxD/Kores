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
package com.github.jonathanxd.kores.common

import com.github.jonathanxd.kores.Instruction
import com.github.jonathanxd.kores.base.Typed
import com.github.jonathanxd.kores.base.TypedInstruction
import com.github.jonathanxd.kores.builder.self
import com.github.jonathanxd.kores.type.koresType
import java.lang.reflect.Type

/**
 * To avoid confusion with kotlin nothing
 */
typealias KoresNothing = Nothing

/**
 * Nothing for values (some parts may not support nothing as value).
 */
object Nothing : TypedInstruction {

    override val type: Type
        get() = Nothing::class.java.koresType

    override fun builder(): Builder = Builder

    object Builder : Typed.Builder<Nothing, Builder> {

        override fun type(value: Type): Builder = self()

        override fun build(): Nothing = Nothing
    }

}