package com.bazlur.tips.generics.boundedtype;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public class AnimalHouse<T extends Animal> {
    private T[] members;

    public AnimalHouse(T[] members) {
        this.members = members;
    }

    public int countMembers() {
        return members.length;
    }

}
