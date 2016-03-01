package com.bazlur.tips.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public class Utils {

    public <T> List<T> toList(T[] items) {
        List<T> list = new ArrayList<>();

        for (T item : items) {
            list.add(item);
        }
        return list;
    }


    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums) s += num.doubleValue();

        return s;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.add(i);
    }


    public static void reverse(List<?> list) {
        rev(list);
    }

    private static <T> void rev(List<T> list) {
        List<T> temp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, temp.get(list.size() - i - 1));
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        assert sum(ints) == 6.0;

        List<Double> doubles = Arrays.asList(2.78, 3.14);
        assert sum(doubles) == 5.92;

        List<Number> nums = Arrays.<Number>asList(1, 2, 2.78, 3.14);
        assert sum(nums) == 8.92;


        List<Integer> ints1 = new ArrayList<Integer>();
        count(ints, 5);
        assert ints.toString().equals("[0, 1, 2, 3, 4]");

        List<Number> nums2 = new ArrayList<Number>();
        count(nums2, 5);
        nums.add(5.0);
        assert nums.toString().equals("[0, 1, 2, 3, 4, 5.0]");

        List<Object> objs = new ArrayList<Object>();
        count(objs, 5);
        objs.add("five");
        assert objs.toString().equals("[0, 1, 2, 3, 4, five]");
    }
}
