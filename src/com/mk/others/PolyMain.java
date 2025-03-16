package com.mk.others;

public class PolyMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("It's a fast car");
        runRace(vehicle);

        Vehicle ferrari = new GasPoweredVehicle("Fast car", 15.2, 6);
        runRace(ferrari);

        Vehicle tesla = new ElectricVehicle("Tesla", 568, 75);
        runRace(tesla);

        Vehicle autoMod = new HybridVehicle("Auto Mod", 16, 8, 6);
        runRace(autoMod);
    }

    public static void runRace(Vehicle vehicle) {
        vehicle.startEngine();
        vehicle.drive();
    }
}
