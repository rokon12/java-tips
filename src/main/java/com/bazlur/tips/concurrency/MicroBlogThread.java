package com.bazlur.tips.concurrency;

import java.util.concurrent.BlockingQueue;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/5/15.
 */
public abstract class MicroBlogThread extends Thread {
    protected final BlockingQueue<Update> updates;
    protected String text = "";
    protected final int pauseTime;
    private boolean shutdown = false;

    public MicroBlogThread(BlockingQueue<Update> lbq_, int pause_) {
        updates = lbq_;
        pauseTime = pause_;
    }

    public synchronized void shutdown() {
        shutdown = true;
    }

    @Override
    public void run() {
        while (!shutdown) {
            doAction();
            try {
                Thread.sleep(pauseTime);
            } catch (InterruptedException e) {
                shutdown = true;
            }
        }
    }

    public abstract void doAction();
}
