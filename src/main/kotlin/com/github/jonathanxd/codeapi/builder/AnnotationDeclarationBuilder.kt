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

import com.github.jonathanxd.codeapi.base.impl.AnnotationDeclarationImpl
import com.github.jonathanxd.codeapi.base.AnnotationDeclaration

// Generated by BuilderGen
class AnnotationDeclarationBuilder(): Builder<AnnotationDeclaration, AnnotationDeclarationBuilder>() {

    /**
     * See [AnnotationDeclaration.qualifiedName]
     */
    lateinit var qualifiedName: kotlin.String

    /**
     * See [AnnotationDeclaration.properties]
     */
    var properties: kotlin.collections.List<com.github.jonathanxd.codeapi.base.AnnotationProperty> = emptyList()

    /**
     * See [AnnotationDeclaration.annotations]
     */
    var annotations: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation> = emptyList()

    /**
     * See [AnnotationDeclaration.body]
     */
    var body: com.github.jonathanxd.codeapi.CodeSource? = null

    /**
     * See [AnnotationDeclaration.modifiers]
     */
    var modifiers: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier> = emptySet()

    /**
     * See [AnnotationDeclaration.genericSignature]
     */
    lateinit var genericSignature: com.github.jonathanxd.codeapi.generic.GenericSignature

    /**
     * See [AnnotationDeclaration.outerClass]
     */
    var outerClass: com.github.jonathanxd.codeapi.type.CodeType? = null

    constructor(defaults: AnnotationDeclaration) : this() {
        this.qualifiedName = defaults.qualifiedName
        this.properties = defaults.properties
        this.annotations = defaults.annotations
        this.body = defaults.body
        this.modifiers = defaults.modifiers
        this.genericSignature = defaults.genericSignature
        this.outerClass = defaults.outerClass
    }


    /**
     * See [AnnotationDeclaration.qualifiedName]
     */
    fun withQualifiedName(value: kotlin.String): AnnotationDeclarationBuilder {
        this.qualifiedName = value
        return this
    }


    /**
     * See [AnnotationDeclaration.properties]
     */
    fun withProperties(value: kotlin.collections.List<com.github.jonathanxd.codeapi.base.AnnotationProperty>): AnnotationDeclarationBuilder {
        this.properties = value
        return this
    }


    /**
     * See [AnnotationDeclaration.annotations]
     */
    fun withAnnotations(value: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation>): AnnotationDeclarationBuilder {
        this.annotations = value
        return this
    }


    /**
     * See [AnnotationDeclaration.body]
     */
    fun withBody(value: com.github.jonathanxd.codeapi.CodeSource?): AnnotationDeclarationBuilder {
        this.body = value
        return this
    }


    /**
     * See [AnnotationDeclaration.modifiers]
     */
    fun withModifiers(value: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier>): AnnotationDeclarationBuilder {
        this.modifiers = value
        return this
    }


    /**
     * See [AnnotationDeclaration.genericSignature]
     */
    fun withGenericSignature(value: com.github.jonathanxd.codeapi.generic.GenericSignature): AnnotationDeclarationBuilder {
        this.genericSignature = value
        return this
    }


    /**
     * See [AnnotationDeclaration.outerClass]
     */
    fun withOuterClass(value: com.github.jonathanxd.codeapi.type.CodeType?): AnnotationDeclarationBuilder {
        this.outerClass = value
        return this
    }

    override fun build(): AnnotationDeclaration = AnnotationDeclarationImpl(
            qualifiedName = this.qualifiedName,
            properties = this.properties,
            annotations = this.annotations,
            body = this.body,
            modifiers = this.modifiers,
            genericSignature = this.genericSignature,
            outerClass = this.outerClass
    )
}