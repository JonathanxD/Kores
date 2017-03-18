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

import com.github.jonathanxd.codeapi.base.ConstructorDeclaration
import com.github.jonathanxd.codeapi.base.impl.ConstructorDeclarationImpl

// Generated by BuilderGen
open class ConstructorDeclarationBuilder() : ConstructorDeclaration.Builder<ConstructorDeclaration, ConstructorDeclarationBuilder> {

    /**
     * See [ConstructorDeclaration.parameters]
     */
    var parameters: kotlin.collections.List<com.github.jonathanxd.codeapi.common.CodeParameter> = emptyList()

    /**
     * See [ConstructorDeclaration.annotations]
     */
    var annotations: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation> = emptyList()

    /**
     * See [ConstructorDeclaration.body]
     */
    var body: com.github.jonathanxd.codeapi.CodeSource = com.github.jonathanxd.codeapi.CodeSource.empty()

    /**
     * See [ConstructorDeclaration.modifiers]
     */
    var modifiers: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier> = emptySet()

    /**
     * See [ConstructorDeclaration.genericSignature]
     */
    var genericSignature: com.github.jonathanxd.codeapi.generic.GenericSignature = com.github.jonathanxd.codeapi.generic.GenericSignature.empty()

    /**
     * See [ConstructorDeclaration.comments]
     */
    var comments: com.github.jonathanxd.codeapi.base.comment.Comments = com.github.jonathanxd.codeapi.base.comment.Comments.Absent

    constructor(defaults: ConstructorDeclaration) : this() {
        this.parameters = defaults.parameters
        this.annotations = defaults.annotations
        this.body = defaults.body
        this.modifiers = defaults.modifiers
        this.genericSignature = defaults.genericSignature
        this.comments = defaults.comments
    }


    /**
     * See [ConstructorDeclaration.parameters]
     */
    override fun withParameters(value: kotlin.collections.List<com.github.jonathanxd.codeapi.common.CodeParameter>): ConstructorDeclarationBuilder {
        this.parameters = value
        return this
    }


    /**
     * See [ConstructorDeclaration.parameters]
     */
    override fun withParameters(vararg values: com.github.jonathanxd.codeapi.common.CodeParameter): ConstructorDeclarationBuilder {
        this.parameters = values.toList()
        return this
    }


    /**
     * See [ConstructorDeclaration.annotations]
     */
    override fun withAnnotations(value: kotlin.collections.List<com.github.jonathanxd.codeapi.base.Annotation>): ConstructorDeclarationBuilder {
        this.annotations = value
        return this
    }


    /**
     * See [ConstructorDeclaration.annotations]
     */
    override fun withAnnotations(vararg values: com.github.jonathanxd.codeapi.base.Annotation): ConstructorDeclarationBuilder {
        this.annotations = values.toList()
        return this
    }


    /**
     * See [ConstructorDeclaration.body]
     */
    override fun withBody(value: com.github.jonathanxd.codeapi.CodeSource): ConstructorDeclarationBuilder {
        this.body = value
        return this
    }


    /**
     * See [ConstructorDeclaration.modifiers]
     */
    override fun withModifiers(value: kotlin.collections.Set<com.github.jonathanxd.codeapi.common.CodeModifier>): ConstructorDeclarationBuilder {
        this.modifiers = value
        return this
    }


    /**
     * See [ConstructorDeclaration.modifiers]
     */
    override fun withModifiers(vararg values: com.github.jonathanxd.codeapi.common.CodeModifier): ConstructorDeclarationBuilder {
        this.modifiers = values.toSet()
        return this
    }


    /**
     * See [ConstructorDeclaration.genericSignature]
     */
    override fun withGenericSignature(value: com.github.jonathanxd.codeapi.generic.GenericSignature): ConstructorDeclarationBuilder {
        this.genericSignature = value
        return this
    }


    /**
     * See [ConstructorDeclaration.comments]
     */
    override fun withComments(value: com.github.jonathanxd.codeapi.base.comment.Comments): ConstructorDeclarationBuilder {
        this.comments = value
        return this
    }

    override fun build(): ConstructorDeclaration = ConstructorDeclarationImpl(
            parameters = this.parameters,
            annotations = this.annotations,
            body = this.body,
            modifiers = this.modifiers,
            genericSignature = this.genericSignature,
            comments = this.comments
    )


    companion object {
        @JvmStatic
        fun builder() = ConstructorDeclarationBuilder()
    }
}