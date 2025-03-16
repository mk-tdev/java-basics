package com.mk.abstract_concepts;

public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow")) {
            System.out.println(type + " lazily swimming");
        } else {
            System.out.println(type + " fishing away");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Goldfish") {
            System.out.println("swish! ");
        } else {
            System.out.println("Splash! ");
        }
    }
}
