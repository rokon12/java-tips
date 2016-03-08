package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/26/16.
 */
public class VirtualMX extends BaseGroupName {
    public String getRegex() {
        return "(vMX[0-9]+)|(cMX[0-9]+)";
    }

    public String getGroupName() {
        return "Virtual MX";
    }
}
