package com.bazlur.tips;

/**
 * @author Bazlur Rahman Rokon
 * @since 11/29/15.
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        new ReaderThread().start();
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}


