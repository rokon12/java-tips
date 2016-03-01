package com.bazlur.tips.concurrency;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/7/15.
 */
public class ThisEscape {

    public static void main(String[] args) {
        String st = "";
        //st.toString()

        Collections.synchronizedList(new ArrayList<>());

        int f = 0x7FFFFFFF;
        System.out.println(f);

        Collections.unmodifiableList(new ArrayList<>());

    }
}
