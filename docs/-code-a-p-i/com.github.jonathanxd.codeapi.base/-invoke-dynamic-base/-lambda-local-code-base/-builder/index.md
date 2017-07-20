[CodeAPI](../../../../index.md) / [com.github.jonathanxd.codeapi.base](../../../index.md) / [InvokeDynamicBase](../../index.md) / [LambdaLocalCodeBase](../index.md) / [Builder](.)

# Builder

`interface Builder<out T : `[`LambdaLocalCodeBase`](../index.md)`, S : Builder<T, S>> : `[`Builder`](../../-lambda-method-ref-base/-builder/index.md)`<T, S>, `[`Builder`](../../../-arguments-holder/-builder/index.md)`<T, S>`

### Functions

| Name | Summary |
|---|---|
| [args](args.md) | `open fun args(value: List<Any>): S`<br>See [T.args](args.md) |
| [bootstrap](bootstrap.md) | `open fun bootstrap(value: `[`MethodInvokeSpec`](../../../../com.github.jonathanxd.codeapi.common/-method-invoke-spec/index.md)`): S`<br>See [T.bootstrap](bootstrap.md) |
| [expectedTypes](expected-types.md) | `open fun expectedTypes(value: `[`TypeSpec`](../../../-type-spec/index.md)`): S`<br>See [T.expectedTypes](expected-types.md) |
| [invocation](invocation.md) | `open fun invocation(value: `[`MethodInvocation`](../../../-method-invocation/index.md)`): S`<br>See [T.invocation](invocation.md) |
| [localCode](local-code.md) | `abstract fun localCode(value: `[`LocalCode`](../../../-local-code/index.md)`): S`<br>See [T.localCode](local-code.md) |
| [type](type.md) | `open fun type(value: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`): S`<br>See [T.type](type.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [arguments](../../../-arguments-holder/-builder/arguments.md) | `abstract fun arguments(value: List<`[`CodeInstruction`](../../../../com.github.jonathanxd.codeapi/-code-instruction.md)`>): S`<br>`open fun arguments(vararg values: `[`CodeInstruction`](../../../../com.github.jonathanxd.codeapi/-code-instruction.md)`): S`<br>See [T.arguments](../../../-arguments-holder/-builder/arguments.md) |
| [array](../../../-arguments-holder/-builder/array.md) | `abstract fun array(value: Boolean): S`<br>See [T.array](../../../-arguments-holder/-builder/array.md) |
| [baseSam](../../-lambda-method-ref-base/-builder/base-sam.md) | `abstract fun baseSam(value: `[`MethodTypeSpec`](../../../../com.github.jonathanxd.codeapi.common/-method-type-spec/index.md)`): S`<br>See [T.baseSam](../../-lambda-method-ref-base/-builder/base-sam.md) |

### Inheritors

| Name | Summary |
|---|---|
| [Builder](../../../-invoke-dynamic/-lambda-local-code/-builder/index.md) | `class Builder : Builder<`[`LambdaLocalCode`](../../../-invoke-dynamic/-lambda-local-code/index.md)`, `[`Builder`](../../../-invoke-dynamic/-lambda-local-code/-builder/index.md)`>` |