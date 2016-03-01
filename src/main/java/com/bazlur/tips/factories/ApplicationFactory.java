package com.bazlur.tips.factories;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/22/16.
 */
public class ApplicationFactory implements Factory<Application> {
    @Override
    public Application create() {
        return new Application();
    }
}
