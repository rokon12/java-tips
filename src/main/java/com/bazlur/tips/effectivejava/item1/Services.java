package com.bazlur.tips.effectivejava.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/8/16.
 */
public class Services {
    private Services(){}

    private static final Map<String, Provider> PROVIDER = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";


}
