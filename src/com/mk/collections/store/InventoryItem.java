package com.mk.collections.store;

public class InventoryItem {
    private Product product;
    private double price;
    private int quantityTotal;
    private int quantityReserved;
    private int quantityReorder;
    private int quantityLow;

    public InventoryItem(Product product, double price, int quantityTotal, int quantityLow) {
        this.product = product;
        this.price = price;
        this.quantityTotal = quantityTotal;
        this.quantityLow = quantityLow;
        this.quantityReorder = quantityTotal;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public boolean reserveItem(int quantity) {
        if ((quantityTotal - quantityReserved) >= quantity) {
            quantityReserved += quantity;
            return true;
        }

        return false;
    }

    public void releaseItem(int quantity) {
        quantityReserved -= quantity;
    }

    public boolean sellItem(int quantity) {
        if ((quantityTotal) >= quantity) {
            quantityReserved -= quantity;
            quantityTotal -= quantity;

            if (quantityTotal <= quantityLow) {
                placeInventoryOrder();
            }

            return true;
        }
        return false;
    }

    private void placeInventoryOrder() {
        System.out.printf("Place Inventory Order %d : %s%n", quantityReorder, product);
    }

    @Override
    public String toString() {
        return "%s, $%,2f : [%04d,% 2d]".formatted(product, price, quantityTotal, quantityReserved);
    }
}
