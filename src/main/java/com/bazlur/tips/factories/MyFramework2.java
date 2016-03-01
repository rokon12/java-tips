package com.bazlur.tips.factories;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/22/16.
 */
public class MyFramework2 {
    public static <T extends Runnable> void runMany(int n, Factory<T> appFactory){
        List<T> instances = new ArrayList<>();
        try{
            for (int i = 0; i < n; i++) {
                instances.add(appFactory.create());
            }
        }catch (Exception e){
            throw  new RuntimeException(e);
        }

        runInParallel(instances);
    }

    private static <T extends Runnable> void runInParallel(List<T> instances) {

    }

    public static void main(String[] args) {
        MyFramework2.runMany(10, new ApplicationFactory());
    }
}
