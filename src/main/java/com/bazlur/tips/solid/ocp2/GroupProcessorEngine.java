package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 5/21/16.
 */
public class GroupProcessorEngine {
    private GroupProcessable[] groupProccessable;

    public GroupProcessorEngine(GroupProcessable[] groupProcessable) {
        this.groupProccessable = groupProcessable;
    }

    public String process(String platform) {
        GroupProcessable target = null;
        for (GroupProcessable handle : groupProccessable) {
            if (handle.matches(platform)) {
                target = handle;
                break;
            }
        }
        if (target != null) {
            return target.getGroupName();
        }

        return null;
    }

    public boolean isGroupName(String groupName) {
        for (GroupProcessable handle : groupProccessable) {
            if (handle.getGroupName().equals(groupName)) {
                return true;
            }
        }

        return false;
    }

    public GroupProcessable findGroupProcessable(String groupName) {
        for (GroupProcessable handle : groupProccessable) {
            if (handle.getGroupName().equals(groupName)) {
                return handle;
            }
        }

        return null;
    }
}
