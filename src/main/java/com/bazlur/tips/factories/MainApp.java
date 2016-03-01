package com.bazlur.tips.factories;

import java.util.HashMap;
import java.util.Random;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/27/16.
 */
public class MainApp {
    private static final String alphabet = "01234567890QWERTYUIOPASDFGHJKLZXCVBNM";

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("key1", getNextString(30000));
        map.put("key2", getNextString(50000));


        System.out.println(map.get("key1").length());
        System.out.println(map.get("key2").length());
    }

    static String getNextString(int length) {
        Random random = new Random();

        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < length; i++) {
            buffer.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        return buffer.toString();
    }
}
