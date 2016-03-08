package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/25/16.
 */
public class VirtualSRX extends BaseGroupName {

    @Override
    public String getRegex() {
        return "(vSRX\\d+)|(cSRX\\d+)";
    }

    @Override
    public String getGroupName() {
        return "Virtual SRX";
    }
}
