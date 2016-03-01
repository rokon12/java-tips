package com.bazlur.tips.lambda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/3/16.
 */
public class MainApp {
    public static void main(String[] args) {
        Function<Integer, Integer> times2 = e -> e * 2;
        Function<Integer, Integer> square = e -> e * e;

        Integer compose = times2.compose(square).apply(4);
        System.out.println(compose);

        Integer applyThen = times2.andThen(square).apply(4);
        System.out.println(applyThen);

        File[] files = new File(".").listFiles(File::isHidden);

        Predicate<String> isGreen = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return MainApp.isGreen(value);
            }
        };


        ArrayList<String> list = new ArrayList<>();
        filterList(list, isGreen);

    }


    public static void doSomething(Predicate<String> predicate) {

    }

    public static boolean isGreen(String value) {
        return "green".equals(value);
    }


    static List<String> filterList(List<String> list, Predicate<String> predicate) {

        List<String> result = new ArrayList<>();
        for (String apple : list) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
