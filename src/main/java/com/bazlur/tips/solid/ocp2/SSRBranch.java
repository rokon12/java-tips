package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/25/16.
 */
public class SSRBranch extends BaseGroupName {
    @Override
    public String getRegex() {
        return "(SRX\\d{3})";
    }

    @Override
    public String getGroupName() {
        return "SRX Branch";
    }
}
