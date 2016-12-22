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
package com.github.jonathanxd.codeapi.read.bytecode;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.types.CodeType;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class LocalVariableTable {

    private final Map<Integer, CodePart> table = new HashMap<>();
    private final Map<Integer, VariableInfo> variableTable = new HashMap<>();

    public void store(CodePart part, int index) {
        this.table.put(index, part);
    }

    public CodePart getOrNull(int index) {
        return this.table.get(index);
    }

    public CodePart get(int index) {
        if (!this.table.containsKey(index))
            throw new NoSuchElementException("The slot '" + index + "' is empty.");

        return this.table.get(index);
    }

    public void storeVariableInfo(int slot, CodeType variableType, String variableName) {
        this.variableTable.put(slot, new VariableInfo(variableType, variableName));
    }

    public VariableInfo getInfo(int slot) {
        return this.variableTable.get(slot);
    }

    public final class VariableInfo {
        private final CodeType type;
        private final String name;

        private VariableInfo(CodeType codeType, String name) {
            this.type = codeType;
            this.name = name;
        }

        public CodeType getType() {
            return this.type;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null || !(obj instanceof VariableInfo))
                return super.equals(obj);

            VariableInfo info = (VariableInfo) obj;

            return this.getName().equals(info.getName()) && this.getType().is(info.getType());
        }
    }


}