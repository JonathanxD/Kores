//[Kores](../../../index.md)/[com.github.jonathanxd.kores.base](../../index.md)/[VariableDeclaration](../index.md)/[Builder](index.md)



# Builder  
 [jvm] class [Builder](index.md) : [VariableBase.Builder](../../-variable-base/-builder/index.md)<[VariableDeclaration](../index.md), [VariableDeclaration.Builder](index.md)> , [ValueHolder.Builder](../../-value-holder/-builder/index.md)<[VariableDeclaration](../index.md), [VariableDeclaration.Builder](index.md)> , [ModifiersHolder.Builder](../../-modifiers-holder/-builder/index.md)<[VariableDeclaration](../index.md), [VariableDeclaration.Builder](index.md)>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/Builder/#com.github.jonathanxd.kores.base.VariableDeclaration/PointingToDeclaration/"></a>[Builder](-builder.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/Builder/#com.github.jonathanxd.kores.base.VariableDeclaration/PointingToDeclaration/"></a> [jvm] fun [Builder](-builder.md)(defaults: [VariableDeclaration](../index.md))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder.Companion///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/VariableBase.Builder/base/#com.github.jonathanxd.kores.common.FieldRef/PointingToDeclaration/"></a>[base](../../-variable-base/-builder/base.md)| <a name="com.github.jonathanxd.kores.base/VariableBase.Builder/base/#com.github.jonathanxd.kores.common.FieldRef/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [base](../../-variable-base/-builder/base.md)(fieldRef: [FieldRef](../../../com.github.jonathanxd.kores.common/-field-ref/index.md)): [VariableDeclaration.Builder](index.md)  <br>More info  <br>Base this builder on fieldRef (only name and [type](../../-variable-base/-builder/type.md)).  <br><br><br>[jvm]  <br>Content  <br>open fun [base](../../-variable-base/-builder/base.md)(variableRef: [VariableRef](../../../com.github.jonathanxd.kores.common/-variable-ref/index.md)): [VariableDeclaration.Builder](index.md)  <br>More info  <br>Base this builder on variableRef.  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/build/#/PointingToDeclaration/"></a>[build](build.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/build/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [build](build.md)(): [VariableDeclaration](../index.md)  <br>More info  <br>Build the object of type T.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/ModifiersHolder.Builder/modifiers/#kotlin.Array[com.github.jonathanxd.kores.base.KoresModifier]/PointingToDeclaration/"></a>[modifiers](../../-modifiers-holder/-builder/modifiers.md)| <a name="com.github.jonathanxd.kores.base/ModifiersHolder.Builder/modifiers/#kotlin.Array[com.github.jonathanxd.kores.base.KoresModifier]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [modifiers](../../-modifiers-holder/-builder/modifiers.md)(vararg values: [KoresModifier](../../-kores-modifier/index.md)): [VariableDeclaration.Builder](index.md)  <br>open override fun [modifiers](modifiers.md)(value: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[KoresModifier](../../-kores-modifier/index.md)>): [VariableDeclaration.Builder](index.md)  <br>More info  <br>See [ModifiersHolder.modifiers](../../-modifiers-holder/modifiers.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/name/#kotlin.String/PointingToDeclaration/"></a>[name](name.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/name/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [name](name.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [VariableDeclaration.Builder](index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/ModifiersHolder.Builder/publicModifier/#/PointingToDeclaration/"></a>[publicModifier](../../-modifiers-holder/-builder/public-modifier.md)| <a name="com.github.jonathanxd.kores.base/ModifiersHolder.Builder/publicModifier/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [publicModifier](../../-modifiers-holder/-builder/public-modifier.md)(): [VariableDeclaration.Builder](index.md)  <br>More info  <br>Sets modifiers to [KoresModifier.PUBLIC](../../-kores-modifier/-p-u-b-l-i-c/index.md).  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/VariableBase.Builder/type/#java.lang.reflect.Type/PointingToDeclaration/"></a>[type](../../-variable-base/-builder/type.md)| <a name="com.github.jonathanxd.kores.base/VariableBase.Builder/type/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [type](../../-variable-base/-builder/type.md)(value: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [VariableDeclaration.Builder](index.md)  <br>More info  <br>See T.  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/value/#com.github.jonathanxd.kores.Instruction/PointingToDeclaration/"></a>[value](value.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/value/#com.github.jonathanxd.kores.Instruction/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [value](value.md)(value: [Instruction](../../../com.github.jonathanxd.kores/-instruction/index.md)): [VariableDeclaration.Builder](index.md)  <br>More info  <br>See T.  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/variableType/#java.lang.reflect.Type/PointingToDeclaration/"></a>[variableType](variable-type.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/variableType/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [variableType](variable-type.md)(value: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [VariableDeclaration.Builder](index.md)  <br>More info  <br>See [VariableBase.variableType](../../-variable-base/variable-type.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/withoutValue/#/PointingToDeclaration/"></a>[withoutValue](without-value.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/withoutValue/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [withoutValue](without-value.md)(): [VariableDeclaration.Builder](index.md)  <br>More info  <br>Removes value definition.  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/modifiers/#/PointingToDeclaration/"></a>[modifiers](modifiers.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/modifiers/#/PointingToDeclaration/"></a> [jvm] var [modifiers](modifiers.md): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[KoresModifier](../../-kores-modifier/index.md)>   <br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/name/#/PointingToDeclaration/"></a> [jvm] lateinit var [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/value/#/PointingToDeclaration/"></a> [jvm] var [value](value.md): [Instruction](../../../com.github.jonathanxd.kores/-instruction/index.md)   <br>
| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/variableType/#/PointingToDeclaration/"></a>[variableType](variable-type.md)| <a name="com.github.jonathanxd.kores.base/VariableDeclaration.Builder/variableType/#/PointingToDeclaration/"></a> [jvm] lateinit var [variableType](variable-type.md): [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)   <br>
