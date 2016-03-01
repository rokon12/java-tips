package com.bazlur.tips.nio;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/4/15.
 */
public class FileWatcherService {

    public static void watcherService(String path) {
        boolean shutdown = false;

        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Path dir = FileSystems.getDefault().getPath(path);
            WatchKey key = dir.register(watcher, ENTRY_MODIFY);

            while (!shutdown) {
                key = watcher.take();
                key.pollEvents().stream().filter(event -> event.kind() == ENTRY_MODIFY).forEach(event -> System.out.println("Home dir changed"));

                key.reset();
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        watcherService("/home/rokonoid");
    }
}
