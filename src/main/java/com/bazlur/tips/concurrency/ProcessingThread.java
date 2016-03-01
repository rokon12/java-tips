package com.bazlur.tips.concurrency;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/6/15.
 */
public class ProcessingThread extends Thread {
    private static int MAX_THREADS = 4;

    private final String ident;
    private final CountDownLatch latch;

    public ProcessingThread(String ident, CountDownLatch latch) {
        this.ident = ident;
        this.latch = latch;
    }

    public void initialize() {
        latch.countDown();
    }

    @Override
    public void run() {
        System.out.println(ident + " is running..");
        initialize();
    }

    public static void main(String[] a) {
        final int quorum = 1 + MAX_THREADS / 2;
        final CountDownLatch cdl = new CountDownLatch(quorum);

        final Set<ProcessingThread> nodes = new HashSet<>();
        try {
            for (int i = 0; i < MAX_THREADS; i++) {
                ProcessingThread local = new ProcessingThread("localhost:" + (9000 + i), cdl);
                nodes.add(local);
                local.start();
            }
            cdl.await();
        } catch (InterruptedException e) {

        } finally {
        }
    }
}
