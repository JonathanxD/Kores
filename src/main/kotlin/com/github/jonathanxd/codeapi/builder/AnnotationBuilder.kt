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
package com.github.jonathanxd.codeapi.builder

import com.github.jonathanxd.codeapi.base.impl.AnnotationImpl
import com.github.jonathanxd.codeapi.base.Annotation

// Generated by BuilderGen
class AnnotationBuilder(): Builder<Annotation, AnnotationBuilder>() {

    /**
     * See [Annotation.visible]
     */
    var visible: kotlin.Boolean = false

    /**
     * See [Annotation.type]
     */
    lateinit var type: com.github.jonathanxd.codeapi.type.CodeType

    /**
     * See [Annotation.values]
     */
    lateinit var values: kotlin.collections.Map<kotlin.String, kotlin.Any>

    constructor(defaults: Annotation) : this() {
        this.visible = defaults.visible
        this.type = defaults.type
        this.values = defaults.values
    }


    /**
     * See [Annotation.visible]
     */
    fun withVisible(value: kotlin.Boolean): AnnotationBuilder {
        this.visible = value
        return this
    }


    /**
     * See [Annotation.type]
     */
    fun withType(value: com.github.jonathanxd.codeapi.type.CodeType): AnnotationBuilder {
        this.type = value
        return this
    }


    /**
     * See [Annotation.values]
     */
    fun withValues(value: kotlin.collections.Map<kotlin.String, kotlin.Any>): AnnotationBuilder {
        this.values = value
        return this
    }

    override fun build(): Annotation = AnnotationImpl(
            visible = this.visible,
            type = this.type,
            values = this.values
    )
}