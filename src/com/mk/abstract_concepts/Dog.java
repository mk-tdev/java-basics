package com.mk.abstract_concepts;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow")) {
            System.out.println(type + " walking");
        } else {
            System.out.println(type + " running");
        }
    }

    @Override
    public void makeNoise() {

        if (type == "Wolf") {
            System.out.println("Howling! ");
        } else {
            System.out.println("Woof! ");
        }
    }
}
