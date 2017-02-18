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

import com.github.jonathanxd.codeapi.base.impl.ClassDeclarationImpl
import com.github.jonathanxd.codeapi.base.ClassDeclaration

// Generated by BuilderGen
open class ClassDeclarationBuilder(): ClassDeclaration.Builder<ClassDeclaration, ClassDeclarationBuilder> {

    /**
     * See [ClassDeclaration.superClass]
     */
    lateinit var superClass: com.github.jonathanxd.codeapi.type.CodeType

    /**
     * See [ClassDeclaration.implementations]
     */
    var implementations: kotlin.collections.List<com.github.jonathanxd.codeapi.type.CodeType> = emptyList()

    /**
     * See [ClassDeclaration.qualifiedName]
     */
    lateinit var qualifiedName: kotlin.String

    /**
     * See [ClassDeclaration.annotations]
     */
    var annotations: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation> = emptyList()

    /**
     * See [ClassDeclaration.body]
     */
    var body: com.github.jonathanxd.codeapi.CodeSource = com.github.jonathanxd.codeapi.CodeSource.empty()

    /**
     * See [ClassDeclaration.modifiers]
     */
    var modifiers: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier> = emptySet()

    /**
     * See [ClassDeclaration.genericSignature]
     */
    var genericSignature: com.github.jonathanxd.codeapi.generic.GenericSignature = com.github.jonathanxd.codeapi.generic.GenericSignature.empty()

    /**
     * See [ClassDeclaration.outerClass]
     */
    var outerClass: com.github.jonathanxd.codeapi.type.CodeType? = null

    /**
     * See [ClassDeclaration.comments]
     */
    lateinit var comments: com.github.jonathanxd.codeapi.base.comment.Comments

    constructor(defaults: ClassDeclaration) : this() {
        this.superClass = defaults.superClass
        this.implementations = defaults.implementations
        this.qualifiedName = defaults.qualifiedName
        this.annotations = defaults.annotations
        this.body = defaults.body
        this.modifiers = defaults.modifiers
        this.genericSignature = defaults.genericSignature
        this.outerClass = defaults.outerClass
        this.comments = defaults.comments
    }


    /**
     * See [ClassDeclaration.superClass]
     */
    override fun withSuperClass(value: com.github.jonathanxd.codeapi.type.CodeType?): ClassDeclarationBuilder {
        this.superClass = value!!
        return this
    }


    /**
     * See [ClassDeclaration.implementations]
     */
    override fun withImplementations(value: kotlin.collections.List<com.github.jonathanxd.codeapi.type.CodeType>): ClassDeclarationBuilder {
        this.implementations = value
        return this
    }


    /**
     * See [ClassDeclaration.implementations]
     */
    override fun withImplementations(vararg values: com.github.jonathanxd.codeapi.type.CodeType): ClassDeclarationBuilder {
        this.implementations = values.toList()
        return this
    }


    /**
     * See [ClassDeclaration.qualifiedName]
     */
    override fun withQualifiedName(value: kotlin.String): ClassDeclarationBuilder {
        this.qualifiedName = value
        return this
    }


    /**
     * See [ClassDeclaration.annotations]
     */
    override fun withAnnotations(value: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation>): ClassDeclarationBuilder {
        this.annotations = value
        return this
    }


    /**
     * See [ClassDeclaration.annotations]
     */
    override fun withAnnotations(vararg values: com.github.jonathanxd.codeapi.base.Annotation): ClassDeclarationBuilder {
        this.annotations = values.toList()
        return this
    }


    /**
     * See [ClassDeclaration.body]
     */
    override fun withBody(value: com.github.jonathanxd.codeapi.CodeSource): ClassDeclarationBuilder {
        this.body = value
        return this
    }


    /**
     * See [ClassDeclaration.modifiers]
     */
    override fun withModifiers(value: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier>): ClassDeclarationBuilder {
        this.modifiers = value
        return this
    }


    /**
     * See [ClassDeclaration.modifiers]
     */
    override fun withModifiers(vararg values: com.github.jonathanxd.codeapi.common.CodeModifier): ClassDeclarationBuilder {
        this.modifiers = values.toSet()
        return this
    }


    /**
     * See [ClassDeclaration.genericSignature]
     */
    override fun withGenericSignature(value: com.github.jonathanxd.codeapi.generic.GenericSignature): ClassDeclarationBuilder {
        this.genericSignature = value
        return this
    }


    /**
     * See [ClassDeclaration.outerClass]
     */
    override fun withOuterClass(value: com.github.jonathanxd.codeapi.type.CodeType?): ClassDeclarationBuilder {
        this.outerClass = value
        return this
    }


    /**
     * See [ClassDeclaration.comments]
     */
    override fun withComments(value: com.github.jonathanxd.codeapi.base.comment.Comments): ClassDeclarationBuilder {
        this.comments = value
        return this
    }

    override fun build(): ClassDeclaration = ClassDeclarationImpl(
            superClass = this.superClass,
            implementations = this.implementations,
            qualifiedName = this.qualifiedName,
            annotations = this.annotations,
            body = this.body,
            modifiers = this.modifiers,
            genericSignature = this.genericSignature,
            outerClass = this.outerClass,
            comments = this.comments
    )


    companion object {
        @JvmStatic
        fun builder() = ClassDeclarationBuilder()
    }
}