package com.bazlur.tips.nio;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

import static java.nio.file.StandardWatchEventKinds.*;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/3/15.
 */
public class NioDemo {
    public static void main(String[] args) throws IOException, InterruptedException {

        Path path = Paths.get("/usr/bin/zip");

        System.out.println("FileName [" + path.getFileName() + "]");
        System.out.println("Number of Elements in the Path [" + path.getNameCount() + "]");
        System.out.println("Parent Path [" + path.getParent() + "]");
        System.out.println("Root of Path [" + path.getRoot() + "]");
        System.out.println("Subpath from Root, 2 elements deep [" + path.subpath(0, 2) + "]");

        Path normalizedPath = Paths.get("NioDemo.java").normalize();
        System.out.println(normalizedPath.toString());
        Path realPath = Paths.get("./src/com/bazlur/tips/Command.java").toRealPath();
        System.out.println(realPath.toString());

        Path dir = Paths.get("./src/com/bazlur/tips").toRealPath();
        //System.out.println(dir.normalize());

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.java")) {
            stream.forEach(p -> System.out.println(p.getFileName()));
        } catch (IOException ignored) {
        }

        Path startingDirectory = Paths.get("./src/").toRealPath();
        System.out.println(startingDirectory);

//        Path resolvedPath = startingDirectory.resolve("Hello2.java");
//        System.out.println(resolvedPath);
//        //Files.createFile(resolvedPath);
//
//        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-rw-rw-");
//        FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);
//        Files.createFile(resolvedPath, attr);

        Path gender = Paths.get("/home/rokonoid/projects/java-tips/src/com/bazlur/tips/Gender.java"); //.normalize().toAbsolutePath();
        System.out.println(gender);
        Path target = Paths.get("./out/Gender2.java");
        Files.copy(gender, target, StandardCopyOption.REPLACE_EXISTING);


        System.out.println(Files.getLastModifiedTime(path));
        System.out.println(Files.size(path));
        System.out.println(Files.isSymbolicLink(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.readAttributes(path, "*"));

        Files.walkFileTree(startingDirectory, new FindJavaVisitor());


        Path log = Paths.get("/var/log/formreleaf.log");

//        try (BufferedReader reader = Files.newBufferedReader(log, StandardCharsets.UTF_8)) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                //System.out.println(line);
//                log(line);
//            }
//        } catch (IOException ignored) {
//        }

        boolean shutdown = false;


        WatchService watcher = FileSystems.getDefault().newWatchService();
        WatchKey key = null;
        try {
            key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        } catch (IOException x) {
            System.err.println(x);
        }
        for (; ; ) {
            key = watcher.take();

            key.pollEvents().stream().filter(event -> event.kind() == ENTRY_MODIFY).forEach(event -> System.out.println("Home dir changed!"));


            // Reset the key -- this step is critical if you want to
            // receive further watch events.  If the key is no longer valid,
            // the directory is inaccessible so exit the loop.
            boolean valid = key.reset();
            if (!valid) {
                break;
            }
            // Email the file to the
            //  specified email alias.
            // System.out.format("Emailing file %s%n", filename);
            //Details left to reader....
        }
    }


    private static void log(String... args) {
        System.out.println(Arrays.toString(args));
    }
}
