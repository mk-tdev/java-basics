package com.mk.others;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
//        simpleArrays();
//        MultiDimensional();

        Object[] objectsAsArray = new Object[3];
        objectsAsArray[0] = new int[] {1, 2, 3};
        objectsAsArray[1] = new String[] {"A", "B" };


    }

    public static void MultiDimensional() {
        int [][] array2 = new int[4][4];
        array2[1][0] = 10;
        System.out.println(array2.length);
        System.out.println(Arrays.toString(array2[1]));

        for(var sn: array2) {
            for (var s: sn) {
                System.out.println();
                System.out.println(s);
            }
        }
    }

    public static void simpleArrays() {
        int[] someNumbers = {1, 4, 5, 7};

        for(int sn: someNumbers) {
            System.out.println(sn);
        }
        System.out.println(Arrays.toString(someNumbers));

        String[] elements = {"S", "A", "V", "B"};
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));

        for(String el: elements) {
            System.out.println(el);
        }
    }
}
