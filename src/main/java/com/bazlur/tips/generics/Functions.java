package com.bazlur.tips.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public class Functions {
    public static <A, B, X extends Throwable> List<B> applyAll(Function<A, B, X> f, List<A> list) throws X {

        List<B> result = new ArrayList<>(list.size());
        for (A x : list) {
            result.add(f.apply(x));
        }

        return result;
    }

    public static void main(String[] args) {
        Function<String, Integer, Error> length = String::length;


        List<String> strings = Arrays.asList("Rokon", "Bazlur");
        System.out.println(applyAll(length, strings));


    }
}
