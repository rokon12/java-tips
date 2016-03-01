package com.bazlur.tips.generics.wildcard;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // goto the Collection interface


        Integer a = 5;// new Integer(5);
        Integer b = 5;// new Integer(5);
        System.out.println(a == b); // Should be True


        List<Number> num = new ArrayList<Number>();
        num.add(2);
        num.add(2.3);


//        List<Integer> ints1 = new ArrayList<Integer>();
//        ints1.add(2);
//        ints1.add(1);
//        List<Number> nums2 = ints1;
//        nums2.add(3.14);


//        List<Number> numbers2 = new ArrayList<>();
//        numbers2.add(32);
//        numbers2.add(34);
//        List<Integer> ints3 = numbers2;

        // List<Integer> is not subtype of List<Number> or vise-versa
        // List<Integer> is a subtype of Collection<Integer>

        // S[] is considered to be a subtype  of T[] whenever S is a subtype of T
        Integer[] intArray = new Integer[]{1, 2, 3};
        //Number[] numArray = intArray; //ArrayStoreException
        //numArray[2] = 3.14;


        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.2, 3.4, 6.7);

        numbers.addAll(integers);
        numbers.addAll(doubles);
        assert numbers.toString().equals("[1, 2, 3, 1.2, 3.4, 6.7]");
        System.out.println(numbers); //[1, 2, 3, 1.2, 3.4, 6.7]


        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        //  nums.add(3.4); this doesn't work  .. no

        List<Object> objs = Arrays.<Object>asList(2, 3.14, "four");
        List<Integer> integerList = Arrays.asList(5, 6);

        copy(objs, integerList);
        System.out.println(objs);


        List<Integer> ints4 = Arrays.asList(1, 3, 4);
        System.out.println(sum(ints4));

    }

    //1. Wildcard with extend
    //2. Wildcard with super


    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    //Get and put Principal

    //
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number number : nums) s += number.doubleValue();
        return s;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.add(i);
    }

    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }
}
