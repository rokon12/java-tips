package com.bazlur.tips.brightness;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/9/16.
 */
public class XRndDemo {

    private static final Pattern SCREEN_HEADER_PATTERN = Pattern.compile("^(\\d+)x(\\d+)[+](\\d+)[+](\\d+)$");
    private static final Pattern SCREEN_MODELINE_PATTERN = Pattern.compile("^(\\d+)x(\\d+)$");
    private static final Pattern FREQ_PATTERN = Pattern.compile("^(\\d+)[.](\\d+)(?:\\s*[*])?(?:\\s*[+])?$");
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");

    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec(new String[]{"xrandr", "-q"});

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        String name = null;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            String[] sa = WHITESPACE_PATTERN.split(line);
            System.out.println(Arrays.toString(sa));
            if ("connected".equals(sa[1])) {
                if (name != null) {
                    //screens.put(name, possibles.toArray(new Screen[possibles.size()]));
                    // possibles.clear();
                }
                name = sa[0];

                // enabled?
                if (sa.length > 2) {
                    // save position of this screen, will be used later when current modeline is parsed
                    if ("primary".equals(sa[2])) {
                        //parseScreenHeader(currentScreenPosition, sa[3]);
                        // save primary
                        //primaryScreenIdentifier = name;
                    } else {
                        //parseScreenHeader(currentScreenPosition, sa[2]);
                    }
                } else {
                    // disabled screen, no position info available
                    //currentScreenPosition[0] = 0;
                    // currentScreenPosition[1] = 0;
                }
            }

            //System.out.println(line);

        }
    }
}
