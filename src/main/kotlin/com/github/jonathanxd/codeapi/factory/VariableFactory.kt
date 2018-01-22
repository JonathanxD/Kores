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
@file:JvmName("VariableFactory")

package com.github.jonathanxd.codeapi.factory

import com.github.jonathanxd.codeapi.CodeInstruction
import com.github.jonathanxd.codeapi.base.CodeModifier
import com.github.jonathanxd.codeapi.base.VariableDeclaration
import com.github.jonathanxd.codeapi.common.CodeNothing
import java.lang.reflect.Type

/**
 * @see VariableDeclaration
 */
fun variable(
    modifiers: Set<CodeModifier>,
    type: Type,
    name: String,
    value: CodeInstruction
): VariableDeclaration =
    VariableDeclaration(modifiers = modifiers, value = value, name = name, variableType = type)

/**
 * @see VariableDeclaration
 */
fun variable(type: Type, name: String, value: CodeInstruction): VariableDeclaration =
    VariableDeclaration(modifiers = emptySet(), value = value, name = name, variableType = type)

/**
 * @see VariableDeclaration
 */
fun variable(type: Type, name: String): VariableDeclaration =
    VariableDeclaration(
        modifiers = emptySet(),
        value = CodeNothing,
        name = name,
        variableType = type
    )

