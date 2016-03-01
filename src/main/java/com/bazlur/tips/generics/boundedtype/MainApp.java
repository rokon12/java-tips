package com.bazlur.tips.generics.boundedtype;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public class MainApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        AnimalHouse<Dog> dogAnimalHouse = new AnimalHouse<>(new Dog[]{dog1, dog2});

        AnimalHouse<Cat> catAnimalHouse = new AnimalHouse<>(new Cat[]{cat1, cat2});

    }
}
