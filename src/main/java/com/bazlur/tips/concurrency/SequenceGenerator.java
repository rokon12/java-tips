package com.bazlur.tips.concurrency;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/7/15.
 */
public class SequenceGenerator {
    private int value;

    public synchronized int getNext() {
        return value++;
    }

    public static void main(String[] args) {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());

        Runnable runnable = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 100_000; i++) {
                int next = sequenceGenerator.getNext();
                set.add(next);
            }
        };

        for (int i = 0; i < 50; i++) {
            new Thread(runnable).start();
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        } finally {
            System.out.println(set.size());
        }
    }

}
