package com.mk.javastuff.assets;

public class PhoneProduct implements Printable {
    @Override
    public String print(String prefix) {
        return "**";
    }

    private String brand;
    private String model;
    private double price;
    private int launchYear;
    private int batteryCapacity;

    public PhoneProduct() {
    }

    public PhoneProduct(String brand, String model) {
        this(brand, model, 999.00, 2024, 5200);
    }

    public PhoneProduct(String brand) {
        this(brand, "iPhone", 999.00, 2024, 5200);
    }

    public PhoneProduct(String brand, String model, double price, int launchYear, int batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.launchYear = launchYear;
        this.batteryCapacity = batteryCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", launchYear=" + launchYear +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
