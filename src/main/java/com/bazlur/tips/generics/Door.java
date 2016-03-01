package com.bazlur.tips.generics;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public class Door {
    private boolean isOpen;

    public Door() {
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
        }
    }
}
