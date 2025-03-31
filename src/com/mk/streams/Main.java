package com.mk.streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> bingoPool = new ArrayList<String>(75);

        int start = 1;
        for (char c : "BINGO".toCharArray()) {
            for (int k = start; k < (start + 15); k++) {
                bingoPool.add("" + c + k);
            }
            start = start + 15;
        }

        Collections.shuffle(bingoPool);
        System.out.println(bingoPool);
        // print first 15
        for (int i = 0; i < 15; i++) {
//            System.out.println(bingoPool.get(i));
        }
        System.out.println("-".repeat(30));

        // sublist will alter original list as well
        // use modifiable copy to avoid this
//        List<String> firstOnes = bingoPool.subList(0, 15);

        List<String> firstOnes = new ArrayList<>(bingoPool.subList(0, 15));

        firstOnes.sort(Comparator.naturalOrder());
        firstOnes.replaceAll((s) -> {
            if (s.indexOf('G') == 0 || s.indexOf('O') == 0) {
                return s.charAt(0) + "-" + s.substring(1);
            }
            return s;
        });

//        System.out.println(firstOnes);
//        System.out.println("-".repeat(30));

        for (int i = 0; i < 15; i++) {
//            System.out.println(bingoPool.get(i));
        }
        printLineBreaks(false);
        /* stream code will not affect original collection */
        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        printLineBreaks(true);
        String[] fruits = {"Apple", "Banana", "Orange", "Pear"};
        var firstStream = Arrays.stream(fruits)
                .sorted(Comparator.reverseOrder());
//        firstStream.forEach(s -> System.out.print(s + " "));
//        System.out.println();
//        System.out.println("-".repeat(30));
        var secondStream = Stream.of("Apple", "Banana", "Orange", "Pear")
                .map(String::toUpperCase);
//        secondStream.forEach(System.out::println);
//        System.out.println("-".repeat(30));

        Stream.concat(firstStream, secondStream)
                .map(s -> s.charAt(0) + "-" + s)
                .forEach(s -> System.out.print(s + " "));

        printLineBreaks(true);

        Map<Character, int[]> myMap = new LinkedHashMap<>();
        int bingoIndex = 1;

        for (char c : "BINGO".toCharArray()) {
            int[] numbers = new int[15];
            int labelNo = bingoIndex;
            Arrays.setAll(numbers, (i) -> i + labelNo);
            System.out.println(Arrays.toString(numbers));
            myMap.put(c, numbers);
            bingoIndex += 15;
        }

        System.out.println(myMap);

        myMap.entrySet()
                .stream()
                .map(e -> e.getKey() + " has range: " +
                        e.getValue()[0] + " - " + e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);

        Random random = new Random();
        Stream.generate(() -> random.nextInt(5))
                .limit(10)
                .forEach(s -> System.out.print(s + " "));
        printLineBreaks(true);
        IntStream.iterate(10, i -> i + 1)
                .limit(150)
                .filter(Main::isPrime)
                .limit(15)
                .forEach(s -> {
                    System.out.print(s + " ");
                });

        printLineBreaks(true);
        IntStream.iterate(10, n -> n <=100, n -> n + 1)
                .filter(Main::isPrime)
                .forEach(s -> System.out.print(s + " "));
    }
    private static void printLineBreaks(boolean printLn) {
        if (printLn) {
            System.out.println();
        }
        System.out.println("-".repeat(30));
    }

    public static boolean isPrime(int n) {
        if (n <= 2) {
            return (n == 2);
        }
        for (int divisor = 2; divisor < n; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
