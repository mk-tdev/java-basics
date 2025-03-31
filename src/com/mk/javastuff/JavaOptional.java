package com.mk.javastuff;

import com.mk.javastuff.assets.PhoneProduct;

import java.util.Optional;

public class JavaOptional {
    public static void main(String[] args) {
        Optional<PhoneProduct> myProduct = findProductByName("Apple");

        myProduct.ifPresent(System.out::println);

        myProduct.ifPresent(phoneProduct -> System.out.println(phoneProduct.getBatteryCapacity()));

        System.out.println(myProduct.orElse(new PhoneProduct("Google")));

        System.out.println(myProduct.orElseGet(PhoneProduct::new));

        myProduct.map(PhoneProduct::getLaunchYear).ifPresent(System.out::println);

        System.out.println(myProduct.map(PhoneProduct::getBatteryCapacity).orElse(4300));

    }

    private static Optional<PhoneProduct> findProductByName(String name) {
        PhoneProduct phoneProduct = new PhoneProduct(name);

        return Optional.ofNullable(null);
    }
}
