package com.bazlur.tips.solid.ocp2;

import java.util.regex.Pattern;

/**
 * @author Bazlur Rahman Rokon
 * @since 5/21/16.
 */
public abstract class BaseGroupName implements GroupProcessable {
    @Override
    public boolean matches(String platform) {

        return Pattern.compile(getRegex()).matcher(platform).matches();
    }
}