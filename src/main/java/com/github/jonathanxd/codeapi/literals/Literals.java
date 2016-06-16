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
package com.github.jonathanxd.codeapi.literals;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.annotation.GenerateTo;
import com.github.jonathanxd.codeapi.helper.Helper;
import com.github.jonathanxd.codeapi.types.CodeType;

/**
 * Created by jonathan on 07/05/16.
 */
public final class Literals {

    public static boolean isPrimitive(CodePart codePart1, CodePart codePart2) {
        return codePart1 instanceof Literal && codePart2 instanceof Literal && isPrimitive((Literal) codePart1, (Literal) codePart2);
    }

    /**
     * Return true if {@code literal1} and {@code literal2} is primitive
     * @param literal1 Literal 1
     * @param literal2 Literal 2
     * @return True if {@code literal1} and {@code literal2} is primitive
     */
    public static boolean isPrimitive(Literal literal1, Literal literal2) {
        return (literal1 instanceof IntLiteral
                || literal1 instanceof FloatLiteral
                || literal1 instanceof DoubleLiteral
                || literal1 instanceof CharLiteral)
                &&
                (literal2 instanceof IntLiteral
                        || literal2 instanceof FloatLiteral
                        || literal2 instanceof DoubleLiteral
                        || literal2 instanceof CharLiteral);
    }

    public static boolean isPrimitive(Literal literal) {
        return literal instanceof IntLiteral
                || literal instanceof FloatLiteral
                || literal instanceof DoubleLiteral
                || literal instanceof CharLiteral;
    }

    // NullLiteral
    public static final Literal NULL = new SimpleLiteral("null", Helper.nullType());

    // BooleanLiteral
    public static final Literal TRUE = new SimpleLiteral("true", Helper.getJavaType(Boolean.TYPE));
    public static final Literal FALSE = new SimpleLiteral("false", Helper.getJavaType(Boolean.TYPE));

    // Numeric Literals

    // IntegerLiteral
    public static Literal INT(int i) {
        return new IntLiteral(String.valueOf(i));
    }

    // FloatLiteral
    public static Literal FLOAT(float f) {
        return new FloatLiteral(String.valueOf(f));
    }

    // DoubleLiteral
    public static Literal DOUBLE(double d) {
        return new DoubleLiteral(String.valueOf(d));
    }

    // CharLiteral
    public static Literal CHAR(char c) {
        return new CharLiteral(String.valueOf(c));
    }

    // StringLiteral

    public static Literal STRING(String s) {
        return new QuotedStringLiteral(s);
    }

    // QuotedStringLiteral (") STRING (")
    public static Literal QUOTED_STRING(String s) {
        return new QuotedStringLiteral(s);
    }

    // Array
    public static Literal ARRAY(Literal other, CodeType array) {
        return new SimpleLiteral(other.getName(), array);
    }

    @GenerateTo(Literal.class)
    private final static class SimpleLiteral extends Literal {
        SimpleLiteral(String name, CodeType dataType) {
            super(name, dataType);
        }

    }


    @GenerateTo(Literal.class)
    public static final class IntLiteral extends Literal {

        private static final CodeType TYPE = Helper.getJavaType(Integer.TYPE);

        IntLiteral(String name) {
            super(name, TYPE);
        }

    }

    @GenerateTo(Literal.class)
    public static final class FloatLiteral extends Literal {

        private static final CodeType TYPE = Helper.getJavaType(Float.TYPE);

        FloatLiteral(String name) {
            super(name, TYPE);
        }

    }

    @GenerateTo(Literal.class)
    public static final class DoubleLiteral extends Literal {

        private static final CodeType TYPE = Helper.getJavaType(Double.TYPE);

        DoubleLiteral(String name) {
            super(name, TYPE);
        }

    }

    @GenerateTo(Literal.class)
    public static final class CharLiteral extends Literal {

        private static final CodeType TYPE = Helper.getJavaType(Character.TYPE);

        CharLiteral(String name) {
            super(name, TYPE);
        }

    }

    @GenerateTo(Literal.class)
    public static final class StringLiteral extends Literal {

        private static final CodeType TYPE = Helper.getJavaType(String.class);

        StringLiteral(String name) {
            super(name, TYPE);
        }

    }

    @GenerateTo(Literal.class)
    public static final class QuotedStringLiteral extends Literal {

        private static final CodeType TYPE = Helper.getJavaType(String.class);

        QuotedStringLiteral(String name) {
            super('"' + name + '"', TYPE);
        }

    }
}
