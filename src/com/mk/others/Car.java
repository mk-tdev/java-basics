package com.mk.others;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Red";
    private double milege = 12.45D;
    private int doors = 2;
    private boolean convertible = true;

    private static String someStaticValue = "Some Static Value";

    public static String getSomeStaticValue() {
        return someStaticValue;
    }

    public static void setSomeStaticValue(String someStaticValue) {
        Car.someStaticValue = someStaticValue;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getMilege() {
        return milege;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMilege(double milege) {
        this.milege = milege;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar () {
        System.out.println(doors +
                "-Door " + color + " " + make + " "
                + model + " " + (convertible ? "Convertible" : "")
                + " and runs " + milege + " kms per litre.");
    }
}
