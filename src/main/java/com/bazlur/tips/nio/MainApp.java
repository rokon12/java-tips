package com.bazlur.tips.nio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/5/15.
 */
public class MainApp {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    ArchiveSearcher archiveSearcher = target -> "Found with target: " + target;


    void showSearch(final String target) {
        Future<String> future = executorService.submit(() -> archiveSearcher.search(target));

    }

    public static void main(String[] args) {


    }
}
