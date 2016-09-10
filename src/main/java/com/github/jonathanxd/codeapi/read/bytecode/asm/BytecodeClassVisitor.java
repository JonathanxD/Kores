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
package com.github.jonathanxd.codeapi.read.bytecode.asm;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.common.CodeModifier;
import com.github.jonathanxd.codeapi.common.CodeParameter;
import com.github.jonathanxd.codeapi.common.TypeSpec;
import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.helper.SimpleStaticBlock;
import com.github.jonathanxd.codeapi.impl.CodeClass;
import com.github.jonathanxd.codeapi.impl.CodeConstructor;
import com.github.jonathanxd.codeapi.impl.CodeField;
import com.github.jonathanxd.codeapi.impl.CodeInterface;
import com.github.jonathanxd.codeapi.impl.CodeMethod;
import com.github.jonathanxd.codeapi.interfaces.MethodDeclaration;
import com.github.jonathanxd.codeapi.interfaces.TypeDeclaration;
import com.github.jonathanxd.codeapi.read.Environment;
import com.github.jonathanxd.codeapi.read.bytecode.CommonRead;
import com.github.jonathanxd.codeapi.read.bytecode.Constants;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.types.GenericType;
import com.github.jonathanxd.codeapi.visitgenerator.bytecode.Common;
import com.github.jonathanxd.iutils.optional.Require;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BytecodeClassVisitor extends ClassVisitor {

    private final Environment environment;

    public BytecodeClassVisitor(int api, Environment environment) {
        super(api);
        this.environment = environment;
    }

    public BytecodeClassVisitor(int api, ClassVisitor cv, Environment environment) {
        super(api, cv);
        this.environment = environment;
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);

        Collection<CodeModifier> codeModifiers = CommonRead.modifiersFromAccess(access);

        boolean isInterface = (access & Opcodes.ACC_INTERFACE) != 0;

        CodeType codeType = CommonRead.toCodeType(this.environment, name, isInterface);

        CodeType superClass = CommonRead.toCodeType(this.environment, superName, false);

        List<CodeType> interfacesTypes = Arrays.stream(interfaces).map(itfStr -> CommonRead.toCodeType(this.environment, itfStr, true)).collect(Collectors.toList());

        GenericSignature<GenericType> genericSignature = CommonRead.genericSigFromString(this.environment, signature);

        String sign = Common.genericTypesToAsmString(genericSignature.getTypes());
        if(!signature.equals(sign)) {
            System.err.println("Signature parsed incorrectly: expected: "+signature+". current: "+sign);
        }

        // TODO: Annotations
        TypeDeclaration declaration;

        if (isInterface) {
            declaration = new CodeInterface(codeType.getCanonicalName(), codeModifiers, interfacesTypes, genericSignature, new CodeSource());
        } else {
            declaration = new CodeClass(codeType.getCanonicalName(), codeModifiers, superClass, interfacesTypes, genericSignature, new CodeSource());
        }

        this.environment.getData().registerData(Constants.TYPE_DECLARATION, declaration);

        this.environment.getData().getRequired(Constants.SOURCE).add(declaration);

    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        super.visitField(access, name, desc, signature, value);

        Collection<CodeModifier> codeModifiers = CommonRead.modifiersFromAccess(access);

        CodeType type = CommonRead.toCodeType(this.environment, desc, false);

        CodePart valuePart = null;

        if (value != null) {
            valuePart = CommonRead.toLiteral(value);
        }

        GenericSignature<GenericType> genericSignature = CommonRead.genericSigFromString(this.environment, signature);

        CodeField codeField = new CodeField(name, type, valuePart, codeModifiers);


        TypeDeclaration declaration = this.environment.getData().getRequired(Constants.TYPE_DECLARATION);

        return new BytecodeFieldVisitor(Opcodes.ASM5, environment, declaration, codeField);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

        Collection<CodeModifier> codeModifiers = CommonRead.modifiersFromAccess(access);

        TypeDeclaration declaration = this.environment.getData().getRequired(Constants.TYPE_DECLARATION);

        List<CodeParameter> codeParameters = new ArrayList<>();
        TypeSpec typeSpec = CommonRead.typeSpecFromDesc(this.environment, declaration, name, desc);

        int a = 0;

        for (CodeType type : typeSpec.getParameterTypes()) {
            codeParameters.add(new CodeParameter("param" + (a++), type));
        }

        MethodDeclaration method;

        if (name.equals("<init>")) {
            method = new CodeConstructor(codeModifiers, codeParameters, new CodeSource());
        } else if (name.equals("<clinit>")) {
            method = new SimpleStaticBlock(new CodeSource());
        } else {
            method = new CodeMethod(name, codeModifiers, codeParameters, typeSpec.getReturnType(), new CodeSource());
        }

        if(name.equals("<init>") || name.equals("<clinit>")) {
            // Avoid duplication
            return super.visitMethod(access, name, desc, signature, exceptions);
        }

        return new BytecodeMethodVisitor(Opcodes.ASM5, this.environment, declaration, method);
    }

    @Override
    public void visitEnd() {

        // TODO -> Inner classes??
        this.environment.getData().unregisterAllData(Constants.TYPE_DECLARATION);

        super.visitEnd();
    }
}
