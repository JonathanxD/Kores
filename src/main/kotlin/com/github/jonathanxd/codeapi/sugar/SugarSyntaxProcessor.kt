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
package com.github.jonathanxd.codeapi.sugar

import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.processor.Processor
import com.github.jonathanxd.codeapi.processor.ProcessorManager
import com.github.jonathanxd.iutils.data.TypedData

/**
 * Sugar syntax processor. CodeAPI provides a way to register a sugar syntax processor, a sugar
 * syntax processor transforms a value of type [T] into a [CodePart].
 */
abstract class SugarSyntaxProcessor<in T> : Processor<T> {

    /**
     * Process [t] and transforms in [CodePart].
     *
     * This class should only convert [t] to [CodePart] and should not call [ProcessorManager.process]. This class
     * is intended only for simple conversions, if you need complex conversions you need to write a [Processor].
     */
    abstract fun process(t: T, codeProcessor: ProcessorManager<*>): CodePart

    override fun process(part: T, data: TypedData, processorManager: ProcessorManager<*>) {
        processorManager.process(this.process(part, processorManager), data)
    }
}
