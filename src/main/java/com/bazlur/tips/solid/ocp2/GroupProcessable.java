package com.bazlur.tips.solid.ocp2;

/**
 * @author Bazlur Rahman Rokon
 * @since 5/21/16.
 */
public interface GroupProcessable {

    String getRegex();

    String getGroupName();

    boolean matches(String platform);
}
