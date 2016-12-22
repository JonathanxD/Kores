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
package com.github.jonathanxd.codeapi.util.collection;

import com.github.jonathanxd.iutils.function.predicate.IntObjBiPredicate;
import com.github.jonathanxd.iutils.object.IntNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CollectionUtil {

    public static <T> List<IntNode<T>> filterWithIndex(List<T> list, Predicate<T> predicate) {
        List<IntNode<T>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);

            if(predicate.test(t))
                result.add(new IntNode<>(i, t));
        }

        return result;
    }

    public static <T> List<IntNode<T>> filterWithIndex(List<T> list, IntObjBiPredicate<T> predicate) {
        List<IntNode<T>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);

            if(predicate.test(i, t))
                result.add(new IntNode<>(i, t));
        }

        return result;
    }

    public static <T> void remove(List<T> list, int[] indexes) {
        Iterator<T> iterator = list.iterator();
        int i = 0;

        while(iterator.hasNext()) {
            iterator.next();
            for(int index : indexes) {
                if(index == i) {
                    iterator.remove();
                    break;
                }
            }

            ++i;
        }
    }
}