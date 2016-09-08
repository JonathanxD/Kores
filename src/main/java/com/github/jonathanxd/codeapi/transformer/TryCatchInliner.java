/*
 *      CodeAPI - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2016 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/ & https://github.com/TheRealBuggy/) <jonathan.scripter@programmer.net>
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
package com.github.jonathanxd.codeapi.transformer;

import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.gen.Generator;
import com.github.jonathanxd.codeapi.gen.TargetValue;
import com.github.jonathanxd.codeapi.gen.Value;
import com.github.jonathanxd.codeapi.gen.common.PlainSourceGenerator;
import com.github.jonathanxd.codeapi.helper.TagLineEx;
import com.github.jonathanxd.codeapi.interfaces.ThrowException;
import com.github.jonathanxd.codeapi.util.Parent;
import com.github.jonathanxd.codeapi.util.source.CodeSourceUtil;
import com.github.jonathanxd.iutils.containers.primitivecontainers.BooleanContainer;

import java.util.List;
import java.util.Optional;

/**
 * Internal class. Inline finally statement.
 */
public class TryCatchInliner {

    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    public static boolean inlineSource(Optional<CodeSource> bodyOpt,
                                       Optional<CodeSource> finallyBlockOpt,
                                       List<Value<?, String, PlainSourceGenerator>> values,
                                       Parent<Generator<?, String, PlainSourceGenerator>> parents) {

        if (bodyOpt.isPresent() && finallyBlockOpt.isPresent()) {
            CodeSource codeSource = bodyOpt.get();
            CodeSource finallyBlockSource = finallyBlockOpt.get();

            CodeSource modified = TryCatchInliner.insertInlineSecure(codeSource, finallyBlockSource);

            values.add(TargetValue.create(CodeSource.class, modified, parents));
            return true;
        }

        return false;
    }

    public static CodeSource insertInlineSecure(CodeSource originalSource, CodeSource toAdd0) {

        BooleanContainer booleanContainer = new BooleanContainer(false);

        CodeSource toAdd = new CodeSource();

        toAdd.add(new TagLineEx<>("Inlined finally", toAdd0));

        CodeSource codeSource = CodeSourceUtil.insertBefore(codePart -> {
            if (codePart instanceof ThrowException) {
                booleanContainer.set(true);
                return true;
            }

            return false;
        }, toAdd, originalSource);

        if (!booleanContainer.get()) {
            codeSource.add(toAdd);
        }

        return codeSource;
    }

}
