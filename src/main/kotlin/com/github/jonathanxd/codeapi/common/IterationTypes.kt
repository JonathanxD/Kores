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
package com.github.jonathanxd.codeapi.common

import com.github.jonathanxd.codeapi.CodeSource
import com.github.jonathanxd.codeapi.Defaults
import com.github.jonathanxd.codeapi.MutableCodeSource
import com.github.jonathanxd.codeapi.base.ForEachStatement
import com.github.jonathanxd.codeapi.base.impl.*
import com.github.jonathanxd.codeapi.gen.PartProcessor
import com.github.jonathanxd.codeapi.helper.PredefinedTypes
import com.github.jonathanxd.codeapi.literals.Literals
import com.github.jonathanxd.codeapi.operators.Operators
import com.github.jonathanxd.codeapi.util.CodePartUtil
import com.github.jonathanxd.codeapi.util.HiddenField

/**
 * Common [IterationTypes][IterationType]
 */
object IterationTypes {

    /**
     * Iterate a array
     */
    val ARRAY: IterationType = ArrayIterationType

    /**
     * Iterate a Iterable element.
     */
    val ITERABLE_ELEMENT: IterationType = IterableIterationType

    object ArrayIterationType : IterationType {
        override fun createGenerator(): IterationType.Generator = Generator()

        class Generator : IterationType.Generator {
            private var indexFields = 0

            override fun generate(forEachBlock: ForEachStatement, processor: PartProcessor): CodeSource? {
                val fieldName = "\$index#" + (++indexFields)
                val indexFieldDecl = HiddenField(fieldName, PredefinedTypes.INT, Literals.INT(0))
                val accessIndex = VariableAccessImpl(
                        target = Defaults.ACCESS_LOCAL,
                        localization = null,
                        name = indexFieldDecl.name,
                        variableType = indexFieldDecl.type
                )

                val condition = IfExprImpl(
                        expr1 = accessIndex,
                        operation = Operators.LESS_THAN,
                        expr2 = ArrayLengthImpl(arrayType = CodePartUtil.getType(forEachBlock.iterableElement), target = forEachBlock.iterableElement)
                )

                val update = VariableOperateImpl(
                        target = Defaults.ACCESS_LOCAL,
                        localization = null,
                        name = indexFieldDecl.name,
                        variableType = indexFieldDecl.type,
                        operation = Operators.INCREMENT,
                        value = null
                )

                val body = MutableCodeSource()

                val field = forEachBlock.variable

                body.add(FieldDeclarationImpl(
                        name = field.name,
                        variableType = field.variableType,
                        value = ArrayLoadImpl(
                                arrayType = CodePartUtil.getType(forEachBlock.iterableElement),
                                target = forEachBlock.iterableElement,
                                index = accessIndex,
                                valueType = field.variableType
                        ),
                        annotations = emptyList(),
                        modifiers = emptyList()
                ))

                forEachBlock.body?.let {
                    body.addAll(it)
                }

                return CodeSource.fromPart(ForStatementImpl(
                        forInit = indexFieldDecl,
                        forExpression = listOf(condition),
                        forUpdate = update,
                        body = body
                ))
            }
        }

    }


    object IterableIterationType : IterationType {

        override fun createGenerator(): IterationType.Generator = Generator()

        class Generator : IterationType.Generator {
            private var iterFields = 0

            override fun generate(forEachBlock: ForEachStatement, processor: PartProcessor): CodeSource? {
                val fieldName = "\$iter#" + (++iterFields)
                val iterFieldDecl = HiddenField(fieldName, PredefinedTypes.ITERATOR, Literals.INT(0))
                val accessIter = VariableAccessImpl(
                        target = Defaults.ACCESS_LOCAL,
                        localization = null,
                        name = iterFieldDecl.name,
                        variableType = iterFieldDecl.type
                )

                // Iterator.hasNext()Z
                val hasNext = MethodInvocationImpl(
                        localization = PredefinedTypes.ITERATOR,
                        invokeType = InvokeType.INVOKE_INTERFACE,
                        target = accessIter,
                        invokeDynamic = null,
                        arguments = emptyList(),
                        spec = MethodSpecificationImpl(
                                methodName = "hasNext",
                                description = TypeSpec(PredefinedTypes.BOOLEAN),
                                methodType = MethodType.METHOD
                        )
                )

                val condition = IfExprImpl(
                        expr1 = hasNext,
                        operation = Operators.EQUAL_TO,
                        expr2 = Literals.TRUE
                )

                val body = MutableCodeSource()

                val field = forEachBlock.variable

                // Iterator.next()Ljava/lang/Object;
                val next = MethodInvocationImpl(
                        localization = PredefinedTypes.ITERATOR,
                        invokeType = InvokeType.INVOKE_INTERFACE,
                        target = accessIter,
                        arguments = emptyList(),
                        invokeDynamic = null,
                        spec = MethodSpecificationImpl(
                                methodName = "next",
                                description = TypeSpec(PredefinedTypes.OBJECT),
                                methodType = MethodType.METHOD
                        )
                )

                // #Type Field_Name = (#Type) Iterator.next()Ljava/lang/Object;
                val eachField = FieldDeclarationImpl(
                        modifiers = emptyList(),
                        annotations = emptyList(),
                        name = field.name,
                        variableType = field.variableType,
                        value = CastImpl(
                                originalType = PredefinedTypes.OBJECT,
                                castedPart = next,
                                targetType = field.variableType
                        )
                )


                body.add(eachField)

                forEachBlock.body?.let {
                    body.addAll(it)
                }

                return CodeSource.fromPart(ForStatementImpl(
                        forInit = iterFieldDecl,
                        forExpression = listOf(condition),
                        forUpdate = null,
                        body = body
                ))
            }
        }

    }
}