package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/26/16.
 */
public class QFX5100 extends BaseGroupName {
    public String getRegex() {

        return "(QFX51[0-9]{2})";
    }

    public String getGroupName() {
        return "QFX5100";
    }
}
