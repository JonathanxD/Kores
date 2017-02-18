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

import com.github.jonathanxd.codeapi.base.impl.StaticBlockImpl
import com.github.jonathanxd.codeapi.base.StaticBlock

// Generated by BuilderGen
open class StaticBlockBuilder(): StaticBlock.Builder<StaticBlock, StaticBlockBuilder> {

    /**
     * See [StaticBlock.body]
     */
    var body: com.github.jonathanxd.codeapi.CodeSource = com.github.jonathanxd.codeapi.CodeSource.empty()

    /**
     * See [StaticBlock.comments]
     */
    lateinit var comments: com.github.jonathanxd.codeapi.base.comment.Comments

    constructor(defaults: StaticBlock) : this() {
        this.body = defaults.body
        this.comments = defaults.comments
    }


    /**
     * See [StaticBlock.body]
     */
    override fun withBody(value: com.github.jonathanxd.codeapi.CodeSource): StaticBlockBuilder {
        this.body = value
        return this
    }


    /**
     * See [StaticBlock.comments]
     */
    override fun withComments(value: com.github.jonathanxd.codeapi.base.comment.Comments): StaticBlockBuilder {
        this.comments = value
        return this
    }

    override fun build(): StaticBlock = StaticBlockImpl(
            body = this.body,
            comments = this.comments
    )


    companion object {
        @JvmStatic
        fun builder() = StaticBlockBuilder()
    }
}