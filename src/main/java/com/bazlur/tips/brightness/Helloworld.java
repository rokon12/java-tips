package com.bazlur.tips.brightness;

import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/9/16.
 */
public class Helloworld {

    public static native double cos(double x);

    public static native double sin(double x);

    static {
        Native.register(Platform.C_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        System.out.println("cos(0)=" + cos(0));
        System.out.println("sin(0)=" + sin(0));
    }
}
