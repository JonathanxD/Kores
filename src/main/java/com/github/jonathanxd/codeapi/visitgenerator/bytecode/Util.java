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
package com.github.jonathanxd.codeapi.visitgenerator.bytecode;

import com.github.jonathanxd.codeapi.CodeAPI;
import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.common.CodeModifier;
import com.github.jonathanxd.codeapi.common.InnerType;
import com.github.jonathanxd.codeapi.common.MVData;
import com.github.jonathanxd.codeapi.interfaces.AccessThis;
import com.github.jonathanxd.codeapi.interfaces.Accessor;
import com.github.jonathanxd.codeapi.interfaces.FieldDeclaration;
import com.github.jonathanxd.codeapi.interfaces.TypeDeclaration;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.util.Lazy;
import com.github.jonathanxd.codeapi.visitgenerator.VisitorGenerator;
import com.github.jonathanxd.iutils.containers.MutableContainer;
import com.github.jonathanxd.iutils.data.MapData;
import com.github.jonathanxd.iutils.object.Pair;
import com.github.jonathanxd.iutils.type.TypeInfo;

import org.objectweb.asm.ClassWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Util {

    @SuppressWarnings("unchecked")
    public static <T> T find(TypeInfo<T> typeInfo, MapData data, Object additional) {
        Class<? extends T> aClass = typeInfo.getAClass();

        Optional<T> optional = data.getOptional(typeInfo);

        if (additional != null && aClass.isInstance(additional)) {
            return (T) additional;
        } else {
            return optional.orElseThrow(() -> new IllegalArgumentException("Could not determine: " + typeInfo + "! You must to register. Current additional data: " + additional));
        }
    }

    public static Pair<List<TypeDeclaration>, CodeSource> grabAndRemoveInnerDecl(CodeSource source) {

        if (source == null)
            return null;

        List<TypeDeclaration> typeDeclarationList = new ArrayList<>();
        CodeSource codeSource = new CodeSource();

        Pair<List<TypeDeclaration>, CodeSource> pair = Pair.of(typeDeclarationList, codeSource);

        for (CodePart part : source) {
            if (part instanceof CodeSource) {
                Pair<List<TypeDeclaration>, CodeSource> listCodeSourcePair = Util.grabAndRemoveInnerDecl((CodeSource) part);

                typeDeclarationList.addAll(listCodeSourcePair._1());

                codeSource.add(listCodeSourcePair._2());
            } else {
                if (part instanceof TypeDeclaration) {
                    typeDeclarationList.add((TypeDeclaration) part);
                } else {
                    codeSource.add(part);
                }
            }
        }

        return pair;
    }


    public static List<TypeDeclaration> visitInner(ClassWriter cw, TypeDeclaration outer, List<TypeDeclaration> innerClasses) {

        List<TypeDeclaration> visited = new ArrayList<>();
        String name = Common.codeTypeToSimpleAsm(outer);

        for (TypeDeclaration innerClass : innerClasses) {
            int modifiers = Common.modifierToAsm(innerClass);

            cw.visitInnerClass(name + "$" + innerClass.getQualifiedName(), name, innerClass.getQualifiedName(), modifiers);

            CodeSource source = new CodeSource(innerClass.getBody().orElse(new CodeSource()));

            InstructionCodePart instructionCodePart = (value, extraData, visitorGenerator, additional) -> {
                extraData.getRequired(TypeVisitor.CLASS_WRITER_REPRESENTATION)
                        .visitInnerClass(name + "$" + innerClass.getQualifiedName(), name, innerClass.getQualifiedName(), modifiers);
            };

            source.add(0, instructionCodePart);

            visited.add(innerClass.setBody(source));
        }

        return visited;
    }

    public static List<TypeDeclaration> fixNames(List<TypeDeclaration> innerClasses, TypeDeclaration outer) {
        return innerClasses.stream()
                .map(typeDeclaration -> typeDeclaration.setName(outer.getQualifiedName() + "$" + typeDeclaration.getQualifiedName()))
                .collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public static <T extends Accessor> T fixAccessor(T accessor, MapData extraData,
                                                     MutableContainer<CodeType> localization,
                                                     BiConsumer<MutableContainer<T>, InnerType> consumer) {


        List<InnerType> innerTypes = extraData.getAllAsList(TypeVisitor.INNER_TYPE_REPRESENTATION);
        List<TypeDeclaration> outerTypes = extraData.getAllAsList(TypeVisitor.OUTER_TYPE_REPRESENTATION);

        for (InnerType innerType : innerTypes) {

            TypeDeclaration originalDeclaration = innerType.getOriginalDeclaration();

            if (originalDeclaration.getModifiers().contains(CodeModifier.STATIC))
                continue;


            if (originalDeclaration.getCanonicalName().equals(localization.get().getCanonicalName())) {
                localization.set(innerType.getAdaptedDeclaration());

                accessor = (T) accessor.setLocalization(localization.get());

                if (consumer != null) {
                    MutableContainer<T> container = MutableContainer.of(accessor);
                    consumer.accept(container, innerType);
                    accessor = container.get();
                }

                return accessor;
            }
        }


        return accessor;
    }

    @SuppressWarnings("unchecked")
    public static CodePart accessEnclosingClass(MapData extraData,
                                                CodePart target,
                                                CodeType localization,
                                                VisitorGenerator<?> visitorGenerator,
                                                MVData mvData) {
        Lazy<CodeType> enclosingType = new Lazy<>(() -> extraData.getRequired(TypeVisitor.CODE_TYPE_REPRESENTATION, "Cannot determine current type!"));

        if (target instanceof AccessThis && localization != null && !localization.is(enclosingType.get())) {
            List<FieldDeclaration> allAsList = extraData.getAllAsList(TypeVisitor.OUTER_FIELD_REPRESENTATION);

            for (FieldDeclaration fieldDeclaration : allAsList) {
                if (fieldDeclaration.getVariableType().is(localization)) {
                    return CodeAPI.accessThisField(fieldDeclaration.getVariableType(), fieldDeclaration.getName());
                }
            }

        }

        return null;
    }
}