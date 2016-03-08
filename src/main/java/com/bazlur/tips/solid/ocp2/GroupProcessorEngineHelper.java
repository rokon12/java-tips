package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/26/16.
 */
public class GroupProcessorEngineHelper {
    private static GroupProcessorEngine engine = new GroupProcessorEngine(
            new GroupProcessable[]{
                    new SRXHighEnd(),
                    new SSRBranch(),
                    new VirtualSRX(),
                    new EXChassis(),
                    new ExFixed(),
                    new QFX5100(),
                    new QFX51000(),
                    new MX80MX104(),
                    new MX240MX960(),
                    new MX2000(),
                    new VirtualMX()
            }
    );

    public static boolean isGroupName(String groupName) {
        return engine.isGroupName(groupName);
    }

    public GroupProcessable findGroupProcessable(String groupName){
        return engine.findGroupProcessable(groupName);
    }

    public static String getGroupName(String platform) {
        return engine.process(platform);
    }
}
