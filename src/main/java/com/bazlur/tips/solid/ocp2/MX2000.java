package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/26/16.
 */
public class MX2000 extends BaseGroupName {
    public String getRegex() {
        return "(MX20[0-9]{2})";
    }

    public String getGroupName() {
        return "MX2000";
    }
}
