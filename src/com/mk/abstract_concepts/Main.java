package com.mk.abstract_concepts;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "Big", 100);

        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Wolf", "Big", 100));
        animals.add(new Fish("GoldFish", "small", 12));
        animals.add(new Dog("Pug", "small", 20));

        for (Animal animal: animals) {
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
