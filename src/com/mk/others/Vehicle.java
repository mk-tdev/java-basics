package com.mk.others;

public class Vehicle {
    private String description;

    public Vehicle(String description) {
        this.description = description;
    }

    public void startEngine () {
        System.out.println("Starting engine");
    }

    protected void runEngine() {
        System.out.println("Running engine ");
    }

    public void drive() {
        String instanceType = getClass().getSimpleName();
        System.out.println("Let's drive with type " + instanceType);
        runEngine();
    }
}

class GasPoweredVehicle extends Vehicle {
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredVehicle(String description) {
        super(description);
    }

    public GasPoweredVehicle(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage execeds the average: %.2f %n", avgKmPerLitre);
    }
}

class ElectricVehicle extends Vehicle {
    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricVehicle(String description) {
        super(description);
    }

    public ElectricVehicle(String description, double avgKmPerCharge, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridVehicle extends Vehicle {
    private double avgKmPerLitre;
    private int cylinders = 6;
    private int batterySize = 6;

    public HybridVehicle(String description) {
        super(description);
    }

    public HybridVehicle(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up, Ready!%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below the average: %.2f %n", avgKmPerLitre);
    }
}

