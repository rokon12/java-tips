package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/25/16.
 */
public class ExFixed extends BaseGroupName {
    public String getRegex() {
        //1000 - 1999  1[0-9]{3} |
        //2000 - 2999  2[0-9]{3} |
        //3000 - 3999  3[0-9]{3} |
        //4000 - 4999  4[0-9]{3} |

        return "(EX[1-4][0-9]{3})";
    }

    public String getGroupName() {
        return "EX Fixed";
    }
}
