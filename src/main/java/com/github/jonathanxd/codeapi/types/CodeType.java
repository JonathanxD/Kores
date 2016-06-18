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
package com.github.jonathanxd.codeapi.types;

import com.github.jonathanxd.codeapi.CodePart;

/**
 * Created by jonathan on 07/05/16.
 */
public interface CodeType extends CodePart, Comparable<CodeType> {
    String getType();

    default String getPackageName() {
        String type = getType();

        if(!type.contains("."))
            return "";

        return type.substring(0, type.lastIndexOf('.'));
    }

    default String getSimpleName() {
        String type = getType();

        return type.substring(type.lastIndexOf('.') + 1);
    }

    default String getJavaSpecName() {
        return "L"+this.getType().replace('.', '/')+";";
    }

    default boolean isPrimitive() {
        return false;
    }

    default boolean isInterface() {
        return false;
    }

    /**
     * Return true if is a {@code Virtual Type} (Virtual Types = Types that were not loaded by JVM)
     *
     * @return Return true if is a {@code Virtual Type} (Virtual Types = Types that were not loaded
     * by JVM)
     */
    default boolean isVirtual() {
        return true;
    }

    default int compareTo(CodeType other) {
        return this.getJavaSpecName().compareTo(other.getJavaSpecName());
    }

    default CodeType toArray(int dimensions) {
        return new CodeTypeArray(this, dimensions);
    }


}
