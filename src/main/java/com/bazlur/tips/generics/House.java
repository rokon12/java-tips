package com.bazlur.tips.generics;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class House<T> {
    private Door[] doors;
    private T[] members;

    public House(Door[] doors, T[] members) {
        this.doors = doors;
        this.members = members;
    }

    public int countMembers() {
        return members.length;
    }

    public void openAllDoors() {
        System.out.println("Opening all doors");
        for (Door door : doors) {
            door.open();
        }
    }

    public void closeAllDoors() {
        System.out.println("Closing all doors");

        for (Door door : doors) {
            door.close();
        }
    }
}
