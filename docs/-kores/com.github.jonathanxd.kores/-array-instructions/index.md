//[Kores](../../index.md)/[com.github.jonathanxd.kores](../index.md)/[ArrayInstructions](index.md)



# ArrayInstructions  
 [jvm] class [ArrayInstructions](index.md)(**parts**: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Instruction](../-instruction/index.md)>) : [Instructions](../-instructions/index.md)

Backed by an [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html) of [Instruction](../-instruction/index.md).

   


## See also  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores/ArrayInstructions///PointingToDeclaration/"></a>[com.github.jonathanxd.kores.MutableInstructions](../-mutable-instructions/index.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions///PointingToDeclaration/"></a>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores/ArrayInstructions/ArrayInstructions/#/PointingToDeclaration/"></a>[ArrayInstructions](-array-instructions.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/ArrayInstructions/#/PointingToDeclaration/"></a> [jvm] fun [ArrayInstructions](-array-instructions.md)()   <br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/ArrayInstructions/#kotlin.Array[com.github.jonathanxd.kores.Instruction]/PointingToDeclaration/"></a>[ArrayInstructions](-array-instructions.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/ArrayInstructions/#kotlin.Array[com.github.jonathanxd.kores.Instruction]/PointingToDeclaration/"></a> [jvm] fun [ArrayInstructions](-array-instructions.md)(parts: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Instruction](../-instruction/index.md)> = emptyArray())   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores/ArrayInstructions.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions.Companion///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores/KoresPart/builder/#/PointingToDeclaration/"></a>[builder](../-kores-part/builder.md)| <a name="com.github.jonathanxd.kores/KoresPart/builder/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [builder](../-kores-part/builder.md)(): [Builder](../../com.github.jonathanxd.kores.builder/-builder/index.md)<[KoresPart](../-kores-part/index.md), *>  <br>More info  <br>This builder may or may not accept null values, it depends on implementation.  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/contains/#kotlin.Any/PointingToDeclaration/"></a>[contains](contains.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/contains/#kotlin.Any/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [contains](contains.md)(o: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if this [Instructions](../-instructions/index.md) contains o.  <br><br><br>
| <a name="com.github.jonathanxd.kores/Instructions/containsAll/#kotlin.collections.Collection[*]/PointingToDeclaration/"></a>[containsAll](../-instructions/contains-all.md)| <a name="com.github.jonathanxd.kores/Instructions/containsAll/#kotlin.collections.Collection[*]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [containsAll](../-instructions/contains-all.md)(c: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<*>): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if this [Instructions](../-instructions/index.md) contains all elements of c.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/forEach/#java.util.function.Consumer[com.github.jonathanxd.kores.Instruction]/PointingToDeclaration/"></a>[forEach](for-each.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/forEach/#java.util.function.Consumer[com.github.jonathanxd.kores.Instruction]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [forEach](for-each.md)(action: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)<in [Instruction](../-instruction/index.md)>)  <br>More info  <br>For each all elements of this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/Instructions/get/#kotlin.Int/PointingToDeclaration/"></a>[get](../-instructions/get.md)| <a name="com.github.jonathanxd.kores/Instructions/get/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [get](../-instructions/get.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Instruction](../-instruction/index.md)  <br>More info  <br>Gets element at index index.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1211764316)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/indexOf/#kotlin.Any/PointingToDeclaration/"></a>[indexOf](index-of.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/indexOf/#kotlin.Any/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [indexOf](index-of.md)(o: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Returns the index of o in this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/iterator/#/PointingToDeclaration/"></a>[iterator](iterator.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/iterator/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [iterator](iterator.md)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)<[Instruction](../-instruction/index.md)>  <br>More info  <br>Creates an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that iterates elements of this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/lastIndexOf/#kotlin.Any/PointingToDeclaration/"></a>[lastIndexOf](last-index-of.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/lastIndexOf/#kotlin.Any/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [lastIndexOf](last-index-of.md)(o: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Returns the last index of o in this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/listIterator/#/PointingToDeclaration/"></a>[listIterator](list-iterator.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/listIterator/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [listIterator](list-iterator.md)(): [ListIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)<[Instruction](../-instruction/index.md)>  <br>More info  <br>Creates a [ListIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html) that iterates this [Instructions](../-instructions/index.md).  <br><br><br>[jvm]  <br>Content  <br>open override fun [listIterator](list-iterator.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ListIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)<[Instruction](../-instruction/index.md)>  <br>More info  <br>Creates a [ListIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html) that iterates this [Instructions](../-instructions/index.md) and starts at index.  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/minus/#com.github.jonathanxd.kores.Instruction/PointingToDeclaration/"></a>[minus](minus.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/minus/#com.github.jonathanxd.kores.Instruction/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [minus](minus.md)(other: [Instruction](../-instruction/index.md)): [Instructions](../-instructions/index.md)  <br>More info  <br>Removes other from this [Instructions](../-instructions/index.md).  <br><br><br>[jvm]  <br>Content  <br>open operator override fun [minus](minus.md)(other: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)<[Instruction](../-instruction/index.md)>): [Instructions](../-instructions/index.md)  <br>More info  <br>Removes all [Instruction](../-instruction/index.md) of other from this [Instructions](../-instructions/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/parallelStream/#/PointingToDeclaration/"></a>[parallelStream](parallel-stream.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/parallelStream/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [parallelStream](parallel-stream.md)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)<[Instruction](../-instruction/index.md)>  <br>More info  <br>Creates a parallel [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html) of this [Instructions](../-instructions/index.md) (which may or may not be parallel).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/plus/#com.github.jonathanxd.kores.Instruction/PointingToDeclaration/"></a>[plus](plus.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/plus/#com.github.jonathanxd.kores.Instruction/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [plus](plus.md)(other: [Instruction](../-instruction/index.md)): [Instructions](../-instructions/index.md)  <br>More info  <br>Adds other to this [Instructions](../-instructions/index.md).  <br><br><br>[jvm]  <br>Content  <br>open operator override fun [plus](plus.md)(other: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)<[Instruction](../-instruction/index.md)>): [Instructions](../-instructions/index.md)  <br>More info  <br>Adds all [Instruction](../-instruction/index.md) of other to this [Instructions](../-instructions/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/spliterator/#/PointingToDeclaration/"></a>[spliterator](spliterator.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/spliterator/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [spliterator](spliterator.md)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)<[Instruction](../-instruction/index.md)>  <br>More info  <br>Creates a [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html) from elements of this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/stream/#/PointingToDeclaration/"></a>[stream](stream.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/stream/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [stream](stream.md)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)<[Instruction](../-instruction/index.md)>  <br>More info  <br>Creates a [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html) of this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/subSource/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[subSource](sub-source.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/subSource/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [subSource](sub-source.md)(fromIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), toIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Instructions](../-instructions/index.md)  <br>More info  <br>Creates a view of this [Instructions](../-instructions/index.md) from index fromIndex to index toIndex, changes to this [Instructions](../-instructions/index.md) is reflected in current [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/toArray/#/PointingToDeclaration/"></a>[toArray](to-array.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/toArray/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toArray](to-array.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Instruction](../-instruction/index.md)>  <br>More info  <br>Creates an array of [Instruction](../-instruction/index.md) of all elements of this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/Instructions/toImmutable/#/PointingToDeclaration/"></a>[toImmutable](../-instructions/to-immutable.md)| <a name="com.github.jonathanxd.kores/Instructions/toImmutable/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toImmutable](../-instructions/to-immutable.md)(): [Instructions](../-instructions/index.md)  <br>More info  <br>Creates a immutable [Instructions](../-instructions/index.md) with elements of this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/Instructions/toMutable/#/PointingToDeclaration/"></a>[toMutable](../-instructions/to-mutable.md)| <a name="com.github.jonathanxd.kores/Instructions/toMutable/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toMutable](../-instructions/to-mutable.md)(): [MutableInstructions](../-mutable-instructions/index.md)  <br>More info  <br>Creates a mutable [Instructions](../-instructions/index.md) with elements of this [Instructions](../-instructions/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores/ArrayInstructions/isEmpty/#/PointingToDeclaration/"></a>[isEmpty](index.md#%5Bcom.github.jonathanxd.kores%2FArrayInstructions%2FisEmpty%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores/ArrayInstructions/isEmpty/#/PointingToDeclaration/"></a> [jvm] val [isEmpty](index.md#%5Bcom.github.jonathanxd.kores%2FArrayInstructions%2FisEmpty%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if is empty, false otherwise.   <br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/isNotEmpty/#/PointingToDeclaration/"></a>[isNotEmpty](index.md#%5Bcom.github.jonathanxd.kores%2FArrayInstructions%2FisNotEmpty%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores/ArrayInstructions/isNotEmpty/#/PointingToDeclaration/"></a> [jvm] val [isNotEmpty](index.md#%5Bcom.github.jonathanxd.kores%2FArrayInstructions%2FisNotEmpty%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if is not empty, false otherwise.   <br>
| <a name="com.github.jonathanxd.kores/ArrayInstructions/size/#/PointingToDeclaration/"></a>[size](size.md)| <a name="com.github.jonathanxd.kores/ArrayInstructions/size/#/PointingToDeclaration/"></a> [jvm] open override val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Size of source.   <br>
