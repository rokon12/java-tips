package com.bazlur.tips.generics;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Gheo gheo");
    }

    @Override
    public String toString() {
        return name;
    }
}
