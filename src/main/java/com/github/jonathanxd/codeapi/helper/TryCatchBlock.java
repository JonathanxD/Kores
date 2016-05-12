/*
 *      ${expr} - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
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
import com.github.jonathanxd.codeapi.abs.AbstractStorage;
import com.github.jonathanxd.codeapi.annotation.Store;
import com.github.jonathanxd.codeapi.interfaces.Bodiable;
import com.github.jonathanxd.codeapi.interfaces.CatchBlock;
import com.github.jonathanxd.codeapi.interfaces.TryBlock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by jonathan on 11/05/16.
 */
public class TryCatchBlock extends AbstractStorage implements TryBlock {

    @Store(CodeSource.class)
    private final List<CodeSource> bodies = new ArrayList<>();

    private CodePart expression;
    private final Collection<CatchBlock> catchBlocks = new ArrayList<>();
    private final Bodiable finallyBlock;

    public TryCatchBlock() {
        this(null, null, null);
    }

    public TryCatchBlock(CodePart expression) {
        this(expression, null, null);
    }

    public TryCatchBlock(CodePart expression, Collection<CatchBlock> catchBlocks) {
        this(expression, catchBlocks, null);
    }

    public TryCatchBlock(CodePart expression, Collection<CatchBlock> catchBlocks, Bodiable finallyBlock) {
        this.expression = expression;

        if(catchBlocks != null)
            this.catchBlocks.addAll(catchBlocks);

        this.finallyBlock = finallyBlock;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<CatchBlock> getCatchBlocks() {
        return catchBlocks;
    }

    @Override
    public Optional<Bodiable> getFinallyBlock() {
        return Optional.ofNullable(finallyBlock);
    }

    @Override
    public void addBody(CodeSource body) {
        this.bodies.add(body);
    }

    @Override
    public Collection<CodeSource> getBodies() {
        return this.bodies;
    }

    @Override
    public void clearBodies() {
        this.bodies.clear();
    }

    @Override
    public Optional<CodePart> getExpression() {
        return Optional.ofNullable(expression);
    }

    @Override
    public void setExpression(CodePart expression) {
        this.expression = expression;
    }

    @Override
    public void clearExpression() {
        this.expression = null;
    }
}
