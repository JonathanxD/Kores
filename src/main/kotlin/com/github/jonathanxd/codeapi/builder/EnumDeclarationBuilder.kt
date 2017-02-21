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

import com.github.jonathanxd.codeapi.base.impl.EnumDeclarationImpl
import com.github.jonathanxd.codeapi.base.EnumDeclaration

// Generated by BuilderGen
open class EnumDeclarationBuilder(): EnumDeclaration.Builder<EnumDeclaration, EnumDeclarationBuilder> {

    /**
     * See [EnumDeclaration.entries]
     */
    var entries: kotlin.collections.List<com.github.jonathanxd.codeapi.base.EnumEntry> = emptyList()

    /**
     * See [EnumDeclaration.implementations]
     */
    var implementations: kotlin.collections.List<com.github.jonathanxd.codeapi.type.CodeType> = emptyList()

    /**
     * See [EnumDeclaration.qualifiedName]
     */
    lateinit var qualifiedName: kotlin.String

    /**
     * See [EnumDeclaration.annotations]
     */
    var annotations: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation> = emptyList()

    /**
     * See [EnumDeclaration.body]
     */
    var body: com.github.jonathanxd.codeapi.CodeSource = com.github.jonathanxd.codeapi.CodeSource.empty()

    /**
     * See [EnumDeclaration.modifiers]
     */
    var modifiers: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier> = emptySet()

    /**
     * See [EnumDeclaration.genericSignature]
     */
    var genericSignature: com.github.jonathanxd.codeapi.generic.GenericSignature = com.github.jonathanxd.codeapi.generic.GenericSignature.empty()

    /**
     * See [EnumDeclaration.outerClass]
     */
    var outerClass: com.github.jonathanxd.codeapi.type.CodeType? = null

    /**
     * See [EnumDeclaration.comments]
     */
    var comments: com.github.jonathanxd.codeapi.base.comment.Comments = com.github.jonathanxd.codeapi.base.comment.Comments.Absent

    constructor(defaults: EnumDeclaration) : this() {
        this.entries = defaults.entries
        this.implementations = defaults.implementations
        this.qualifiedName = defaults.specifiedName // Fixes inner issue
        this.annotations = defaults.annotations
        this.body = defaults.body
        this.modifiers = defaults.modifiers
        this.genericSignature = defaults.genericSignature
        this.outerClass = defaults.outerClass
        this.comments = defaults.comments
    }


    /**
     * See [EnumDeclaration.entries]
     */
    override fun withEntries(value: kotlin.collections.List<com.github.jonathanxd.codeapi.base.EnumEntry>): EnumDeclarationBuilder {
        this.entries = value
        return this
    }


    /**
     * See [EnumDeclaration.entries]
     */
    override fun withEntries(vararg values: com.github.jonathanxd.codeapi.base.EnumEntry): EnumDeclarationBuilder {
        this.entries = values.toList()
        return this
    }


    /**
     * See [EnumDeclaration.implementations]
     */
    override fun withImplementations(value: kotlin.collections.List<com.github.jonathanxd.codeapi.type.CodeType>): EnumDeclarationBuilder {
        this.implementations = value
        return this
    }


    /**
     * See [EnumDeclaration.implementations]
     */
    override fun withImplementations(vararg values: com.github.jonathanxd.codeapi.type.CodeType): EnumDeclarationBuilder {
        this.implementations = values.toList()
        return this
    }


    /**
     * See [EnumDeclaration.qualifiedName]
     */
    override fun withQualifiedName(value: kotlin.String): EnumDeclarationBuilder {
        this.qualifiedName = value
        return this
    }


    /**
     * See [EnumDeclaration.annotations]
     */
    override fun withAnnotations(value: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation>): EnumDeclarationBuilder {
        this.annotations = value
        return this
    }


    /**
     * See [EnumDeclaration.annotations]
     */
    override fun withAnnotations(vararg values: com.github.jonathanxd.codeapi.base.Annotation): EnumDeclarationBuilder {
        this.annotations = values.toList()
        return this
    }


    /**
     * See [EnumDeclaration.body]
     */
    override fun withBody(value: com.github.jonathanxd.codeapi.CodeSource): EnumDeclarationBuilder {
        this.body = value
        return this
    }


    /**
     * See [EnumDeclaration.modifiers]
     */
    override fun withModifiers(value: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier>): EnumDeclarationBuilder {
        this.modifiers = value
        return this
    }


    /**
     * See [EnumDeclaration.modifiers]
     */
    override fun withModifiers(vararg values: com.github.jonathanxd.codeapi.common.CodeModifier): EnumDeclarationBuilder {
        this.modifiers = values.toSet()
        return this
    }


    /**
     * See [EnumDeclaration.genericSignature]
     */
    override fun withGenericSignature(value: com.github.jonathanxd.codeapi.generic.GenericSignature): EnumDeclarationBuilder {
        this.genericSignature = value
        return this
    }


    /**
     * See [EnumDeclaration.outerClass]
     */
    override fun withOuterClass(value: com.github.jonathanxd.codeapi.type.CodeType?): EnumDeclarationBuilder {
        this.outerClass = value
        return this
    }


    /**
     * See [EnumDeclaration.comments]
     */
    override fun withComments(value: com.github.jonathanxd.codeapi.base.comment.Comments): EnumDeclarationBuilder {
        this.comments = value
        return this
    }

    override fun build(): EnumDeclaration = EnumDeclarationImpl(
            entries = this.entries,
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
        fun builder() = EnumDeclarationBuilder()
    }
}