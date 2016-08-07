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
package com.github.jonathanxd.codeapi.helper;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.annotation.GenerateTo;
import com.github.jonathanxd.codeapi.interfaces.CatchBlock;
import com.github.jonathanxd.codeapi.interfaces.TryBlock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by jonathan on 11/05/16.
 */
@GenerateTo(TryBlock.class)
public class TryCatchBlock implements TryBlock {

    private final CodeSource body;
    private final List<CatchBlock> catchBlocks = new ArrayList<>();
    private final CodeSource finallyBlock;
    private final CodePart expression;

    public TryCatchBlock(CodeSource body) {
        this(null, null, body, null);
    }

    public TryCatchBlock(CodePart expression, CodeSource body) {
        this(expression, null, body, null);
    }

    public TryCatchBlock(CodePart expression, List<CatchBlock> catchBlocks, CodeSource body) {
        this(expression, catchBlocks, body, null);
    }

    public TryCatchBlock(CodePart expression, List<CatchBlock> catchBlocks, CodeSource body, CodeSource finallyBlock) {
        this.expression = expression;
        this.body = body;

        if (catchBlocks != null)
            this.catchBlocks.addAll(catchBlocks);

        this.finallyBlock = finallyBlock;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<CatchBlock> getCatchBlocks() {
        return catchBlocks;
    }

    @Override
    public Optional<CodeSource> getFinallyBlock() {
        return Optional.ofNullable(finallyBlock);
    }

    @Override
    public Optional<CodeSource> getBody() {
        return Optional.ofNullable(this.body);
    }

    @Override
    public Optional<CodePart> getExpression() {
        return Optional.ofNullable(expression);
    }

}
