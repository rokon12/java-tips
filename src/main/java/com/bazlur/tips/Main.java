package com.bazlur.tips;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JOptionPane.showMessageDialog(null, "Hello world", "Display Message", JOptionPane.INFORMATION_MESSAGE);



        Integer i1 = 127;

        Integer i2 = 127;

        System.out.println(i1 == i2);


        Integer a = 1000, b = 1000;
        System.out.println(a == b);//1
        Integer c = 100, d = 100;
        System.out.println(c == d);//2

//        StringJoiner joiner = new StringJoiner(":", "[", "]");
//        joiner.add("Bazlur")
//                .add("Rahman")
//                .add("Rokon");
//        String s = joiner.toString();
//        System.out.println(s);
//
//
//        File dir = new File("/home/rokonoid/Downloads");
//        File[] files = dir.listFiles();
//
//        String fileNames = Stream.of(files)
//                .map(File::getName)
//                .collect(Collectors.joining(", "));
//        System.out.println(fileNames);


        boolean useForkJoin = true;

        if (useForkJoin) {
            ForkJoinPool pool = new ForkJoinPool(50);
            pool.submit((Runnable) () -> {
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
                numbers.parallelStream()
                        .map(Main::doubleIt)
                        .reduce(0, Integer::sum);
            });

            pool.shutdown();
            pool.awaitTermination(1, TimeUnit.MINUTES);
        } else {
            run();
        }
    }

    public static int doubleIt(int number) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }

        System.out.println("doubleIt called for " + number);
        return number * 2;
    }

    public static void run() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        numbers.parallelStream()
                .map(Main::doubleIt)
                .reduce(0, Integer::sum);
    }
}
