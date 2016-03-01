package com.bazlur.tips.rxjava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/28/16.
 */
public class DataGenerator {
    public static List<Integer> genereteBigIntegerList() {
        return IntStream.range(0, 1000).boxed().collect(Collectors.toList());
    }

}
