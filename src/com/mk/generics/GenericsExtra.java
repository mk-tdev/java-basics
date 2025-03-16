package com.mk.generics;

import java.util.List;

public class GenericsExtra {
    public static void main(String[] args) {
        // Incomplete practice


        testList(List.of(new String[]{"RTest"}));
        testList(List.of(new Integer[]{100, 200}));
    }

    // type erasia
    public static void testList(List<?> list) {
        for (var element: list) {
            if (element instanceof String s) {
                System.out.println(s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println(i.floatValue());
            }

        }
    }
}
