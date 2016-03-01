package com.bazlur.tips.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import static java.nio.file.attribute.PosixFilePermission.*;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/4/15.
 */
public class PermissionWizard {
    public static void setPermissions(String path) {
        Path profile = Paths.get(path);

        try {
            PosixFileAttributes attrs = Files.readAttributes(profile, PosixFileAttributes.class);
            Set<PosixFilePermission> posixFilePermissions = attrs.permissions();
            posixFilePermissions.clear();

            String owner = attrs.owner().getName();
            String parms = PosixFilePermissions.toString(posixFilePermissions);
            System.out.println(String.format("%s %s%n", owner, parms));

            posixFilePermissions.add(OWNER_READ);
            posixFilePermissions.add(GROUP_READ);
            posixFilePermissions.add(OTHERS_READ);
            posixFilePermissions.add(OWNER_WRITE);

            Files.setPosixFilePermissions(profile, posixFilePermissions);

            System.out.println(String.format("%s %s%n", owner, PosixFilePermissions.toString(posixFilePermissions)));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        setPermissions("/home/rokonoid/projects/java-tips/src/main/java/com/bazlur/tips/TwitterUser.java");
    }

}
