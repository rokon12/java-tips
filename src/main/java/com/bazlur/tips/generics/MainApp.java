package com.bazlur.tips.generics;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class MainApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("D1");
        Dog dog2 = new Dog("D2");

        Human bazlur = new Human("Bazlur");
        Human oronno = new Human("Oronno");

        Door door1 = new Door();
        Door door2 = new Door();

        House<Dog> dogHouse = new House<>(new Door[]{door1, door2}, new Dog[]{dog1, dog2});
        int dogMembers = dogHouse.countMembers();
        System.out.println(dogMembers);

        dogHouse.openAllDoors();
        dogHouse.closeAllDoors();


        House<Human> humanHouse = new House<>(new Door[]{door1, door2}, new Human[]{bazlur, oronno});
        int humanMembers = humanHouse.countMembers();
        System.out.println(humanMembers);

        humanHouse.openAllDoors();
        humanHouse.closeAllDoors();


        Tuple<String, String> tuple = new Tuple<String, String>("Hello", "world");
        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Rahim", 45);
        person.showTypes();

        Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple = new Tuple<String, Tuple<Integer, Integer>>("Tuple", new Tuple<Integer, Integer>(45, 89));
        tupleInsideTuple.showTypes();

    }
}
