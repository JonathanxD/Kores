//[Kores](../../index.md)/[com.github.jonathanxd.kores.type](../index.md)/[AnnotatedKoresType](index.md)



# AnnotatedKoresType  
 [jvm] interface [AnnotatedKoresType](index.md) : [WrapperKoresType](../-wrapper-kores-type/index.md)

A [KoresType](../-kores-type/index.md) with annotations, to be used where TYPE_USE Annotations are allowed, but there is no limitation of where you can use.



This interface have various implementations, each implementation backing to variants of [KoresType](../-kores-type/index.md). But not all, there is no special implementation for TypeDeclaration for example, but only a generic implementation.

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract///PointingToDeclaration/"></a>[Abstract](-abstract/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract class [Abstract](-abstract/index.md)<out [T](-abstract/index.md) : [AnnotatedKoresType.Abstract](-abstract/index.md)<[T](-abstract/index.md)>>(**annotatedType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **annotations**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>, **factory**: (type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), annotations: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>) -> [T](-abstract/index.md)) : [AnnotatedKoresType](index.md), [KoresType](../-kores-type/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Builder///PointingToDeclaration/"></a>[Builder](-builder/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Builder///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>interface [Builder](-builder/index.md)<out [T](-builder/index.md) : [AnnotatedKoresType](index.md), [S](-builder/index.md) : [AnnotatedKoresType.Builder](-builder/index.md)<[T](-builder/index.md), [S](-builder/index.md)>> : [Builder](../../com.github.jonathanxd.kores.builder/-builder/index.md)<[T](-builder/index.md), [S](-builder/index.md)>   <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Companion///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType///PointingToDeclaration/"></a>[GenericAnnotatedKoresType](-generic-annotated-kores-type/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>class [GenericAnnotatedKoresType](-generic-annotated-kores-type/index.md)(**annotatedType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **annotations**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>) : [AnnotatedKoresType.Abstract](-abstract/index.md)<[AnnotatedKoresType.GenericAnnotatedKoresType](-generic-annotated-kores-type/index.md)> , [GenericType](../-generic-type/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedKoresType///PointingToDeclaration/"></a>[SimpleAnnotatedKoresType](-simple-annotated-kores-type/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedKoresType///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>class [SimpleAnnotatedKoresType](-simple-annotated-kores-type/index.md)(**annotatedType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **annotations**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>) : [AnnotatedKoresType.Abstract](-abstract/index.md)<[AnnotatedKoresType.SimpleAnnotatedKoresType](-simple-annotated-kores-type/index.md)>   <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedLoadedKoresType///PointingToDeclaration/"></a>[SimpleAnnotatedLoadedKoresType](-simple-annotated-loaded-kores-type/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedLoadedKoresType///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>class [SimpleAnnotatedLoadedKoresType](-simple-annotated-loaded-kores-type/index.md)<[T](-simple-annotated-loaded-kores-type/index.md)>(**annotatedType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **annotations**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>) : [AnnotatedKoresType.Abstract](-abstract/index.md)<[AnnotatedKoresType.SimpleAnnotatedLoadedKoresType](-simple-annotated-loaded-kores-type/index.md)<[T](-simple-annotated-loaded-kores-type/index.md)>> , [LoadedKoresType](../-loaded-kores-type/index.md)<[T](-simple-annotated-loaded-kores-type/index.md)>   <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedUnknownKoresType///PointingToDeclaration/"></a>[SimpleAnnotatedUnknownKoresType](-simple-annotated-unknown-kores-type/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedUnknownKoresType///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>class [SimpleAnnotatedUnknownKoresType](-simple-annotated-unknown-kores-type/index.md)(**annotatedType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **annotations**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>) : [AnnotatedKoresType.Abstract](-abstract/index.md)<[AnnotatedKoresType.SimpleAnnotatedUnknownKoresType](-simple-annotated-unknown-kores-type/index.md)> , [UnknownKoresType](../-unknown-kores-type/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedWrapperKoresType///PointingToDeclaration/"></a>[SimpleAnnotatedWrapperKoresType](-simple-annotated-wrapper-kores-type/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.SimpleAnnotatedWrapperKoresType///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>class [SimpleAnnotatedWrapperKoresType](-simple-annotated-wrapper-kores-type/index.md)(**wrapped**: [KoresType](../-kores-type/index.md), **annotatedType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **annotations**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>) : [AnnotatedKoresType.Abstract](-abstract/index.md)<[AnnotatedKoresType.SimpleAnnotatedKoresType](-simple-annotated-kores-type/index.md)>   <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/builder/#/PointingToDeclaration/"></a>[builder](builder.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/builder/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract override fun [builder](builder.md)(): [AnnotatedKoresType.Builder](-builder/index.md)<[AnnotatedKoresType](index.md), *>  <br>More info  <br>This builder may or may not accept null values, it depends on implementation.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/compareTo/#com.github.jonathanxd.kores.type.KoresType/PointingToDeclaration/"></a>[compareTo](../-kores-type/compare-to.md)| <a name="com.github.jonathanxd.kores.type/KoresType/compareTo/#com.github.jonathanxd.kores.type.KoresType/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [compareTo](../-kores-type/compare-to.md)(other: [KoresType](../-kores-type/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Compare two identifications  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-kores-type/equals.md)| <a name="com.github.jonathanxd.kores.type/KoresType/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract operator override fun [equals](../-kores-type/equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/getTypeName/#/PointingToDeclaration/"></a>[getTypeName](../-kores-type/get-type-name.md)| <a name="com.github.jonathanxd.kores.type/KoresType/getTypeName/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [getTypeName](../-kores-type/get-type-name.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-kores-type/hash-code.md)| <a name="com.github.jonathanxd.kores.type/KoresType/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract override fun [hashCode](../-kores-type/hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/is/#com.github.jonathanxd.kores.type.KoresType?/PointingToDeclaration/"></a>[is](../-kores-type/is.md)| <a name="com.github.jonathanxd.kores.type/KoresType/is/#com.github.jonathanxd.kores.type.KoresType?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [is](../-kores-type/is.md)(other: [KoresType](../-kores-type/index.md)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if this [KoresType](../-kores-type/index.md) is equals to other [KoresType](../-kores-type/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/isAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[isAssignableFrom](../-kores-type/is-assignable-from.md)| <a name="com.github.jonathanxd.kores.type/KoresType/isAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [isAssignableFrom](../-kores-type/is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if this type is assignable from [type](../-kores-type/type.md) (using default resolver of [type](../-kores-type/type.md)).  <br><br><br>[jvm]  <br>Content  <br>open fun [isAssignableFrom](../-kores-type/is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), resolverProvider: ([Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)) -> [KoresTypeResolver](../-kores-type-resolver/index.md)<*>): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if this type is assignable from [type](../-kores-type/type.md) (using resolver provided by resolverProvider).  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/isConcreteIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[isConcreteIdEq](../-kores-type/is-concrete-id-eq.md)| <a name="com.github.jonathanxd.kores.type/KoresType/isConcreteIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [isConcreteIdEq](../-kores-type/is-concrete-id-eq.md)(other: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if identification of [concreteType](../concrete-type.md) of this [KoresType](../-kores-type/index.md) is equals to [concreteType](../concrete-type.md) of other [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html) according to [is](../-kores-type/is.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/isIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[isIdEq](../-kores-type/is-id-eq.md)| <a name="com.github.jonathanxd.kores.type/KoresType/isIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [isIdEq](../-kores-type/is-id-eq.md)(other: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if this [KoresType](../-kores-type/index.md) identification is equals to other [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html) according to [is](../-kores-type/is.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/safeIsAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[safeIsAssignableFrom](../-kores-type/safe-is-assignable-from.md)| <a name="com.github.jonathanxd.kores.type/KoresType/safeIsAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [safeIsAssignableFrom](../-kores-type/safe-is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): EitherObjBoolean<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)>  <br>open fun [safeIsAssignableFrom](../-kores-type/safe-is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), resolverProvider: ([Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)) -> [KoresTypeResolver](../-kores-type-resolver/index.md)<*>): EitherObjBoolean<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)>  <br>More info  <br>Returns Either that holds either failure exception or whether this type is assignable from [type](../-kores-type/type.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/toArray/#kotlin.Int/PointingToDeclaration/"></a>[toArray](../-kores-type/to-array.md)| <a name="com.github.jonathanxd.kores.type/KoresType/toArray/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toArray](../-kores-type/to-array.md)(dimensions: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [KoresType](../-kores-type/index.md)  <br>More info  <br>Convert this [KoresType](../-kores-type/index.md) to a ArrayKoresType.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/annotatedType/#/PointingToDeclaration/"></a>[annotatedType](annotated-type.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/annotatedType/#/PointingToDeclaration/"></a> [jvm] abstract val [annotatedType](annotated-type.md): [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)The type that is annotated with [annotations](annotations.md).   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/annotations/#/PointingToDeclaration/"></a>[annotations](annotations.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/annotations/#/PointingToDeclaration/"></a> [jvm] abstract val [annotations](annotations.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../com.github.jonathanxd.kores.base/-annotation/index.md)>Annotations of the type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/arrayBaseComponent/#/PointingToDeclaration/"></a>[arrayBaseComponent](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FarrayBaseComponent%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/arrayBaseComponent/#/PointingToDeclaration/"></a> [jvm] open val [arrayBaseComponent](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FarrayBaseComponent%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [KoresType](../-kores-type/index.md)Array base component.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/arrayComponent/#/PointingToDeclaration/"></a>[arrayComponent](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FarrayComponent%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/arrayComponent/#/PointingToDeclaration/"></a> [jvm] open val [arrayComponent](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FarrayComponent%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [KoresType](../-kores-type/index.md)Array component.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/arrayDimension/#/PointingToDeclaration/"></a>[arrayDimension](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FarrayDimension%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/arrayDimension/#/PointingToDeclaration/"></a> [jvm] open val [arrayDimension](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FarrayDimension%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Array dimension, 0 if this type is not an array.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/binaryName/#/PointingToDeclaration/"></a>[binaryName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FbinaryName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/binaryName/#/PointingToDeclaration/"></a> [jvm] open val [binaryName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FbinaryName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Binary name of the class.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/bindedDefaultResolver/#/PointingToDeclaration/"></a>[bindedDefaultResolver](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FbindedDefaultResolver%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/bindedDefaultResolver/#/PointingToDeclaration/"></a> [jvm] open val [bindedDefaultResolver](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FbindedDefaultResolver%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [BindedTypeResolver](../-binded-type-resolver/index.md)<*>Creates a new binded default resolver instance.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/canonicalName/#/PointingToDeclaration/"></a>[canonicalName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FcanonicalName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/canonicalName/#/PointingToDeclaration/"></a> [jvm] abstract val [canonicalName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FcanonicalName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Canonical nameQualified name:[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = java.lang.String.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/defaultResolver/#/PointingToDeclaration/"></a>[defaultResolver](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FdefaultResolver%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/defaultResolver/#/PointingToDeclaration/"></a> [jvm] open val [defaultResolver](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FdefaultResolver%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [KoresTypeResolver](../-kores-type-resolver/index.md)<*>Default resolver.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/identification/#/PointingToDeclaration/"></a>[identification](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2Fidentification%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/identification/#/PointingToDeclaration/"></a> [jvm] open val [identification](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2Fidentification%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Unique string identification, this property may be used for equality comparison, normal types, array types and generic types have different identifications, if a generic type represent a single [KoresType](../-kores-type/index.md) without any bound, then the identification will be the same as the single [KoresType](../-kores-type/index.md).   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/interfaces/#/PointingToDeclaration/"></a>[interfaces](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2Finterfaces%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/interfaces/#/PointingToDeclaration/"></a> [jvm] open val [interfaces](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2Finterfaces%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)>Gets the super interfaces of this[Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html) using default resolver.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/internalName/#/PointingToDeclaration/"></a>[internalName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FinternalName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/internalName/#/PointingToDeclaration/"></a> [jvm] open val [internalName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FinternalName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Internal class name.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isArray/#/PointingToDeclaration/"></a>[isArray](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisArray%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isArray/#/PointingToDeclaration/"></a> [jvm] open val [isArray](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisArray%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this [KoresType](../-kores-type/index.md) is an array type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isInterface/#/PointingToDeclaration/"></a>[isInterface](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisInterface%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isInterface/#/PointingToDeclaration/"></a> [jvm] open val [isInterface](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisInterface%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this [KoresType](../-kores-type/index.md) is a interface type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isPrimitive/#/PointingToDeclaration/"></a>[isPrimitive](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisPrimitive%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isPrimitive/#/PointingToDeclaration/"></a> [jvm] open val [isPrimitive](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisPrimitive%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this [KoresType](../-kores-type/index.md) is a primitive type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isVirtual/#/PointingToDeclaration/"></a>[isVirtual](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisVirtual%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/isVirtual/#/PointingToDeclaration/"></a> [jvm] open val [isVirtual](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FisVirtual%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if is a Virtual Type (Virtual Types = Types that were not loaded by JVM)   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/javaSpecName/#/PointingToDeclaration/"></a>[javaSpecName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FjavaSpecName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/javaSpecName/#/PointingToDeclaration/"></a> [jvm] open val [javaSpecName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FjavaSpecName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)JVM Spec class name.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/packageName/#/PointingToDeclaration/"></a>[packageName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FpackageName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/packageName/#/PointingToDeclaration/"></a> [jvm] open val [packageName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FpackageName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Package name   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/primitiveType/#/PointingToDeclaration/"></a>[primitiveType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FprimitiveType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/primitiveType/#/PointingToDeclaration/"></a> [jvm] open val [primitiveType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FprimitiveType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [KoresType](../-kores-type/index.md)?Primitive type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/simpleName/#/PointingToDeclaration/"></a>[simpleName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FsimpleName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/simpleName/#/PointingToDeclaration/"></a> [jvm] open val [simpleName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FsimpleName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Simple name.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/superType/#/PointingToDeclaration/"></a>[superType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FsuperType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/superType/#/PointingToDeclaration/"></a> [jvm] open val [superType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FsuperType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)?Gets the super type of this[Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html) using default resolver.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/type/#/PointingToDeclaration/"></a>[type](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2Ftype%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/type/#/PointingToDeclaration/"></a> [jvm] abstract val [type](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2Ftype%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Type name, examples:[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = java.lang.String.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/wrapped/#/PointingToDeclaration/"></a>[wrapped](wrapped.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/wrapped/#/PointingToDeclaration/"></a> [jvm] open override val [wrapped](wrapped.md): [KoresType](../-kores-type/index.md)Wrapped code type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/wrapperType/#/PointingToDeclaration/"></a>[wrapperType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FwrapperType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType/wrapperType/#/PointingToDeclaration/"></a> [jvm] open val [wrapperType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType%2FwrapperType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [KoresType](../-kores-type/index.md)?Wrapper type.   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract///PointingToDeclaration/"></a>[AnnotatedKoresType](-abstract/index.md)
