package com.mk.collections.store;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    enum CartType {PHYSICAL, VIRTUAL};

    private static int lastId = 1;

    private int id;
    private LocalDate cartDate;
    private CartType cartType;

    private Map<String, Integer> products;

    public Cart(CartType cartType, int days) {
        this.cartType = cartType;
        this.id = lastId++;
        this.cartDate = LocalDate.now().minusDays(days);
        this.products = new HashMap<>();
    }

    public Cart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCartDate() {
        return cartDate;
    }

    public void addItem(InventoryItem item, int quantity) {
        products.merge(item.getProduct().sku(), quantity, Integer::sum);

        if (!item.reserveItem(quantity)) {
            System.out.println("Not enough space to reserve");
        }
    }

    public void removeItem(InventoryItem item, int quantity) {
        int current = products.get(item.getProduct().sku());
        if (current <= quantity) {
            quantity = current;
            products.remove(item.getProduct().sku());
            System.out.printf("Removed [%s] %n", item.getProduct().name());
        } else {
            products.merge(item.getProduct().sku(), quantity, (oldValue, newValue) -> oldValue - newValue);
            System.out.printf("%d [%s] Remove %n", quantity, item.getProduct().name());
        }
        item.reserveItem(quantity);
    }

    public void printSalesSlip(Map<String, InventoryItem> inventory) {
        double total = 0;
        System.out.println("-".repeat(30));
        System.out.println("Thank you for the sale: ");
        for (var cartItem: products.entrySet()) {
            System.out.printf("%s [%s] %n", cartItem.getKey(), cartItem.getValue());

            var item = inventory.get(cartItem.getKey());
            int qty = cartItem.getValue();
            double itemizedPrice = (item.getPrice() * qty);
            total += itemizedPrice;

            System.out.printf("\t%s %-10s (%d)@ $%.2f = $%.2f%n", cartItem.getKey(), item.getProduct().name(), qty, item.getPrice(), itemizedPrice);
        }
        System.out.printf("Total cost: $%.2f%n", total);
        System.out.println("-".repeat(30));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartDate=" + cartDate +
                ", products=" + products +
                '}';
    }
}
