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
package com.github.jonathanxd.codeapi.impl;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.annotation.GenerateTo;
import com.github.jonathanxd.codeapi.common.InvokeDynamic;
import com.github.jonathanxd.codeapi.common.InvokeType;
import com.github.jonathanxd.codeapi.interfaces.MethodInvocation;
import com.github.jonathanxd.codeapi.interfaces.MethodSpecification;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.util.ToStringBuilder;

import java.util.Optional;

/**
 * Created by jonathan on 10/05/16.
 */
@GenerateTo(MethodInvocation.class)
public class MethodInvocationImpl implements CodePart, MethodInvocation {

    private final InvokeDynamic dynamicInvoke;
    private final InvokeType invokeType;
    private final CodeType localization;
    private final CodePart target;
    private final MethodSpecification spec;

    public MethodInvocationImpl(InvokeType invokeType, CodeType codeType, CodePart target, MethodSpecImpl spec) {
        this(null, invokeType, codeType, target, spec);
    }

    public MethodInvocationImpl(InvokeType invokeType, CodeType codeType, CodePart target, MethodSpecification spec) {
        this.dynamicInvoke = null;
        this.invokeType = invokeType;
        this.localization = codeType;
        this.target = target;
        this.spec = spec;
    }

    public MethodInvocationImpl(InvokeDynamic dynamicInvoke, InvokeType invokeType, CodeType codeType, CodePart target, MethodSpecification spec) {
        this.dynamicInvoke = dynamicInvoke;
        this.invokeType = invokeType;
        this.localization = codeType;
        this.target = target;
        this.spec = spec;
    }

    @Override
    public Optional<CodeType> getLocalization() {
        return Optional.ofNullable(this.localization);
    }

    @Override
    public MethodInvocationImpl setLocalization(CodeType localization) {
        return new MethodInvocationImpl(this.getInvokeDynamic().orElse(null), this.getInvokeType(), localization, this.getTarget().orElse(null), this.getSpec());
    }

    @Override
    public InvokeType getInvokeType() {
        return this.invokeType;
    }

    @Override
    public MethodInvocation setInvokeType(InvokeType invokeType) {
        return new MethodInvocationImpl(this.getInvokeDynamic().orElse(null), invokeType, this.getLocalization().orElse(null), this.getTarget().orElse(null), this.getSpec());
    }

    @Override
    public Optional<InvokeDynamic> getInvokeDynamic() {
        return Optional.ofNullable(this.dynamicInvoke);
    }

    @Override
    public MethodInvocation setInvokeDynamic(InvokeDynamic invokeDynamic) {
        return new MethodInvocationImpl(invokeDynamic, this.getInvokeType(), this.getLocalization().orElse(null), this.getTarget().orElse(null), this.getSpec());
    }

    @Override
    public MethodInvocation setType(CodeType codeType) {

        MethodSpecification spec = this.getSpec();

        spec = spec.setMethodDescription(spec.getMethodDescription().setReturnType(codeType));

        return new MethodInvocationImpl(this.getInvokeDynamic().orElse(null),
                this.getInvokeType(),
                this.getLocalization().orElse(null),
                this.getTarget().orElse(null),
                spec);
    }

    @Override
    public Optional<CodePart> getTarget() {
        return Optional.ofNullable(this.target);
    }

    @Override
    public MethodInvocation setTarget(CodePart target) {
        return new MethodInvocationImpl(this.getInvokeDynamic().orElse(null), this.getInvokeType(), this.getLocalization().orElse(null), target, this.getSpec());
    }

    @Override
    public MethodSpecification getSpec() {
        return this.spec;
    }

    @Override
    public MethodInvocation setSpec(MethodSpecification specification) {
        return new MethodInvocationImpl(this.getInvokeDynamic().orElse(null), this.getInvokeType(), this.getLocalization().orElse(null), this.getTarget().orElse(null), specification);
    }

    @Override
    public String toString() {
        return ToStringBuilder.builder(this.getClass())
                .addOptional("invokeDynamic", this.getInvokeDynamic())
                .add("invokeType", this.getInvokeType())
                .add("localization", this.getLocalization())
                .add("target", this.getTarget())
                .add("spec", this.getSpec())
                .toString();
    }
}