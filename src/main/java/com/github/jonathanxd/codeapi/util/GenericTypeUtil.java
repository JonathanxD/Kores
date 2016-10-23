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
package com.github.jonathanxd.codeapi.util;

import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.types.GenericType;

/**
 * Utility of generic types.
 */
public class GenericTypeUtil {

    /**
     * Convert generic signature to string.
     *
     * @param genericSignature Generic signature.
     * @return Generic signature string.
     */
    public static String toSourceString(GenericSignature<?> genericSignature) {
        StringBuilder sb = new StringBuilder();

        GenericType[] types = genericSignature.getTypes();

        for (int i = 0; i < types.length; i++) {
            boolean hasNext = i + 1 < types.length;

            GenericType genericType = types[i];

            sb.append(GenericTypeUtil.toSourceString(genericType));

            if (hasNext)
                sb.append(",");
        }

        return sb.toString();
    }

    /**
     * Convert generic type to string.
     *
     * @param genericType Generic type.
     * @return Generic type string.
     */
    public static String toSourceString(GenericType genericType) {

        StringBuilder sb = new StringBuilder();

        if (genericType.isType()) {
            sb.append(genericType.getCanonicalName());
        } else {
            if (!genericType.isWildcard()) {
                sb.append(genericType.name());
            } else {
                sb.append("?");
            }
        }


        GenericType.Bound<CodeType>[] bounds = genericType.bounds();

        if (bounds.length != 0) {

            for (int i = 0; i < bounds.length; i++) {

                boolean hasNext = i + 1 < bounds.length;

                GenericType.Bound<CodeType> bound = bounds[i];

                boolean extendsOrSuper = bound.sign().equals("+") || bound.sign().equals("-");

                if (bound.sign().equals("+")) {
                    sb.append(" extends ");
                } else if (bound.sign().equals("-")) {
                    sb.append(" super ");
                } else {
                    if(i == 0) {
                        sb.append("<");
                    }
                }

                CodeType type = bound.getType();

                if(type instanceof GenericType) {
                    sb.append(toSourceString((GenericType) type));
                }else {
                    sb.append(type.getCanonicalName());
                }

                if (!extendsOrSuper && !hasNext) {
                    sb.append(">");
                }

                if (hasNext && extendsOrSuper) {
                    sb.append(" & ");
                } else if(hasNext) {
                    sb.append(", ");
                }
            }

        }

        return sb.toString();
    }

}