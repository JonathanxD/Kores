[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.base](../index.md) / [MethodDeclarationBase](.)

# MethodDeclarationBase

`interface MethodDeclarationBase : `[`CodeElement`](../../com.github.jonathanxd.codeapi/-code-element.md)`, `[`ModifiersHolder`](../-modifiers-holder/index.md)`, `[`ReturnTypeHolder`](../-return-type-holder/index.md)`, `[`ParametersHolder`](../-parameters-holder/index.md)`, `[`GenericSignatureHolder`](../-generic-signature-holder/index.md)`, `[`Annotable`](../-annotable/index.md)`, `[`Named`](../-named/index.md)`, `[`Typed`](../-typed/index.md)`, `[`CommentHolder`](../../com.github.jonathanxd.codeapi.base.comment/-comment-holder/index.md)`, `[`BodyHolder`](../-body-holder/index.md)`, `[`InnerTypesHolder`](../-inner-types-holder/index.md)

Method declaration

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `interface Builder<out T : MethodDeclarationBase, S : `[`Builder`](-builder/index.md)`<T, S>> : `[`Builder`](../-body-holder/-builder/index.md)`<T, S>, `[`Builder`](../-modifiers-holder/-builder/index.md)`<T, S>, `[`Builder`](../-return-type-holder/-builder/index.md)`<T, S>, `[`Builder`](../-parameters-holder/-builder/index.md)`<T, S>, `[`Builder`](../-generic-signature-holder/-builder/index.md)`<T, S>, `[`Builder`](../-annotable/-builder/index.md)`<T, S>, `[`Builder`](../-named/-builder/index.md)`<T, S>, `[`Builder`](../-typed/-builder/index.md)`<T, S>, `[`Builder`](../../com.github.jonathanxd.codeapi.base.comment/-comment-holder/-builder/index.md)`<T, S>, `[`Builder`](../-inner-types-holder/-builder/index.md)`<T, S>` |

### Properties

| Name | Summary |
|---|---|
| [returnType](return-type.md) | `abstract val returnType: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)<br>Type of return |
| [type](type.md) | `open val type: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)<br>Element type |
| [typeSpec](type-spec.md) | `open val typeSpec: `[`TypeSpec`](../-type-spec/index.md) |

### Inherited Properties

| Name | Summary |
|---|---|
| [annotations](../-annotable/annotations.md) | `abstract val annotations: List<`[`Annotation`](../-annotation/index.md)`>`<br>Annotations |
| [body](../-body-holder/body.md) | `abstract val body: `[`CodeSource`](../../com.github.jonathanxd.codeapi/-code-source/index.md)<br>Body. |
| [comments](../../com.github.jonathanxd.codeapi.base.comment/-comment-holder/comments.md) | `abstract val comments: `[`Comments`](../../com.github.jonathanxd.codeapi.base.comment/-comments/index.md)<br>All comments inside this holder. |
| [genericSignature](../-generic-signature-holder/generic-signature.md) | `abstract val genericSignature: `[`GenericSignature`](../../com.github.jonathanxd.codeapi.generic/-generic-signature/index.md)<br>Generic signature. |
| [innerTypes](../-inner-types-holder/inner-types.md) | `abstract val innerTypes: List<`[`TypeDeclaration`](../-type-declaration/index.md)`>`<br>Inner types |
| [isPublic](../-modifiers-holder/is-public.md) | `open val isPublic: Boolean`<br>Returns true if is public. |
| [modifiers](../-modifiers-holder/modifiers.md) | `abstract val modifiers: Set<`[`CodeModifier`](../-code-modifier/index.md)`>`<br>Modifiers. Empty modifier set is the same as public. For package private, an explicit
[CodeModifier.PACKAGE_PRIVATE](../-code-modifier/-p-a-c-k-a-g-e_-p-r-i-v-a-t-e.md) is required. |
| [name](../-named/name.md) | `abstract val name: String`<br>Name |
| [parameters](../-parameters-holder/parameters.md) | `abstract val parameters: List<`[`CodeParameter`](../-code-parameter/index.md)`>`<br>Parameters |

### Functions

| Name | Summary |
|---|---|
| [builder](builder.md) | `abstract fun builder(): `[`Builder`](-builder/index.md)`<MethodDeclarationBase, *>`<br>This builder may or may not accept null values, it depends on implementation. |

### Extension Functions

| Name | Summary |
|---|---|
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun Any?.asString(simple: Boolean = true): String`<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [getPartType](../../com.github.jonathanxd.codeapi.util/get-part-type.md) | `fun `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.getPartType(): `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)<br>Returns the [Type](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html) of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) or throws [IllegalStateException](http://docs.oracle.com/javase/6/docs/api/java/lang/IllegalStateException.html) if [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) is not instance of [Typed](../-typed/index.md) |
| [getPartTypeOrNull](../../com.github.jonathanxd.codeapi.util/get-part-type-or-null.md) | `fun `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.getPartTypeOrNull(): `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`?`<br>Returns the [Type](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html) of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) or `null` if [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) is not instance of [Typed](../-typed/index.md). |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun Any.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |

### Inheritors

| Name | Summary |
|---|---|
| [ConstructorDeclaration](../-constructor-declaration/index.md) | `data class ConstructorDeclaration : MethodDeclarationBase`<br>Instance constructor declaration. |
| [MethodDeclaration](../-method-declaration/index.md) | `data class MethodDeclaration : MethodDeclarationBase`<br>Method declaration |
| [StaticBlock](../-static-block/index.md) | `data class StaticBlock : MethodDeclarationBase`<br>Static block (aka class constructors/class initializers). |