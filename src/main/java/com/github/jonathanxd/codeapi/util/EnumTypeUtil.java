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
package com.github.jonathanxd.codeapi.util;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.base.EnumValue;
import com.github.jonathanxd.codeapi.base.SwitchStatement;
import com.github.jonathanxd.codeapi.literals.Literal;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.types.LoadedCodeType;

public class EnumTypeUtil {
    /**
     * Try to resolve CodePart at runtime.
     */
    @SuppressWarnings("unchecked")
    public static int resolve(CodePart p, SwitchStatement aSwitch) {

        CodeType type = aSwitch.getType();

        if (p instanceof Literal) {
            Literal l = (Literal) p;

            if (p instanceof Literals.CharLiteral)
                return l.getName().charAt(0);

            if (p instanceof Literals.ByteLiteral || p instanceof Literals.ShortLiteral || p instanceof Literals.IntLiteral)
                return Integer.parseInt(l.getName());

        }

        if (p instanceof Literals.QuotedStringLiteral) {
            return ((Literals.QuotedStringLiteral) p).getOriginal().hashCode();
        }

        try {
            if (p instanceof EnumValue) {
                EnumValue enumValue = (EnumValue) p;
                int ordinal = enumValue.getOrdinal();

                if (ordinal > -1) {
                    return ordinal;
                }

                String name = enumValue.getName();

                if (type instanceof LoadedCodeType<?>)
                    return Enum.valueOf(((LoadedCodeType) type).getLoadedType(), name).ordinal();
            }
        } catch (Exception e) {
            throw new RuntimeException("Cannot resolve enum ordinal value, please use CodeAPI.enumValue(NAME, ORDINAL) to switch enum values that isn't available at runtime!", e);
        }


        throw new RuntimeException("Cannot resolve the numeric value of '" + p + "', a new SwitchType must be implemented to resolve this!");
    }
}
