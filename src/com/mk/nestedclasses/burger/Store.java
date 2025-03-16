package com.mk.nestedclasses.burger;

public class Store {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Mayo", "SALT");
        System.out.println(regularMeal);

        System.out.println("-".repeat(30));

        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);
    }
}
