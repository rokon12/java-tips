package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/25/16.
 */
public class SRXHighEnd extends BaseGroupName {
    @Override
    public String getRegex() {
        return "(SRX\\d{4})";
    }

    @Override
    public String getGroupName() {
        return "SRX High End";
    }
}
