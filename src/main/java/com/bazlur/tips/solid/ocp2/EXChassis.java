package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/26/16.
 */
public class EXChassis extends BaseGroupName {
    public String getRegex() {

        return "(EX[6-9][0-9]{3})";
    }

    public String getGroupName() {

        return "EX Chassis";
    }
}
