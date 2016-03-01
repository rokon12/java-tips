package com.bazlur.tips.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/3/15.
 */
public class FindJavaVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toString().endsWith(".java")) {
            System.out.println(file.getFileName().toAbsolutePath());
        }

        return FileVisitResult.CONTINUE;
    }
}
