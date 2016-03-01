package com.bazlur.tips.concurrency;

import java.util.Random;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/7/15.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        int counter = 0;
        for (int i = 0; i < 1_000; i++) {
            int next = random.nextInt(2);
            if (next == 1) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
