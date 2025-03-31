package com.mk.javastuff;

import com.mk.javastuff.assets.PhoneProduct;
import com.mk.javastuff.assets.Printable;

public class JavaLambdas {
    public static void main(String[] args) {
        PhoneProduct p = new PhoneProduct("Apple", "iPhone16");

//        p.print();

        Printable lambdaPrintable = s -> s + " Print something";
        printSomething(lambdaPrintable);
    }

    private static void printSomething(Printable p) {
        System.out.println(p.print("!!!"));
    }

}
