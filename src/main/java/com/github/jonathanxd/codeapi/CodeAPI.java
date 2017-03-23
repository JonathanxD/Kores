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
package com.github.jonathanxd.codeapi;

import com.github.jonathanxd.codeapi.base.Access;
import com.github.jonathanxd.codeapi.base.Annotation;
import com.github.jonathanxd.codeapi.base.AnnotationDeclaration;
import com.github.jonathanxd.codeapi.base.AnnotationProperty;
import com.github.jonathanxd.codeapi.base.ArrayConstructor;
import com.github.jonathanxd.codeapi.base.ArrayLength;
import com.github.jonathanxd.codeapi.base.ArrayLoad;
import com.github.jonathanxd.codeapi.base.ArrayStore;
import com.github.jonathanxd.codeapi.base.Case;
import com.github.jonathanxd.codeapi.base.Cast;
import com.github.jonathanxd.codeapi.base.CatchStatement;
import com.github.jonathanxd.codeapi.base.ClassDeclaration;
import com.github.jonathanxd.codeapi.base.ConstructorDeclaration;
import com.github.jonathanxd.codeapi.base.ControlFlow;
import com.github.jonathanxd.codeapi.base.EnumDeclaration;
import com.github.jonathanxd.codeapi.base.EnumEntry;
import com.github.jonathanxd.codeapi.base.EnumValue;
import com.github.jonathanxd.codeapi.base.FieldAccess;
import com.github.jonathanxd.codeapi.base.FieldBase;
import com.github.jonathanxd.codeapi.base.FieldDefinition;
import com.github.jonathanxd.codeapi.base.ForEachStatement;
import com.github.jonathanxd.codeapi.base.ForStatement;
import com.github.jonathanxd.codeapi.base.IfExpr;
import com.github.jonathanxd.codeapi.base.IfStatement;
import com.github.jonathanxd.codeapi.base.InstanceOfCheck;
import com.github.jonathanxd.codeapi.base.InterfaceDeclaration;
import com.github.jonathanxd.codeapi.base.Label;
import com.github.jonathanxd.codeapi.base.MethodDeclaration;
import com.github.jonathanxd.codeapi.base.MethodFragment;
import com.github.jonathanxd.codeapi.base.MethodInvocation;
import com.github.jonathanxd.codeapi.base.MethodSpecification;
import com.github.jonathanxd.codeapi.base.Operate;
import com.github.jonathanxd.codeapi.base.Return;
import com.github.jonathanxd.codeapi.base.SwitchStatement;
import com.github.jonathanxd.codeapi.base.ThrowException;
import com.github.jonathanxd.codeapi.base.TryStatement;
import com.github.jonathanxd.codeapi.base.TryWithResources;
import com.github.jonathanxd.codeapi.base.TypeDeclaration;
import com.github.jonathanxd.codeapi.base.Typed;
import com.github.jonathanxd.codeapi.base.VariableAccess;
import com.github.jonathanxd.codeapi.base.VariableBase;
import com.github.jonathanxd.codeapi.base.VariableDeclaration;
import com.github.jonathanxd.codeapi.base.VariableDefinition;
import com.github.jonathanxd.codeapi.base.WhileStatement;
import com.github.jonathanxd.codeapi.base.comment.Comments;
import com.github.jonathanxd.codeapi.base.impl.AnnotationImpl;
import com.github.jonathanxd.codeapi.base.impl.AnnotationPropertyImpl;
import com.github.jonathanxd.codeapi.base.impl.ArrayConstructorImpl;
import com.github.jonathanxd.codeapi.base.impl.ArrayLengthImpl;
import com.github.jonathanxd.codeapi.base.impl.ArrayLoadImpl;
import com.github.jonathanxd.codeapi.base.impl.ArrayStoreImpl;
import com.github.jonathanxd.codeapi.base.impl.CaseImpl;
import com.github.jonathanxd.codeapi.base.impl.CastImpl;
import com.github.jonathanxd.codeapi.base.impl.CatchStatementImpl;
import com.github.jonathanxd.codeapi.base.impl.ControlFlowImpl;
import com.github.jonathanxd.codeapi.base.impl.EnumEntryImpl;
import com.github.jonathanxd.codeapi.base.impl.EnumValueImpl;
import com.github.jonathanxd.codeapi.base.impl.FieldAccessImpl;
import com.github.jonathanxd.codeapi.base.impl.FieldDefinitionImpl;
import com.github.jonathanxd.codeapi.base.impl.ForEachStatementImpl;
import com.github.jonathanxd.codeapi.base.impl.ForStatementImpl;
import com.github.jonathanxd.codeapi.base.impl.IfExprImpl;
import com.github.jonathanxd.codeapi.base.impl.IfStatementImpl;
import com.github.jonathanxd.codeapi.base.impl.InstanceOfCheckImpl;
import com.github.jonathanxd.codeapi.base.impl.LabelImpl;
import com.github.jonathanxd.codeapi.base.impl.MethodDeclarationImpl;
import com.github.jonathanxd.codeapi.base.impl.MethodInvocationImpl;
import com.github.jonathanxd.codeapi.base.impl.MethodSpecificationImpl;
import com.github.jonathanxd.codeapi.base.impl.OperateImpl;
import com.github.jonathanxd.codeapi.base.impl.ReturnImpl;
import com.github.jonathanxd.codeapi.base.impl.SwitchStatementImpl;
import com.github.jonathanxd.codeapi.base.impl.ThrowExceptionImpl;
import com.github.jonathanxd.codeapi.base.impl.TryStatementImpl;
import com.github.jonathanxd.codeapi.base.impl.TryWithResourcesImpl;
import com.github.jonathanxd.codeapi.base.impl.VariableAccessImpl;
import com.github.jonathanxd.codeapi.base.impl.VariableDefinitionImpl;
import com.github.jonathanxd.codeapi.base.impl.WhileStatementImpl;
import com.github.jonathanxd.codeapi.builder.BuilderProvider;
import com.github.jonathanxd.codeapi.common.CodeModifier;
import com.github.jonathanxd.codeapi.common.CodeParameter;
import com.github.jonathanxd.codeapi.common.IfGroup;
import com.github.jonathanxd.codeapi.common.InvokeDynamic;
import com.github.jonathanxd.codeapi.common.InvokeType;
import com.github.jonathanxd.codeapi.common.IterationType;
import com.github.jonathanxd.codeapi.common.IterationTypes;
import com.github.jonathanxd.codeapi.common.MethodInvokeSpec;
import com.github.jonathanxd.codeapi.common.MethodType;
import com.github.jonathanxd.codeapi.common.MethodTypeSpec;
import com.github.jonathanxd.codeapi.common.Scope;
import com.github.jonathanxd.codeapi.common.SwitchType;
import com.github.jonathanxd.codeapi.common.SwitchTypes;
import com.github.jonathanxd.codeapi.common.TypeSpec;
import com.github.jonathanxd.codeapi.common.Void;
import com.github.jonathanxd.codeapi.fragment.SimpleMethodFragmentImpl;
import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.helper.ConcatHelper;
import com.github.jonathanxd.codeapi.helper.IfExpressionHelper;
import com.github.jonathanxd.codeapi.literal.Literals;
import com.github.jonathanxd.codeapi.operator.Operator;
import com.github.jonathanxd.codeapi.operator.Operators;
import com.github.jonathanxd.codeapi.type.CodeType;
import com.github.jonathanxd.codeapi.type.JavaType;
import com.github.jonathanxd.codeapi.type.LoadedCodeType;
import com.github.jonathanxd.codeapi.type.PlainCodeType;
import com.github.jonathanxd.codeapi.util.Alias;
import com.github.jonathanxd.codeapi.util.ArrayToList;
import com.github.jonathanxd.codeapi.util.CodeTypes;
import com.github.jonathanxd.codeapi.util.Identity;
import com.github.jonathanxd.iutils.map.WeakValueHashMap;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/**
 * Factory class.
 *
 * Is highly recommended to use Builders instead of factory methods, because the documentation of
 * this class isn't complete.
 */
public final class CodeAPI {

    public static final Annotation[] EMPTY_ANNOTATIONS = {};
    private final static WeakValueHashMap<Class<?>, CodeType> CODE_TYPES_CACHE = new WeakValueHashMap<>();

    private static final BuilderProvider provider = null;

    public static BuilderProvider getBuilderProvider() {
        return Objects.requireNonNull(CodeAPI.provider, "Provider is not defined");
    }


    // =========================================================
    //          Annotations
    // =========================================================

    public static AnnotationDeclaration.Builder<AnnotationDeclaration, ?> annotationBuilder() {
        return AnnotationDeclaration.Builder.Companion.builder();
    }

    /**
     * Create an annotation property of type {@code type} and name {@code name}.
     *
     * @param type Property type.
     * @param name Property name.
     * @return Property.
     */
    public static AnnotationProperty property(Type type, String name) {
        return factory__property(Collections.emptyList(), type, name, null);
    }

    /**
     * Create an annotation property of type {@code type} and name {@code name} with default value
     * {@code value}.
     *
     * @param type  Property type.
     * @param name  Property name.
     * @param value Default annotation value. The value must be: {@link Byte}, {@link Boolean},
     *              {@link Character}, {@link Short}, {@link Integer}, {@link Long}, {@link Float},
     *              {@link Double}, {@link String}, {@link Type}, OBJECT, ARRAY, {@link
     *              EnumValue} or other {@link Annotation}.
     * @return Property.
     */
    public static AnnotationProperty property(Type type, String name, Object value) {
        return factory__property(Collections.emptyList(), type, name, value);
    }

    /**
     * Create an annotation property of type {@code type} and name {@code name} with default value
     * {@code value} and annotated with {@code annotations}.
     *
     * @param annotations Annotations.
     * @param type        Property type.
     * @param name        Property name.
     * @param value       Default annotation value. The value must be: {@link Byte}, {@link
     *                    Boolean}, {@link Character}, {@link Short}, {@link Integer}, {@link Long},
     *                    {@link Float}, {@link Double}, {@link String}, {@link Type}, OBJECT,
     *                    ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return Property.
     */
    public static AnnotationProperty property(List<Annotation> annotations, Type type, String name, Object value) {
        return factory__property(annotations, type, name, value);
    }

    /**
     * Create an annotation property of type {@code type} and name {@code name} and annotated with
     * {@code annotations}.
     *
     * @param annotations Annotations.
     * @param type        Property type.
     * @param name        Property name.
     * @return Property.
     */
    public static AnnotationProperty property(List<Annotation> annotations, Type type, String name) {
        return factory__property(annotations, type, name, null);
    }

    private static AnnotationProperty factory__property(List<Annotation> annotationList,
                                                        Type type,
                                                        String name,
                                                        Object value) {

        return new AnnotationPropertyImpl(type, name, annotationList, value);
    }

    // =========================================================
    //          Interfaces
    // =========================================================

    /**
     * Create a {@link InterfaceDeclaration.Builder}.
     *
     * @return New {@link InterfaceDeclaration.Builder}.
     */
    public static InterfaceDeclaration.Builder<InterfaceDeclaration, ?> anInterfaceBuilder() {
        return InterfaceDeclaration.Builder.Companion.builder();
    }

    // =========================================================
    //          Classes
    // =========================================================

    /**
     * Create a {@link ClassDeclaration.Builder}.
     *
     * @return New {@link ClassDeclaration.Builder}.
     */
    public static ClassDeclaration.Builder<ClassDeclaration, ?> aClassBuilder() {
        return ClassDeclaration.Builder.Companion.builder();
    }


    // =========================================================
    //          Enums
    // =========================================================

    /**
     * Creates a new enum builder.
     *
     * @return New enum builder
     */
    public static EnumDeclaration.Builder<EnumDeclaration, ?> enumBuilder() {
        return EnumDeclaration.Builder.Companion.builder();
    }

    /**
     * Create an named enum entry.
     *
     * @param name name of enum entry.
     * @return New enum entry.
     */
    public static EnumEntry enumEntry(String name) {
        return enumEntry__factory(name, emptySource(), null, Collections.emptyList());
    }

    /**
     * Create an named enum entry with a body.
     *
     * @param name Name of enum entry.
     * @param body Body of enum entry.
     * @return New enum entry.
     */
    public static EnumEntry enumEntry(String name, CodeSource body) {
        return enumEntry__factory(name, body, null, Collections.emptyList());
    }

    /**
     * Create a new enum entry that calls the Enum constructor.
     *
     * @param name                 Name of entry.
     * @param constructorSpec      Constructor specification.
     * @param constructorArguments Constructor arguments.
     * @return new enum entry.
     */
    public static EnumEntry enumEntry(String name, TypeSpec constructorSpec, List<CodePart> constructorArguments) {
        return enumEntry__factory(name, emptySource(), constructorSpec, constructorArguments);
    }

    /**
     * Create a new enum entry that have a body and calls the Enum constructor.
     *
     * @param name                 Name of entry.
     * @param constructorSpec      Constructor specification.
     * @param constructorArguments Constructor arguments.
     * @param body                 Enum entry body.
     * @return new enum entry.
     */
    public static EnumEntry enumEntry(String name, TypeSpec constructorSpec, List<CodePart> constructorArguments, CodeSource body) {
        return enumEntry__factory(name, body, constructorSpec, constructorArguments);
    }

    // Factory

    private static EnumEntry enumEntry__factory(String name, CodeSource body, TypeSpec spec, List<CodePart> arguments) {
        return new EnumEntryImpl(spec, arguments, name, body);
    }

    // =========================================================
    //          Methods
    // =========================================================

    /**
     * Create a {@link MethodDeclaration.Builder}.
     *
     * @return New {@link MethodDeclaration.Builder}.
     */
    public static MethodDeclaration.Builder<MethodDeclaration, ?> methodBuilder() {
        return MethodDeclaration.Builder.Companion.builder();
    }

    // =========================================================
    //          Constructors
    // =========================================================

    /**
     * Create a {@link ConstructorDeclaration.Builder}.
     *
     * @return New {@link ConstructorDeclaration.Builder}.
     */
    public static ConstructorDeclaration.Builder<ConstructorDeclaration, ?> constructorBuilder() {
        return ConstructorDeclaration.Builder.Companion.builder();
    }


    // =========================================================
    //          Array Constructors
    // =========================================================

    public static ArrayConstructor arrayConstruct(Type arrayType, CodePart[] dimensions, List<CodePart> arguments) {
        return arrayConstruct__factory(arrayType, dimensions, arguments);
    }

    public static ArrayConstructor arrayConstruct(Type arrayType, CodePart[] dimensions) {
        return arrayConstruct__factory(arrayType, dimensions, Collections.emptyList());
    }

    // Factory

    private static ArrayConstructor arrayConstruct__factory(Type arrayType, CodePart[] dimensions, List<CodePart> arguments) {
        return new ArrayConstructorImpl(arguments, arrayType, ArrayToList.toList(dimensions));
    }

    // =========================================================
    //          Array Manipulate
    // =========================================================

    public static ArrayLength getArrayLength(Typed access) {
        return getArrayLength__factory(access);
    }

    public static ArrayLoad getArrayValue(Type valueType, Typed access, CodePart index) {
        return getArrayValue__factory(index, access, valueType);
    }

    public static ArrayStore setArrayValue(Typed access, CodePart index, Typed value) {
        return setArrayValue__factory(index, access, value);
    }

    // Factory

    private static ArrayLength getArrayLength__factory(Typed access) {
        return new ArrayLengthImpl(access.getType(), access);
    }

    private static ArrayLoad getArrayValue__factory(CodePart index, Typed access, Type valueType) {
        return new ArrayLoadImpl(index, access, valueType, access.getType());
    }

    private static ArrayStore setArrayValue__factory(CodePart index, Typed access, Typed value) {
        return new ArrayStoreImpl(index, access, value.getType(), value, access.getType());
    }


    // =========================================================
    //          Source
    // =========================================================

    public static CodeSource emptySource() {
        return CodeSource.empty();
    }

    public static MutableCodeSource emptyMutableSource() {
        return new MutableCodeSource();
    }

    public static CodeSource source(CodePart... codeParts) {
        return CodeSource.fromArray(codeParts);
    }

    public static CodeSource sourceOfParts(CodePart... codeParts) {
        return CodeSource.fromArray(codeParts);
    }

    // =========================================================
    //          Return
    // =========================================================

    public static Return returnVoid() {
        return new ReturnImpl(Void.INSTANCE.getType(), Void.INSTANCE);
    }

    public static Return returnValue(Type valueType, CodePart value) {
        return new ReturnImpl(valueType, value);
    }

    public static Return returnLocalVariable(Type fieldType, String fieldName) {
        return new ReturnImpl(fieldType, CodeAPI.accessLocalVariable(fieldType, fieldName));
    }

    public static Return returnThisField(Type fieldType, String fieldName) {
        return new ReturnImpl(fieldType, CodeAPI.accessThisField(fieldType, fieldName));
    }

    public static Return returnStaticField(Type localization, Type fieldType, String fieldName) {
        return new ReturnImpl(fieldType, CodeAPI.accessStaticField(localization, fieldType, fieldName));
    }

    // =========================================================
    //          Parameters
    // =========================================================

    /**
     * Create a {@link CodeParameter parameter}.
     *
     * @param type Parameter value type.
     * @param name Name of the parameter.
     * @return {@link CodeParameter} instance.
     */
    public static CodeParameter parameter(Type type, String name) {
        return new CodeParameter(type, name);
    }

    // =========================================================
    //          Arguments
    // =========================================================

    // =========================================================
    //          Invoke
    // =========================================================

    /**
     * Invoke this constructor.
     *
     * @param constructorSpec Type specification of constructor.
     * @param arguments       Constructor Arguments.
     * @return Invocation of super constructor of current class.
     */
    public static MethodInvocation invokeThisConstructor(TypeSpec constructorSpec, List<CodePart> arguments) {
        return invokeThisConstructor__factory(constructorSpec, arguments);
    }

    /**
     * Invoke super constructor of current type declaration.
     *
     * @param constructorSpec Type specification of constructor.
     * @param arguments       Constructor Arguments.
     * @return Invocation of super constructor of current class.
     */
    public static MethodInvocation invokeSuperConstructor(TypeSpec constructorSpec, List<CodePart> arguments) {
        return invokeSuperConstructor__factory(Alias.SUPER.INSTANCE, constructorSpec, arguments);
    }

    /**
     * Invoke super constructor of current type declaration.
     *
     * @param superClass      Super class of current type declaration.
     * @param constructorSpec Type specification of constructor.
     * @param arguments       Constructor Arguments.
     * @return Invocation of super constructor of current type declaration.
     */
    public static MethodInvocation invokeSuperConstructor(Type superClass, TypeSpec constructorSpec, List<CodePart> arguments) {
        return invokeSuperConstructor__factory(superClass, constructorSpec, arguments);
    }

    /**
     * Invoke constructor of a {@link Type}.
     *
     * @param type Type to invoke constructor.
     * @return Invocation of constructor of {@code type}.
     */
    public static MethodInvocation invokeConstructor(Type type) {
        return invokeConstructor__factory(type, constructorTypeSpec(new Type[0]), Collections.emptyList());
    }

    /**
     * Invoke constructor of a {@link Type}.
     *
     * @param type      Type to invoke constructor.
     * @param spec      Method specification.
     * @param arguments Arguments to pass to constructor.
     * @return Invocation of constructor of {@code type} with provided arguments.
     */
    public static MethodInvocation invokeConstructor(Type type, TypeSpec spec, List<CodePart> arguments) {
        return invokeConstructor__factory(type, spec, arguments);
    }

    /**
     * Invoke a static method.
     *
     * @param localization      Localization of the method.
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of static method.
     */
    public static MethodInvocation invokeStatic(Type localization, String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_STATIC, localization, CodeTypes.getCodeType(localization), arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a static method in current TypeDeclaration.
     *
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of static method.
     */
    public static MethodInvocation invokeStatic(String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_STATIC, Alias.THIS.INSTANCE, CodeAPI.accessStatic(), arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a instance method.
     *
     * @param localization      Localization of the method.
     * @param target            Instance.
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of instance method.
     */
    public static MethodInvocation invokeVirtual(Type localization, CodePart target, String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_VIRTUAL, localization, target, arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a instance method of current type declaration.
     *
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of instance method.
     */
    public static MethodInvocation invokeVirtual(String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_VIRTUAL, Alias.THIS.INSTANCE, CodeAPI.accessThis(), arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a interface method of current type declaration.
     *
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of interface method.
     */
    public static MethodInvocation invokeInterface(String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_INTERFACE, Alias.THIS.INSTANCE, CodeAPI.accessThis(), arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a interface method.
     *
     * @param localization      Localization of the method.
     * @param target            Instance.
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of interface method.
     */
    public static MethodInvocation invokeInterface(Type localization, CodePart target, String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_INTERFACE, localization, target, arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a special method of current type declaration.
     *
     * <table summary="">
     * <tr><th>Special Invocation cases</th></tr>
     * <tr><td>Constructor Methods</td></tr>
     * <tr><td>Super class methods</td></tr>
     * <tr><td>Private methods</td></tr>
     * </table>
     *
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of special method.
     */
    public static MethodInvocation invokeSpecial(String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_SPECIAL, Alias.THIS.INSTANCE, CodeAPI.accessThis(), arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a special method (aka super.method invocations).
     *
     * <table summary="">
     * <tr><th>Special Invocation cases</th></tr>
     * <tr><td>Constructor Methods</td></tr>
     * <tr><td>Super class methods</td></tr>
     * <tr><td>Private methods</td></tr>
     * </table>
     *
     * @param localization      Localization of the method.
     * @param target            Instance.
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of special method.
     */
    public static MethodInvocation invokeSpecial(Type localization, CodePart target, String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(InvokeType.INVOKE_SPECIAL, localization, target, arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }


    /**
     * Invoke a method.
     *
     * @param invokeType        Method invocation type.
     * @param localization      Localization of the method.
     * @param target            Instance.
     * @param methodName        Name of the method.
     * @param methodDescription Method type description.
     * @param arguments         Method arguments.
     * @return Invocation of a method.
     */
    public static MethodInvocation invoke(InvokeType invokeType, Type localization, CodePart target, String methodName, TypeSpec methodDescription, List<CodePart> arguments) {
        return invoke__factory(invokeType, localization, target, arguments,
                spec__factory(methodName, methodDescription, MethodType.METHOD));
    }

    /**
     * Invoke a method dynamically.
     *
     * @param invokeDynamic    Invoke dynamic instance.
     * @param methodInvocation Method to invoke dynamically.
     * @return Dynamic invocation.
     */
    public static MethodInvocation invokeDynamic(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
        return invokeDynamic__factory(invokeDynamic, methodInvocation);
    }

    /**
     * Invoke a lambda method dynamically.
     *
     * @param fragment Method to invoke.
     * @return Dynamic invocation.
     * @see MethodFragment
     */
    public static MethodInvocation invokeDynamicFragment(InvokeDynamic.LambdaFragment fragment) {
        return invokeDynamic__factory(fragment);
    }

    public static MethodInvocation invokeFieldGetter(InvokeType invokeType, Type localization, CodePart target, Type fieldType, String fieldName) {
        return invoke__factory(invokeType, localization, target, Collections.emptyList(),
                spec__factory("get".concat(StringsKt.capitalize(fieldName)), new TypeSpec(fieldType), MethodType.METHOD));
    }

    public static MethodInvocation invokeFieldSetter(InvokeType invokeType, Type localization, CodePart target, Type fieldType, String fieldName, CodePart value) {
        return invoke__factory(invokeType, localization, target, CollectionsKt.listOf(value),
                spec__factory("set".concat(StringsKt.capitalize(fieldName)), typeSpec(Types.VOID, fieldType), MethodType.METHOD));
    }

    // Factory

    private static MethodSpecification spec__factory(String methodName, TypeSpec methodDescription, MethodType methodType) {
        return new MethodSpecificationImpl(methodType, methodName, methodDescription);
    }

    private static MethodInvocation invoke__factory(InvokeType invokeType, Type localization, CodePart target, List<CodePart> arguments, MethodSpecification methodSpecification) {
        return new MethodInvocationImpl(localization, arguments, methodSpecification, invokeType, null, target);
    }

    private static MethodInvocation invokeDynamic__factory(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
        MethodSpecification spec = methodInvocation.getSpec();

        MethodSpecification newSpec = new MethodSpecificationImpl(spec.getMethodType().toDynamic(), spec.getMethodName(), spec.getDescription());

        return new MethodInvocationImpl(methodInvocation.getLocalization(), methodInvocation.getArguments(), newSpec, methodInvocation.getInvokeType(), invokeDynamic, methodInvocation.getTarget());
    }

    private static MethodInvocation invokeDynamic__factory(InvokeDynamic.LambdaFragment fragment) {
        MethodFragment methodFragment = fragment.getMethodFragment();

        MethodSpecification spec = methodFragment.getSpec();


        MethodSpecification newSpec = new MethodSpecificationImpl(spec.getMethodType(), spec.getMethodName(), spec.getDescription());

        return new MethodInvocationImpl(methodFragment.getLocalization(),
                methodFragment.getArguments(),
                newSpec,
                methodFragment.getInvokeType(),
                fragment,
                methodFragment.getTarget());
    }

    private static MethodInvocation invokeConstructor__factory(Type type, TypeSpec spec, List<CodePart> arguments) {
        return new MethodInvocationImpl(type, arguments, new MethodSpecificationImpl(MethodType.CONSTRUCTOR, "<init>", spec), InvokeType.INVOKE_SPECIAL, null, CodeTypes.getCodeType(type));
    }

    private static MethodInvocation invokeSuperConstructor__factory(Type type, TypeSpec constructorSpec, List<CodePart> arguments) {
        return new MethodInvocationImpl(type, arguments, new MethodSpecificationImpl(MethodType.SUPER_CONSTRUCTOR, "<init>", constructorSpec), InvokeType.INVOKE_SPECIAL, null, CodeAPI.accessSuper());
    }

    private static MethodInvocation invokeThisConstructor__factory(TypeSpec constructorSpec, List<CodePart> arguments) {
        return new MethodInvocationImpl(Alias.THIS.INSTANCE, arguments, new MethodSpecificationImpl(MethodType.SUPER_CONSTRUCTOR, "<init>", constructorSpec), InvokeType.INVOKE_SPECIAL, null, CodeAPI.accessThis());
    }

    // =========================================================
    //          Access Variables & Fields
    // =========================================================

    /**
     * Access a variable declaration.
     *
     * @param declaration Declaration.
     * @return Access to {@code declaration}.
     */
    public static VariableAccess accessVariable(VariableDeclaration declaration) {
        return accessVariable__Factory(declaration.getVariableType(), declaration.getName());
    }

    /**
     * Access a static field of current class.
     *
     * @param fieldType Type of the field.
     * @param name      Name of the field.
     * @return Access to a static field.
     */
    public static FieldAccess accessStaticField(Type fieldType, String name) {
        return accessField__Factory(Alias.THIS.INSTANCE, CodeAPI.accessStatic(), fieldType, name);
    }

    /**
     * Access a static field of {@link Type type} {@code localization}.
     *
     * @param localization Localization of the field.
     * @param fieldType    Type of the field.
     * @param name         Name of the field.
     * @return Access to a static field.
     */
    public static FieldAccess accessStaticField(Type localization, Type fieldType, String name) {
        return accessField__Factory(localization, CodeAPI.accessStatic(), fieldType, name);
    }

    /**
     * Access a field or variable.
     *
     * @param localization Localization of the field.
     * @param at           Scope localization or instance of localization.
     * @param fieldType    Type of the field.
     * @param name         Name of the field.
     * @return Access to a field or variable.
     */
    public static FieldAccess accessField(Type localization, CodePart at, Type fieldType, String name) {
        return accessField__Factory(localization, at, fieldType, name);
    }

    /**
     * Access a field or variable.
     *
     * @param fieldBase Field to access
     * @return Access to a field or variable.
     */
    public static FieldAccess accessField(FieldBase fieldBase) {
        return accessField__Factory(fieldBase.getLocalization(), fieldBase.getTarget(), fieldBase.getType(), fieldBase.getName());
    }

    /**
     * Access a static field of current class.
     *
     * @param fieldType Type of the field.
     * @param name      Name of the field.
     * @return Access to a static field of current class.
     */
    public static FieldAccess accessThisField(Type fieldType, String name) {
        return accessField__Factory(Alias.THIS.INSTANCE, CodeAPI.accessThis(), fieldType, name);
    }

    public static VariableAccess accessLocalVariable(VariableBase variableBase) {
        return accessVariable__Factory(variableBase.getVariableType(), variableBase.getName());
    }

    /**
     * Access a local variable.
     *
     * @param variableType Type of the variable value.
     * @param name         Name of the variable.
     * @return Access to variable.
     */
    public static VariableAccess accessLocalVariable(Type variableType, String name) {
        return accessVariable__Factory(variableType, name);
    }

    // Factory
    private static FieldAccess accessField__Factory(Type localization, CodePart at, Type type, String name) {
        return new FieldAccessImpl(name, type, at, localization);
    }

    private static VariableAccess accessVariable__Factory(Type type, String name) {
        return new VariableAccessImpl(name, type);
    }

    // =========================================================
    //          Set Variables & Fields
    // =========================================================

    public static FieldDefinition setField(FieldBase fieldBase, CodePart value) {
        return setField__Factory(fieldBase.getLocalization(), fieldBase.getTarget(), fieldBase.getType(), fieldBase.getName(), value);
    }


    public static VariableDefinition setDeclarationValue(VariableDeclaration declaration, CodePart value) {
        return setVariable__Factory(declaration.getVariableType(), declaration.getName(), value);
    }

    public static FieldDefinition setStaticThisField(Type fieldType, String name, CodePart value) {
        return setField__Factory(Alias.THIS.INSTANCE, CodeAPI.accessThis(), fieldType, name, value);
    }

    public static FieldDefinition setStaticField(Type localization, Type fieldType, String name, CodePart value) {
        return setField__Factory(localization, CodeAPI.accessStatic(), fieldType, name, value);
    }

    public static FieldDefinition setField(Type localization, CodePart at, Type fieldType, String name, CodePart value) {
        return setField__Factory(localization, at, fieldType, name, value);
    }

    public static FieldDefinition setThisField(Type fieldType, String name, CodePart value) {
        return setField__Factory(Alias.THIS.INSTANCE, CodeAPI.accessThis(), fieldType, name, value);
    }

    public static VariableDefinition setLocalVariable(Type variableType, String name, CodePart value) {
        return setVariable__Factory(variableType, name, value);
    }

    // Factory
    private static FieldDefinition setField__Factory(Type localization, CodePart at, Type type, String name, CodePart value) {
        return new FieldDefinitionImpl(type, value, name, at, localization);
    }

    private static VariableDefinition setVariable__Factory(Type type, String name, CodePart value) {
        return new VariableDefinitionImpl(type, name, value);
    }

    // =========================================================
    //          Operate Variables & Fields & Values
    // =========================================================

    public static Operate operate(CodePart part, Operator.Math operation, CodePart value) {
        return factory__operate(part, operation, value);
    }

    /**
     * Operate a variable value and assign the result to variable.
     *
     * @param variable  Variable.
     * @param operation Operation.
     * @param value     Second value to apply to operation.
     * @return Definition of result of operation.
     */
    public static VariableDefinition operateAndAssign(VariableBase variable, Operator.Math operation, CodePart value) {
        return setLocalVariable(variable.getVariableType(), variable.getName(), operate(accessLocalVariable(variable), operation, value));
    }

    /**
     * Operate a variable value.
     *
     * @param variable  Variable to get value.
     * @param operation Operation.
     * @param value     Second value to apply to operation.
     * @return Operation instance.
     */
    public static Operate operate(VariableBase variable, Operator.Math operation, CodePart value) {
        return factory__operate(accessLocalVariable(variable), operation, value);
    }

    /**
     * Operate a field value and assign the result to variable.
     *
     * @param field     Field to get value.
     * @param operation Operation.
     * @param value     Second value to apply to operation.
     * @return Definition of result of operation.
     */
    public static FieldDefinition operateAndAssign(FieldBase field, Operator.Math operation, CodePart value) {
        return setField(field, factory__operate(accessField(field), operation, value));
    }

    /**
     * Operate a variable value.
     *
     * @param field     Field to get value.
     * @param operation Operation.
     * @param value     Second value to apply to operation.
     * @return Operation instance.
     */
    public static Operate operate(FieldBase field, Operator.Math operation, CodePart value) {
        return factory__operate(accessField(field), operation, value);
    }

    // Spec

    /**
     * Operate a variable value and assign the result to variable.
     *
     * @param variableType Type of the variable
     * @param variableName Name of the variable
     * @param operation    Operation.
     * @param value        Second value to apply to operation.
     * @return Definition of result of operation.
     */
    public static VariableDefinition operateAndAssign(Type variableType, String variableName, Operator.Math operation, CodePart value) {
        return setLocalVariable(variableType, variableName, operate(accessLocalVariable(variableType, variableName), operation, value));
    }

    /**
     * Operate a variable value.
     *
     * @param variableType Type of the variable
     * @param variableName Name of the variable
     * @param operation    Operation.
     * @param value        Second value to apply to operation.
     * @return Operation instance.
     */
    public static Operate operate(Type variableType, String variableName, Operator.Math operation, CodePart value) {
        return factory__operate(accessLocalVariable(variableType, variableName), operation, value);
    }

    /**
     * Operate a field value and assign the result to variable.
     *
     * @param localization Localization of the field
     * @param at           Target of the field access
     * @param fieldType    Type of the field
     * @param fieldName    Name of the field
     * @param operation    Operation.
     * @param value        Second value to apply to operation.
     * @return Definition of result of operation.
     */
    public static FieldDefinition operateAndAssign(Type localization, CodePart at, Type fieldType, String fieldName, Operator.Math operation, CodePart value) {
        return setField(localization, at, fieldType, fieldName, factory__operate(accessField(localization, at, fieldType, fieldName), operation, value));
    }

    /**
     * Operate a variable value.
     *
     * @param localization Localization of the field
     * @param at           Target of the field access
     * @param fieldType    Type of the field
     * @param fieldName    Name of the field
     * @param operation    Operation.
     * @param value        Second value to apply to operation.
     * @return Operation instance.
     */
    public static Operate operate(Type localization, CodePart at, Type fieldType, String fieldName, Operator.Math operation, CodePart value) {
        return factory__operate(accessField(localization, at, fieldType, fieldName), operation, value);
    }


    // Factory
    private static Operate factory__operate(CodePart part, Operator.Math operation, CodePart value) {
        return new OperateImpl(part, operation, value);
    }

    // =========================================================
    //          Throw Exceptions
    // =========================================================

    public static ThrowException throwException(CodePart partToThrow) {
        return throwException__Factory(partToThrow);
    }

    // Factory

    private static ThrowException throwException__Factory(CodePart partToThrow) {
        return new ThrowExceptionImpl(partToThrow);
    }

    // =========================================================
    //          Annotations
    // =========================================================

    public static Annotation overrideAnnotation() {
        return CodeAPI.annotation(Types.OVERRIDE);
    }

    // Type

    /**
     * Create an annotation that is not visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(Type annotationType) {
        return annotation__Factory(false, annotationType, Collections.emptyMap());
    }

    /**
     * Create an annotation.
     *
     * @param annotationType Type of annotation
     * @param isVisible      Is annotation visible at runtime (only affects bytecode generation).
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(boolean isVisible, Type annotationType) {
        return annotation__Factory(isVisible, annotationType, Collections.emptyMap());
    }

    /**
     * Create an annotation that is visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @return A visible annotation
     */
    public static Annotation visibleAnnotation(Type annotationType) {
        return annotation__Factory(true, annotationType, Collections.emptyMap());
    }

    /**
     * Create an annotation that is not visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link Type}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(Type annotationType, Map<String, Object> values) {
        return annotation__Factory(false, annotationType, values);
    }

    /**
     * Create an annotation that is visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link Type}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A visible annotation
     */
    public static Annotation visibleAnnotation(Type annotationType, Map<String, Object> values) {
        return annotation__Factory(true, annotationType, values);
    }

    /**
     * Create an annotation.
     *
     * @param annotationType Type of annotation
     * @param isVisible      Is annotation visible at runtime (only affects bytecode generation).
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link Type}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(boolean isVisible, Type annotationType, Map<String, Object> values) {
        return annotation__Factory(isVisible, annotationType, values);
    }

    // Factory

    /**
     * Create an Annotation
     *
     * @param isVisible      Is annotation visible at runtime.
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link Type}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return Annotation
     */
    private static Annotation annotation__Factory(boolean isVisible, Type annotationType, Map<String, Object> values) {
        return new AnnotationImpl(isVisible, annotationType, values);
    }

    // =========================================================
    //          Annotations & Case Enum Values
    // =========================================================

    /**
     * EnumValue of an Annotation property.
     *
     * @param enumType Type of enum
     * @param entry    Enum entry (aka Field)
     * @param ordinal  Ordinal value of enum entry.
     * @return Enum value
     */
    public static EnumValue enumValue(Type enumType, String entry, int ordinal) {
        return enumValue__factory(enumType, entry, ordinal);
    }

    /**
     * EnumValue of an Annotation property.
     *
     * @param enumType Type of enum
     * @param entry    Enum entry (aka Field)
     * @return Enum value
     */
    public static EnumValue enumValue(Type enumType, String entry) {
        return enumValue__factory(enumType, entry, -1);
    }

    // Factory

    private static EnumValue enumValue__factory(Type enumType, String entry, int ordinal) {
        return new EnumValueImpl(enumType, entry, ordinal);
    }

    // =========================================================
    //          TypeSpec
    // =========================================================

    /**
     * Specification of a signature.
     *
     * @param returnType Return type.
     * @return Specification of a signature.
     */
    public static TypeSpec typeSpec(Type returnType) {
        return typeSpec__factory(returnType, new Type[]{});
    }

    /**
     * Specification of a signature.
     *
     * @param returnType     Return type.
     * @param parameterTypes Parameter types.
     * @return Specification of a signature.
     */
    public static TypeSpec typeSpec(Type returnType, Type... parameterTypes) {
        return typeSpec__factory(returnType, parameterTypes);
    }

    /**
     * Specification of a constructor signature.
     *
     * @return Specification of a signature.
     */
    public static TypeSpec constructorTypeSpec() {
        return typeSpec__factory(Types.VOID);
    }

    /**
     * Specification of a constructor signature.
     *
     * @param parameterTypes Parameter types.
     * @return Specification of a signature.
     */
    public static TypeSpec constructorTypeSpec(Type... parameterTypes) {
        return typeSpec__factory(Types.VOID, parameterTypes);
    }

    /**
     * Specification of a method that returns void.
     *
     * @param parameterTypes Parameter types.
     * @return Specification of a signature.
     */
    public static TypeSpec voidTypeSpec(Type... parameterTypes) {
        return typeSpec__factory(Types.VOID, parameterTypes);
    }

    // Factory

    private static TypeSpec typeSpec__factory(Type returnType) {
        return new TypeSpec(returnType, Collections.emptyList());
    }

    private static TypeSpec typeSpec__factory(Type returnType, Type[] parameterTypes) {
        return new TypeSpec(returnType, ArrayToList.toList(parameterTypes));
    }

    // =========================================================
    //          Cast
    // =========================================================

    /**
     * Cast an element from a type to another type.
     *
     * @param fromType   From type.
     * @param toType     Target type to cast.
     * @param partToCast Part to cast.
     * @return Cast of element.
     */
    public static Cast cast(Type fromType, Type toType, CodePart partToCast) {
        return cast__Factory(fromType, toType, partToCast);
    }

    // Factory
    private static Cast cast__Factory(Type fromType, Type toType, CodePart partToCast) {
        return new CastImpl(fromType, toType, partToCast);
    }

    // =========================================================
    //          If statement
    // =========================================================

    /**
     * Create a if statement.
     *
     * @param expressions   Expressions.
     * @param body          Body of the if.
     * @param elseStatement Else statement of the if.
     * @return If statement.
     */
    public static IfStatement ifStatement(List<CodePart> expressions, CodeSource body, CodeSource elseStatement) {
        return ifStatement__Factory(expressions, body, elseStatement);
    }

    /**
     * Create a if statement.
     *
     * @param expressions Expressions.
     * @param body        Body of the if.
     * @return If statement.
     */
    public static IfStatement ifStatement(List<CodePart> expressions, CodeSource body) {
        return ifStatement__Factory(expressions, body, CodeSource.empty());
    }

    /**
     * Create a if statement.
     *
     * @param ifExpr        Expression.
     * @param body          Body of the if.
     * @param elseStatement Else statement of the if.
     * @return If statement.
     */
    public static IfStatement ifStatement(IfExpr ifExpr, CodeSource body, CodeSource elseStatement) {
        return ifStatement__Factory(CodeAPI.ifExprs(ifExpr), body, elseStatement);
    }

    /**
     * Create a if statement.
     *
     * @param ifExpr Expression.
     * @param body   Body of the if.
     * @return If statement.
     */
    public static IfStatement ifStatement(IfExpr ifExpr, CodeSource body) {
        return ifStatement__Factory(CodeAPI.ifExprs(ifExpr), body, CodeSource.empty());
    }


    // Factory
    private static IfStatement ifStatement__Factory(List<CodePart> check, CodeSource body, CodeSource elseStatement) {
        return new IfStatementImpl(check, body, elseStatement);
    }

    // =========================================================
    //          If Checks
    // =========================================================

    /**
     * Check if a part is not null.
     *
     * @param part Part to check.
     * @return The verification part.
     */
    public static IfExpr checkNotNull(CodePart part) {
        return new IfExprImpl(part, Operators.NOT_EQUAL_TO, Literals.NULL);
    }

    /**
     * Check if a part is null.
     *
     * @param part Part to check.
     * @return The verification part.
     */
    public static IfExpr checkNull(CodePart part) {
        return new IfExprImpl(part, Operators.EQUAL_TO, Literals.NULL);
    }

    /**
     * Check if a expression is true.
     *
     * @param part Part to check.
     * @return The verification part.
     */
    public static IfExpr checkTrue(CodePart part) {
        return new IfExprImpl(part, Operators.EQUAL_TO, Literals.TRUE);
    }

    /**
     * Check if a expression is false.
     *
     * @param part Part to check.
     * @return The verification part.
     */
    public static IfExpr checkFalse(CodePart part) {
        return new IfExprImpl(part, Operators.EQUAL_TO, Literals.FALSE);
    }

    /**
     * Create a check condition.
     *
     * @param part1    Part 1.
     * @param operator Operation to do over two values.
     * @param part2    Part2.
     * @return The verification part.
     */
    public static IfExpr check(CodePart part1, Operator.Conditional operator, CodePart part2) {
        return new IfExprImpl(part1, operator, part2);
    }

    public static IfExpressionHelper expressionHelper() {
        return IfExpressionHelper.builder();
    }

    // =========================================================
    //          Lables
    // =========================================================

    /**
     * Create a label.
     *
     * @param name Name of the label
     * @param body Body of label.
     * @return new label.
     */
    public static Label label(String name, CodeSource body) {
        return new LabelImpl(name, body);
    }

    // =========================================================
    //          Break and Continue
    // =========================================================

    /**
     * Break the flow
     *
     * @return Break ControlFlow
     */
    public static ControlFlow aBreak() {
        return CodeAPI.break__Factory(null);
    }

    /**
     * Break the flow
     *
     * @param label Label to break.
     * @return Break ControlFlow
     */
    public static ControlFlow aBreak(Label label) {
        return CodeAPI.break__Factory(label);
    }

    /**
     * Continue the flow
     *
     * @return Continue ControlFlow
     */
    public static ControlFlow aContinue() {
        return CodeAPI.continue__Factory(null);
    }

    /**
     * Continue the flow
     *
     * @param label Label to continue.
     * @return Continue ControlFlow
     */
    public static ControlFlow aContinue(Label label) {
        return CodeAPI.continue__Factory(label);
    }

    // Factory
    private static ControlFlow break__Factory(Label label) {
        return new ControlFlowImpl(ControlFlow.Type.BREAK, label);
    }

    private static ControlFlow continue__Factory(Label label) {
        return new ControlFlowImpl(ControlFlow.Type.CONTINUE, label);
    }

    // =========================================================
    //          Instance Of
    // =========================================================

    /**
     * Check if {@link CodePart part} is instance of {@link Type type}.
     *
     * @param part Part.
     * @param type Type.
     * @return The verification part.
     */
    public static InstanceOfCheck isInstanceOf(CodePart part, Type type) {
        return new InstanceOfCheckImpl(part, type);
    }

    // =========================================================
    //          Try statement
    // =========================================================

    /**
     * Create a try-catch-finally statement.
     *
     * @param toSurround      Code to surround.
     * @param catchStatements Catch statements.
     * @param finallySource   Finally statement.
     * @return Try-Catch-Finally statement.
     */
    public static TryStatement tryStatement(CodeSource toSurround, List<CatchStatement> catchStatements, CodeSource finallySource) {
        return tryStatement__Factory(toSurround, catchStatements, finallySource);
    }

    /**
     * Create a try-catch-finally statement.
     *
     * @param toSurround     Code to surround.
     * @param catchStatement Catch statement.
     * @param finallySource  Finally statement.
     * @return Try-Catch-Finally statement.
     */
    public static TryStatement tryStatement(CodeSource toSurround, CatchStatement catchStatement, CodeSource finallySource) {
        return tryStatement__Factory(toSurround, Collections.singletonList(catchStatement), finallySource);
    }

    /**
     * Create a try-catch statement.
     *
     * @param toSurround      Code to surround.
     * @param catchStatements Catch statements.
     * @return Try-Catch statement.
     */
    public static TryStatement tryStatement(CodeSource toSurround, List<CatchStatement> catchStatements) {
        return tryStatement__Factory(toSurround, catchStatements, emptySource());
    }

    /**
     * Create a try-catch statement.
     *
     * @param toSurround     Code to surround.
     * @param catchStatement Catch statement.
     * @return Try-Catch statement.
     */
    public static TryStatement tryStatement(CodeSource toSurround, CatchStatement catchStatement) {
        return tryStatement__Factory(toSurround, Collections.singletonList(catchStatement), emptySource());
    }

    // Factory
    private static TryStatement tryStatement__Factory(CodeSource toSurround, List<CatchStatement> catchStatements, CodeSource finallySource) {

        return new TryStatementImpl(toSurround, catchStatements, finallySource);
    }

    // =========================================================
    //          Catch statement
    // =========================================================

    /**
     * Create a catch statement for try-catch statement.
     *
     * @param exception Exception type to handle.
     * @param variable  Variable to store exception.
     * @param body      Body of the catch statement.
     * @return Catch statement.
     */
    public static CatchStatement catchStatement(Type exception, VariableDeclaration variable, CodeSource body) {
        return catchStatement__Factory(Collections.singletonList(exception), variable, body);
    }

    /**
     * Create a catch statement for try-catch statement.
     *
     * @param exceptions Exception types.
     * @param variable   Variable to store exception.
     * @param body       Body of the catch statement.
     * @return Catch statement.
     */
    public static CatchStatement catchStatement(List<Type> exceptions, VariableDeclaration variable, CodeSource body) {
        return catchStatement__Factory(exceptions, variable, body);
    }

    // Factory
    private static CatchStatement catchStatement__Factory(List<Type> exceptionTypes, VariableDeclaration exceptionVariable, CodeSource body) {
        return new CatchStatementImpl(exceptionTypes, body, exceptionVariable);
    }

    // =========================================================
    //          Try With resources statement
    // =========================================================

    /**
     * Create a try-with-resources statement.
     *
     * @param variable        Resource variable
     * @param toSurround      Code to surround.
     * @param catchStatements Catch statements.
     * @param finallySource   Finally statement.
     * @return Try-with-resources statement.
     */
    public static TryWithResources tryWithResources(VariableDeclaration variable, CodeSource toSurround, List<CatchStatement> catchStatements, CodeSource finallySource) {
        return tryWithResources__Factory(variable, toSurround, catchStatements, finallySource);
    }

    /**
     * Create a try-with-resources statement.
     *
     * @param variable       Resource variable
     * @param toSurround     Code to surround.
     * @param catchStatement Catch statement.
     * @param finallySource  Finally statement.
     * @return Try-with-resources statement.
     */
    public static TryWithResources tryWithResources(VariableDeclaration variable, CodeSource toSurround, CatchStatement catchStatement, CodeSource finallySource) {
        return tryWithResources__Factory(variable, toSurround, Collections.singletonList(catchStatement), finallySource);
    }

    /**
     * Create a try-with-resources statement.
     *
     * @param variable      Resource variable
     * @param toSurround    Code to surround.
     * @param finallySource Finally statement.
     * @return Try-with-resources statement.
     */
    public static TryWithResources tryWithResources(VariableDeclaration variable, CodeSource toSurround, CodeSource finallySource) {
        return tryWithResources__Factory(variable, toSurround, Collections.emptyList(), finallySource);
    }

    /**
     * /**
     * Create a try-with-resources statement.
     *
     * @param variable        Resource variable
     * @param toSurround      Code to surround.
     * @param catchStatements Catch statements.
     * @return Try-with-resources statement.
     */
    public static TryWithResources tryWithResources(VariableDeclaration variable, CodeSource toSurround, List<CatchStatement> catchStatements) {
        return tryWithResources__Factory(variable, toSurround, catchStatements, emptySource());
    }

    /**
     * /**
     * Create a try-with-resources statement.
     *
     * @param variable       Resource variable
     * @param toSurround     Code to surround.
     * @param catchStatement Catch statement.
     * @return Try-with-resources statement.
     */
    public static TryWithResources tryWithResources(VariableDeclaration variable, CodeSource toSurround, CatchStatement catchStatement) {
        return tryWithResources__Factory(variable, toSurround, Collections.singletonList(catchStatement), emptySource());
    }

    /**
     * Create a try-with-resources statement.
     *
     * @param variable   Resource variable
     * @param toSurround Code to surround.
     * @return Try-with-resources statement.
     */
    public static TryWithResources tryWithResources(VariableDeclaration variable, CodeSource toSurround) {
        return tryWithResources__Factory(variable, toSurround, Collections.emptyList(), emptySource());
    }

    // Factory
    private static TryWithResources tryWithResources__Factory(VariableDeclaration variable, CodeSource toSurround, List<CatchStatement> catchStatements, CodeSource finallySource) {
        return new TryWithResourcesImpl(variable, catchStatements, finallySource, toSurround);
    }

    // =========================================================
    //          WhileStatement
    // =========================================================

    public static WhileStatement whileStatement(List<CodePart> check, CodeSource source) {
        return whileStatement__Factory(check, source);
    }

    // Factory
    private static WhileStatement whileStatement__Factory(List<CodePart> check, CodeSource source) {
        return new WhileStatementImpl(WhileStatement.Type.WHILE, check, source);
    }

    // =========================================================
    //          DoWhileStatement
    // =========================================================

    /**
     * Create a do-while statement.
     *
     * @param check  Expression.
     * @param source Source.
     * @return Do-while statement.
     */
    public static WhileStatement doWhileStatement(List<CodePart> check, CodeSource source) {
        return doWhileStatement__Factory(source, check);
    }

    // Factory
    private static WhileStatement doWhileStatement__Factory(CodeSource source, List<CodePart> check) {
        return new WhileStatementImpl(WhileStatement.Type.DO_WHILE, check, source);
    }

    // =========================================================
    //          ForStatement
    // =========================================================

    /**
     * Create a for statement.
     *
     * @param initialization For initialization.
     * @param condition      Condition.
     * @param update         For Update
     * @param body           For body.
     * @return For statement.
     */
    public static ForStatement forStatement(CodePart initialization, List<CodePart> condition, CodePart update, CodeSource body) {
        return forStatement__Factory(initialization, condition, update, body);
    }

    // Factory
    private static ForStatement forStatement__Factory(CodePart initialization, List<CodePart> condition, CodePart update, CodeSource body) {
        return new ForStatementImpl(initialization, condition, update, body);
    }

    // =========================================================
    //          ForeachStatement
    // =========================================================

    /**
     * Create a ForEach statement.
     *
     * <pre>{@code
     * forEachStatement(field IterationType expression) body
     * }</pre>
     *
     * @param variable      Variable to store values.
     * @param iterationType Iteration type (constants: {@link IterationTypes}).
     * @param expression    Expression.
     * @param body          For each statement.
     * @return ForEach statement.
     */
    public static ForEachStatement forEachStatement(VariableDeclaration variable, IterationType iterationType, CodePart expression, CodeSource body) {
        return forEachStatement__Factory(variable, iterationType, expression, body);
    }

    /**
     * ForEach statement iterating an array.
     *
     * <pre>{@code
     * forEachStatement(field : expression) body
     * }</pre>
     *
     * @param variable   Variable to store values.
     * @param expression Expression (the array).
     * @param body       ForEach body.
     * @return ForEach statement iterating an array.
     */
    public static ForEachStatement forEachArray(VariableDeclaration variable, CodePart expression, CodeSource body) {
        return forEachStatement__Factory(variable, IterationTypes.ARRAY, expression, body);
    }

    /**
     * ForEach statement iterating an iterable element.
     *
     * <pre>{@code
     * forEachStatement(field : expression) body
     * }</pre>
     *
     * @param variable   Variable to store values.
     * @param expression Expression (the iterable object).
     * @param body       ForEach body.
     * @return ForEach statement iterating an iterable element.
     */
    public static ForEachStatement forEachIterable(VariableDeclaration variable, CodePart expression, CodeSource body) {
        return forEachStatement__Factory(variable, IterationTypes.ITERABLE_ELEMENT, expression, body);
    }

    // Factory
    private static ForEachStatement forEachStatement__Factory(VariableDeclaration variable, IterationType iterationType, CodePart expression, CodeSource body) {
        return new ForEachStatementImpl(variable, iterationType, expression, body);
    }

    // =========================================================
    //          Method Spec
    // =========================================================

    /**
     * Specification of a method.
     *
     * @param location       Localization of method.
     * @param returnType     Return type of the method.
     * @param methodName     Name of the method.
     * @param parameterTypes Parameter types of the method.
     * @return Specification of a method.
     */
    public static MethodTypeSpec methodTypeSpec(Type location, Type returnType, String methodName, Type... parameterTypes) {
        return new MethodTypeSpec(location, methodName, new TypeSpec(returnType, ArrayToList.toList(parameterTypes)));
    }

    // =========================================================
    //          Invoke Spec
    // =========================================================

    /**
     * Specification of a method to invoke.
     *
     * @param invokeType     Invocation type.
     * @param location       Localization of method.
     * @param returnType     Return type of the method.
     * @param methodName     Name of the method.
     * @param parameterTypes Parameter types of the method.
     * @return Specification of a method.
     */
     public static MethodInvokeSpec methodInvokeSpec(InvokeType invokeType, Type location, Type returnType, String methodName, Type... parameterTypes) {
        return new MethodInvokeSpec(invokeType, new MethodTypeSpec(location, methodName, new TypeSpec(returnType, ArrayToList.toList(parameterTypes))));
    }

    // =========================================================
    //          Method fragment
    // =========================================================

    /**
     * Create a method fragment.
     *
     * @param typeDeclaration Class to insert method.
     * @param scope           Scope of fragment.
     * @param returnType      Return type of method.
     * @param parameters      Parameters of the method.
     * @param arguments       Arguments to pass to method.
     * @param body            Body of method.
     * @return Method fragment.
     */
    public static MethodFragment fragment(TypeDeclaration typeDeclaration, Scope scope, Type returnType, CodeParameter[] parameters, CodePart[] arguments, CodeSource body) {
        return fragment__factory(typeDeclaration, scope, returnType, parameters, arguments, body);
    }

    /**
     * Create a static method fragment.
     *
     * @param typeDeclaration Class to insert method.
     * @param returnType      Return type of method.
     * @param parameters      Parameters of the method.
     * @param arguments       Arguments to pass to method.
     * @param body            Body of method.
     * @return Method fragment.
     */
    public static MethodFragment fragmentStatic(TypeDeclaration typeDeclaration, Type returnType, CodeParameter[] parameters, CodePart[] arguments, CodeSource body) {
        return fragment__factory(typeDeclaration, Scope.STATIC, returnType, parameters, arguments, body);
    }

    /**
     * Create a instance method fragment.
     *
     * @param typeDeclaration Class to insert method.
     * @param returnType      Return type of method.
     * @param parameters      Parameters of the method.
     * @param arguments       Arguments to pass to method.
     * @param body            Body of method.
     * @return Method fragment.
     */
    public static MethodFragment fragmentInstance(TypeDeclaration typeDeclaration, Type returnType, CodeParameter[] parameters, CodePart[] arguments, CodeSource body) {
        return fragment__factory(typeDeclaration, Scope.INSTANCE, returnType, parameters, arguments, body);
    }

    // Factory
    private static MethodFragment fragment__factory(TypeDeclaration typeDeclaration, Scope scope, Type returnType, CodeParameter[] parameters, CodePart[] arguments, CodeSource body) {

        List<CodeParameter> parameterList = ArrayToList.toList(parameters);

        return new SimpleMethodFragmentImpl(typeDeclaration, scope, ArrayToList.toList(arguments),
                new TypeSpec(returnType, parameterList.stream().map(CodeParameter::getType).collect(Collectors.toList())),
                parameterList, body);
    }

    // =========================================================
    //          Switch & Case
    // =========================================================

    public static SwitchStatement switchInt(Typed value, Case... cases) {
        return switch__factory(SwitchTypes.NUMERIC, value, ArrayToList.toList(cases));
    }

    public static SwitchStatement switchString(Typed value, Case... cases) {
        return switch__factory(SwitchTypes.STRING, value, ArrayToList.toList(cases));
    }

    public static SwitchStatement switchEnum(Typed value, Case... cases) {
        return switch__factory(SwitchTypes.ENUM, value, ArrayToList.toList(cases));
    }

    public static SwitchStatement switchObject(Typed value, Case... cases) {
        return switch__factory(SwitchTypes.OBJECT, value, ArrayToList.toList(cases));
    }

    public static SwitchStatement switchDefined(SwitchType switchType, Typed value, Case... cases) {
        return switch__factory(switchType, value, ArrayToList.toList(cases));
    }

    // Case
    public static Case aCase(Typed value, CodeSource body) {
        return case__factory(value, body);
    }

    public static Case caseDefault(CodeSource body) {
        return case__factory(null, body);
    }

    // Factory
    private static SwitchStatement switch__factory(SwitchType switchType, Typed value, List<Case> caseList) {
        return new SwitchStatementImpl(value, switchType, caseList);
    }

    private static Case case__factory(Typed value, CodeSource body) {
        return new CaseImpl(value, body);
    }


    // =========================================================
    //          Bridge Method
    // =========================================================

    public static MethodDeclaration bridgeMethod(TypeDeclaration owner, MethodDeclaration current, MethodTypeSpec methodSpec) {
        List<Type> parameterTypes = methodSpec.getTypeSpec().getParameterTypes();
        List<CodeParameter> currentParameters = current.getParameters();

        if (parameterTypes.size() > currentParameters.size())
            throw new IllegalArgumentException("Specified target method has more parameters than current method!");

        Type currentReturnType = current.getReturnType();

        boolean return_ = !Identity.is(currentReturnType, Types.VOID);

        List<CodeParameter> codeParameters = new ArrayList<>();
        List<CodePart> codeArguments = new ArrayList<>();

        for (int i = 0; i < currentParameters.size(); i++) {
            CodeParameter currentParameter = currentParameters.get(i);
            Type currentType = currentParameter.getType();
            Type targetType = parameterTypes.get(i);

            codeParameters.add(new CodeParameter(targetType, currentParameter.getName()));

            codeArguments.add(CodeAPI.cast(targetType, currentType, CodeAPI.accessLocalVariable(targetType, currentParameter.getName())));
        }


        boolean isStatic = current.getModifiers().contains(CodeModifier.STATIC);

        InvokeType invokeType = isStatic ? InvokeType.INVOKE_STATIC : InvokeType.get(owner);


        CodePart toAdd = CodeAPI.invoke(invokeType,
                isStatic ? owner : Alias.THIS.INSTANCE, isStatic ? CodeAPI.accessStatic() : CodeAPI.accessThis(),
                methodSpec.getMethodName(),
                new TypeSpec(currentReturnType, currentParameters.stream().map(CodeParameter::getType).collect(Collectors.toList())),
                codeArguments);

        if (return_) {
            Type returnType = methodSpec.getTypeSpec().getReturnType();

            toAdd = CodeAPI.returnValue(returnType, CodeAPI.cast(currentReturnType, returnType, toAdd));
        }

        Set<CodeModifier> codeModifiers = new HashSet<>(current.getModifiers());

        codeModifiers.add(CodeModifier.BRIDGE);

        return new MethodDeclarationImpl(codeParameters, methodSpec.getMethodName(),
                Collections.emptyList(),
                CodeAPI.sourceOfParts(toAdd),
                currentReturnType,
                codeModifiers,
                GenericSignature.empty(),
                Comments.Absent.INSTANCE);
    }

    // =========================================================
    //          Utils
    // =========================================================

    /**
     * Access static {@link TypeDeclaration}.
     *
     * Equivalent to Java static context.
     *
     * @return Access static {@link TypeDeclaration}.
     */
    public static Access accessStatic() {
        return Defaults.ACCESS_STATIC;
    }

    /**
     * Access this {@link TypeDeclaration}.
     *
     * Equivalent to Java {@code this}.
     *
     * @return Access this {@link TypeDeclaration}.
     */
    public static Access accessLocal() {
        return Defaults.ACCESS_LOCAL;
    }

    /**
     * Access this {@link TypeDeclaration}.
     *
     * Equivalent to Java {@code this}.
     *
     * @return Access this {@link TypeDeclaration}.
     */
    public static Access accessThis() {
        return Defaults.ACCESS_THIS;
    }

    /**
     * Access super type of current {@link TypeDeclaration}.
     *
     * Equivalent to Java {@code super}.
     *
     * @return Access super type of current {@link TypeDeclaration}.
     */
    public static Access accessSuper() {
        return Defaults.ACCESS_SUPER;
    }

    /**
     * Access enclosing class of current {@link TypeDeclaration}.
     *
     * Equivalent to Java {@code CLASS.this}.
     *
     * @param localization Localization of outer class.
     * @return Access enclosing class of current {@link TypeDeclaration}.
     */
    public static Access accessOuter(Type localization) {
        return Common.accessOuter(localization);
    }

    /**
     * Plain code type.
     *
     * @param name        Name of the type.
     * @param isInterface Is the type an interface.
     * @return {@link PlainCodeType} representation.
     */
    public static PlainCodeType plainType(String name, boolean isInterface) {
        return new PlainCodeType(name, isInterface);
    }

    /**
     * Plain interface code type.
     *
     * @param name Name of the type.
     * @return {@link PlainCodeType} representation.
     */
    public static PlainCodeType plainInterfaceType(String name) {
        return new PlainCodeType(name, true);
    }

    /**
     * Plain class code type.
     *
     * @param name Name of the type.
     * @return {@link PlainCodeType} representation.
     */
    public static PlainCodeType plainClassType(String name) {
        return new PlainCodeType(name, false);
    }

    /**
     * Convert Java {@link Class class} to CodeAPI {@link CodeType type}.
     *
     * @param aClass Class to convert.
     * @return Converted type.
     */
    public static CodeType toCodeType(Class<?> aClass) {
        return CodeAPI.getJavaType(aClass);
    }

    /**
     * Convert Java {@link Class classes} to CodeAPI {@link CodeType types}.
     *
     * @param aClass Classes to convert.
     * @return Converted types.
     */
    public static CodeType[] toCodeType(Class<?>[] aClass) {
        return Arrays.stream(aClass).map(CodeAPI::getJavaType).toArray(CodeType[]::new);
    }

    /**
     * Helper method to create if expressions.
     *
     * @param objects {@link IfExpr IfExprs} and {@link Operator Operators}. If the object is not a
     *                {@link IfExpr} or {@link Operator}, but is an instance of {@link CodePart}
     *                then it will be wrapped in {@link CodeAPI#checkTrue(CodePart)}, if it is note
     *                instance of {@link CodePart} a {@link IllegalArgumentException} will be
     *                thrown.
     * @return If multi values.
     * @throws IllegalArgumentException If an element of {@code objects} is not {@link IfExpr},
     *                                  {@link Operator} or {@link CodePart}.
     */
    @SuppressWarnings("unchecked")
    public static List<CodePart> ifExprs(Object... objects) {
        List<CodePart> list = new ArrayList<>();

        for (Object object : objects) {
            if (object instanceof IfExpr || object instanceof Operator) {
                list.add((CodePart) object);
            } else if (object instanceof CodePart) {
                list.add(checkTrue((CodePart) object));
            } else if (object instanceof List<?>) {
                List<? extends CodePart> other = (List<? extends CodePart>) object;
                list.add(new IfGroup(other));
            } else {
                throw new IllegalArgumentException("Illegal input object: '" + object + "'.");
            }
        }

        return list;
    }

    public static ConcatHelper concatHelper() {
        return ConcatHelper.builder();
    }

    public static ConcatHelper concatHelper(CodePart... part) {
        if (part.length == 0)
            return ConcatHelper.builder();

        ConcatHelper helper = ConcatHelper.builder(part[0]);

        for (int i = 1; i < part.length; i++) {
            helper = helper.concat(part[i]);
        }

        return helper;
    }

    public static ConcatHelper concatHelper(String... strs) {
        if (strs.length == 0)
            return ConcatHelper.builder();

        ConcatHelper helper = ConcatHelper.builder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            helper = helper.concat(strs[i]);
        }

        return helper;
    }

    public static ConcatHelper concatHelperObj(Object... objs) {
        if (objs.length == 0)
            return ConcatHelper.builder();

        ConcatHelper helper;

        Object at0 = objs[0];

        if (at0 instanceof CodePart) {
            helper = ConcatHelper.builder((CodePart) at0);
        } else if (at0 instanceof String) {
            helper = ConcatHelper.builder((String) at0);
        } else {
            throw new IllegalArgumentException("Invalid element type at index 0 (" + at0 + ") in array: '" + Arrays.toString(objs) + "'! Acceptable types: String|CodePart");
        }

        for (int i = 1; i < objs.length; i++) {
            Object atI = objs[i];
            if (at0 instanceof CodePart) {
                helper = helper.concat((CodePart) atI);
            } else {
                helper = helper.concat((String) atI);
            }

        }

        return helper;
    }

    /**
     * Helper method to create maps.
     *
     * @param objects Objects (Key and values).
     * @return Map of keys and values.
     */
    public static Map<String, Object> values(Object... objects) {
        Map<String, Object> map = new HashMap<>();

        if (objects.length % 2 != 0) {
            throw new IllegalArgumentException("Input must be odd (Pair of String and Object)");
        }

        for (int i = 0; i < objects.length; i += 2) {
            map.put((String) objects[i], objects[i + 1]);
        }

        return map;
    }

    @SuppressWarnings("unchecked")
    public static <T> LoadedCodeType<T> getJavaType(Class<T> aClass) {

        if (aClass.isArray())
            return getJavaType0(aClass);

        if (CODE_TYPES_CACHE.containsKey(aClass)) {
            CodeType codeType = CODE_TYPES_CACHE.get(aClass);

            if (codeType != null && codeType instanceof LoadedCodeType)
                return (LoadedCodeType<T>) codeType;
        }

        JavaType<T> javaType = new JavaType<>(aClass);

        CODE_TYPES_CACHE.put(aClass, javaType);

        return javaType;

    }

    @SuppressWarnings("unchecked")
    private static <T> LoadedCodeType<T> getJavaType0(Class<T> aClass) {

        if (CODE_TYPES_CACHE.containsKey(aClass)) {
            CodeType codeType = CODE_TYPES_CACHE.get(aClass);

            if (codeType != null && codeType instanceof LoadedCodeType)
                return (LoadedCodeType<T>) codeType;
        }

        LoadedCodeType<T> type = new JavaType<>(aClass);

        if (aClass.isArray()) {
            Class<?> component = aClass;

            int dimensions = 0;

            do {
                ++dimensions;
            } while ((component = component.getComponentType()).isArray());

            type = new JavaType<>((Class<T>) component).toLoadedArray(aClass, dimensions);
        }

        CODE_TYPES_CACHE.put(aClass, type);

        return type;

    }

    @SuppressWarnings("unchecked")
    public static LoadedCodeType<?>[] getJavaTypes(Class<?>[] aClass) {
        return Arrays.stream(aClass).map(CodeAPI::getJavaType).toArray(LoadedCodeType[]::new);
    }

    @SuppressWarnings("unchecked")
    public static List<LoadedCodeType<?>> getJavaTypeList(Class<?>[] aClass) {
        return Arrays.stream(aClass).map(CodeAPI::getJavaType).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public static List<LoadedCodeType<?>> getJavaTypeList(Iterable<Class<?>> classes) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(classes.iterator(), Spliterator.ORDERED), false).map(CodeAPI::getJavaType).collect(Collectors.toList());
    }


    /**
     * Generator Specific features
     *
     * Not supported by Java Source Code generation. ({@code PlainSourceGenerator}).
     */
    public static class Specific {
        // =========================================================
        //          Invoke Dynamic
        // =========================================================

        /**
         * Invoke dynamic method.
         *
         * @param invokeDynamic    Dynamic invocation specification.
         * @param methodInvocation Method to invoke dynamically.
         * @return Dynamic invocation.
         */
        public static MethodInvocation invokeDynamic(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
            return Specific.invokeDynamic__factory(invokeDynamic, methodInvocation);
        }

        /**
         * Invoke a LambdaFragment.
         *
         * @param fragment Lambda Fragment.
         * @return Invocation of lambda fragment.
         */
        public static MethodInvocation invokeDynamicFragment(InvokeDynamic.LambdaFragment fragment) {
            return Specific.invokeDynamic__factory(fragment);
        }

        // Factory
        private static MethodInvocation invokeDynamic__factory(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
            return CodeAPI.invokeDynamic(invokeDynamic, methodInvocation);
        }

        private static MethodInvocation invokeDynamic__factory(InvokeDynamic.LambdaFragment fragment) {
            return CodeAPI.invokeDynamicFragment(fragment);
        }

        // Utils

        /**
         * Invoke Bootstrap methods with bsm parameters
         *
         * @param invokeType     Invocation Type.
         * @param methodTypeSpec Bootstrap method.
         * @param args           BSM Arguments, must be an {@link String}, {@link Integer}, {@link
         *                       Long}, {@link Float}, {@link Double}, {@link Type}, or {@link
         *                       MethodInvokeSpec}.
         * @return Bootstrap specification.
         */
        public static InvokeDynamic.Bootstrap bootstrap(InvokeType invokeType, MethodTypeSpec methodTypeSpec, Object... args) {
            return new InvokeDynamic.Bootstrap(methodTypeSpec, invokeType, args);
        }

        /**
         * Invoke a Bootstrap method.
         *
         * @param invokeType     Invocation Type.
         * @param methodTypeSpec Bootstrap method.
         * @return Bootstrap specification.
         */
        public static InvokeDynamic.Bootstrap bootstrap(InvokeType invokeType, MethodTypeSpec methodTypeSpec) {
            return new InvokeDynamic.Bootstrap(methodTypeSpec, invokeType, new Object[0]);
        }

        /**
         * Invoke a lambda method reference.
         *
         * @param methodTypeSpec Method specification ({@link InvokeDynamic}).
         * @param expectedTypes  Expected types.
         * @return Lambda Method Reference specification.
         * @see InvokeDynamic
         */
        public static InvokeDynamic.LambdaMethodReference lambda(MethodTypeSpec methodTypeSpec, TypeSpec expectedTypes) {
            return new InvokeDynamic.LambdaMethodReference(methodTypeSpec, expectedTypes);
        }

        /**
         * Invoke a lambda code.
         *
         * @param methodTypeSpec Method specification ({@link InvokeDynamic}).
         * @param expectedTypes  Expected types.
         * @param methodFragment Fragment to invoke.
         * @return Lambda Method Reference specification.
         * @see InvokeDynamic
         */
        public static InvokeDynamic.LambdaFragment code(MethodTypeSpec methodTypeSpec, TypeSpec expectedTypes, MethodFragment methodFragment) {
            return new InvokeDynamic.LambdaFragment(methodTypeSpec, expectedTypes, methodFragment);
        }

    }

}
