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
package com.github.jonathanxd.codeapi.gen.visit.bytecode.visitor;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.common.MVData;
import com.github.jonathanxd.codeapi.gen.BytecodeClass;
import com.github.jonathanxd.codeapi.gen.visit.VisitorGenerator;
import com.github.jonathanxd.codeapi.gen.visit.VoidVisitor;
import com.github.jonathanxd.codeapi.interfaces.Access;
import com.github.jonathanxd.codeapi.interfaces.AccessLocal;
import com.github.jonathanxd.codeapi.interfaces.AccessOuter;
import com.github.jonathanxd.codeapi.interfaces.AccessSuper;
import com.github.jonathanxd.codeapi.interfaces.AccessThis;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.iutils.data.MapData;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class AccessVisitor implements VoidVisitor<Access, BytecodeClass, MVData>, Opcodes {

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public void voidVisit(Access access,
                          MapData extraData,
                          VisitorGenerator<BytecodeClass> visitorGenerator,
                          MVData mvData) {

        MethodVisitor additional = mvData.getMethodVisitor();


        if (access instanceof AccessThis) {
            additional.visitVarInsn(ALOAD, 0);
        } else if (access instanceof AccessLocal) {
        } else if (access instanceof AccessSuper) {
            // Same thing
            additional.visitVarInsn(ALOAD, 0);
        } else if (access instanceof AccessOuter) {
            CodeType localization = access.getLocalization().orElseThrow(NullPointerException::new);

            CodePart part = Util.accessEnclosingClass(extraData, localization);

            if (part == null)
                throw new IllegalArgumentException("Cannot access \"outer class\" '" + localization + "'.");

            visitorGenerator.generateTo(part.getClass(), part, extraData, mvData);

        } else {
            throw new IllegalArgumentException("Cannot handle access '" + access + "'");
        }
    }

}