package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 5/21/16.
 */
public class Main {

    public static void main(String[] args) {
        String platforms[] = {
                "SRX424",
                "SRX4245",
                "vSRX5",
                "cSRX44",
                "EX4999",
                "EX1999",
                "EX1000",
                "EX4999",
                "EX6999",
                "EX8999",
                "QFX5110",
                "QFX5199",
                "QFX51001",
                "QFX51999",
                "MX10",
                "MX99",
                "MX199",
                "MX200",
                "MX299",
                "MX499",
                "MX2099",
                "MX2001",
                "MX2021",
                "vMX7889",
                "cMX15"
        };

        for (String platform : platforms) {
            String groupName = GroupProcessorEngineHelper.getGroupName(platform);
            System.out.println(platform + ": " + groupName);
        }

    }

}