package com.bazlur.tips;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/7/16.
 */
public class ObjectCloning2 {


    public static void main(String[] args) {
        String[] names = {"SRX110H2-VA",
                "SRX210HE2",
                "SRX240H",
                "SRX100B"};

        for (String name : names) {
            System.out.println(name + " : " + getFormattedPlatformName(name));
        }
    }

    public static String getFormattedPlatformName(String platformName) {
        Pattern p = Pattern.compile("(.*?)(\\d+)(.*)");
        Matcher m = p.matcher(platformName);
        if (m.find()) {

            return m.group(1) + m.group(2);
        }

        return null;
    }

}
