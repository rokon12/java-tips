package com.bazlur.tips.brightness;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/9/16.
 */
public class CLibraryDemo {
    public static void main(String[] args) {
        try {
            System.out.println(CLibrary.INSTANCE.getpid());
            System.out.println(CLibrary.INSTANCE.getppid());
            long[] timenul = new long[1];
            System.out.println(CLibrary.INSTANCE.time(timenul));
        } catch (UnsatisfiedLinkError e) {
            System.out.println("Exception" + e);
        }
    }
}


interface CLibrary extends Library {
    CLibrary INSTANCE = (CLibrary) Native.loadLibrary("c", CLibrary.class);

    int getpid();

    int getppid();

    long time(long buf[]);
}