package com.bazlur.tips.factories;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/22/16.
 */
public class MyFramework3 {
    public static <T extends Runnable> void runMany(int n, Supplier<T> appFactory){
        List<T> instances = new ArrayList<>();
        try{
            for (int i = 0; i < n; i++) {
                instances.add(appFactory.get());
            }
        }catch (Exception e){
            throw  new RuntimeException(e);
        }

        runInParallel(instances);
    }

    private static <T extends Runnable> void runInParallel(List<T> instances) {

    }

    public static void main(String[] args) {
        runMany(4, Application::new);
    }
}
