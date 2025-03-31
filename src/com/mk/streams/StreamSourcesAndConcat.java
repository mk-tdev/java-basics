package com.mk.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSourcesAndConcat {
    static int counter = 0;
    public static void main(String[] args) {
        int seed = 1;

        var streamB = Stream.iterate(seed, i -> i <=15 ,x -> x + 1)
                .map(x -> "B" + x);

        seed += 15;

        var streamI = Stream.iterate(seed, x -> x + 1)
                        .limit(15)
                        .map(x -> "I" + x);

        seed += 15;
        String[] oLabels = new String[15];
        int finalSeed = seed;
        Arrays.setAll(oLabels, x -> "N" + (finalSeed + x));
        var streamN = Arrays.stream(oLabels);

        seed += 15;
        var streamG = Stream.of("G46", "G47", "G48", "G49", "G50"
        , "G51", "G52", "G53", "G54", "G55", "G56", "G57", "G58", "G59", "G60");

        seed += 15;
        int rSeed = seed;

        var streamO = Stream.generate(StreamSourcesAndConcat::getCounter).limit(15)
                        .map(x -> "O" + (rSeed + x));

        var streamBI = Stream.concat(streamB, streamI);
        var streamNG = Stream.concat(streamN, streamG);
        var streamBING = Stream.concat(streamBI, streamNG);

        Stream.concat(streamBING, streamO).forEach(System.out::println);
        Main.printLineBreaks(true);

        var fruits = new String[]{"Apple", "Banana", "Orange", "Watermelon", "Apple", "Pears"};
        Stream.of(fruits).distinct().sorted().forEach(System.out::println);
    }

    private static int getCounter() {
        return counter++;
    }
}
