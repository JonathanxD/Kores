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
package com.github.jonathanxd.codeapi

import java.util.ArrayList
import java.util.Comparator
import java.util.function.Predicate
import java.util.function.UnaryOperator

/**
 * A mutable [CodeSource] backing to a [ArrayList] instead of to an [Array].
 */
abstract class MutableCodeSource : CodeSource(), Cloneable {

    /**
     * Removes all [CodePart] that matches [filter].
     */
    abstract fun removeIf(filter: Predicate<in CodePart>): Boolean

    /**
     * Replaces each element with element returned by [operator].
     */
    abstract fun replaceAll(operator: UnaryOperator<CodePart>)

    /**
     * Sorts this [MutableCodeSource] using [Comparator] [c].
     */
    abstract fun sort(c: Comparator<in CodePart>)

    /**
     * Adds [codePart] to list.
     */
    abstract fun add(codePart: CodePart): Boolean

    /**
     * Removes [o] from list.
     */
    abstract fun remove(o: Any): Boolean

    /**
     * Adds all [CodePart] of [c] into this list.
     */
    abstract fun addAll(c: Collection<CodePart>): Boolean

    /**
     * Adds all [CodePart] of [c] into this list.
     */
    fun addAll(c: Iterable<CodePart>): Boolean {
        var any = false

        for (part in c) {
            any = any or this.add(part)
        }

        return any
    }

    /**
     * Adds all [CodePart] of [c] into this list at [index].
     */
    abstract fun addAll(index: Int, c: Collection<CodePart>): Boolean

    /**
     * Adds all [CodePart] of [c] into this list at [index].
     */
    abstract fun addAll(index: Int, c: Iterable<CodePart>): Boolean

    /**
     * Removes all elements which is present in [c] from this list.
     */
    abstract fun removeAll(c: Collection<*>): Boolean

    /**
     * Retains all elements which is present in [c] in this list.
     */
    abstract fun retainAll(c: Collection<*>): Boolean

    /**
     * Removes all elements which is present in [c] from this list.
     */
    abstract fun removeAll(c: Iterable<CodePart>): Boolean

    /**
     * Retains all elements which is present in [c] in this list.
     */
    abstract fun retainAll(c: Iterable<CodePart>): Boolean

    /**
     * Clears this list.
     */
    abstract fun clear()

    /**
     * Adds [element] at [index].
     */
    abstract fun add(index: Int, element: CodePart)

    /**
     * Sets element at [index] to [element].
     */
    abstract operator fun set(index: Int, element: CodePart): CodePart

    /**
     * Removes [CodePart] which is at [index]. And returns removed element.
     */
    abstract fun remove(index: Int): CodePart

    /**
     * Adds all elements of [other] to this list.
     */
    abstract operator fun plusAssign(other: Iterable<CodePart>)

    /**
     * Removes all elements of [other] from this list.
     */
    abstract operator fun minusAssign(other: Iterable<CodePart>)

    /**
     * Adds [other] to this list.
     */
    abstract operator fun plusAssign(other: CodePart)

    /**
     * Removes [other] from this list.
     */
    abstract operator fun minusAssign(other: CodePart)

    override fun toString(): String = if (this.isEmpty) "MutableCodeSource[]" else "MutableCodeSource[...]"

    companion object {

        /**
         * Create a [MutableCodeSource].
         */
        @JvmStatic
        fun create(): MutableCodeSource = ListCodeSource()

        /**
         * Create a [MutableCodeSource] from a copy of [list].
         */
        @JvmStatic
        fun create(list: List<CodePart>): MutableCodeSource = ListCodeSource(list.toMutableList())

        /**
         * Create a [MutableCodeSource] delegating to [list].
         */
        @JvmStatic
        fun createFromOriginal(list: MutableList<CodePart>): MutableCodeSource = ListCodeSource(list)

    }
}
