package com.bazlur.tips.magic;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.util.HashSet;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/8/16.
 */
public class UseOfUnsafe {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InterruptedException, MalformedURLException {

    }

    static int doSomethingVeryImportant() {
        try {
            return 0;
        } finally {
            return 1;
        }

    }

    static int someFunc() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }

    public static long sizeOf(Object o) throws NoSuchFieldException, IllegalAccessException {
        Unsafe u = getUnsafe();
        HashSet<Field> fields = new HashSet<>();
        Class c = o.getClass();

        while (c != o.getClass()) {
            for (Field f : c.getDeclaredFields()) {
                if ((f.getModifiers() & Modifier.STATIC) == 0) {
                    fields.add(f);
                }
            }
            c = c.getSuperclass();
        }
        // get offset
        long maxSize = 0;
        for (Field f : fields) {
            long offset = u.objectFieldOffset(f);
            if (offset > maxSize) {
                maxSize = offset;
            }
        }

        return ((maxSize / 8) + 1) * 8;

    }

    private static Unsafe getUnsafe() throws IllegalAccessException, NoSuchFieldException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);

        return (Unsafe) field.get(null);
    }
}
