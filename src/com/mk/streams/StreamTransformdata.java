package com.mk.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTransformdata {
    public static void main(String[] args) {

        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .distinct()
//                .dropWhile(i -> Character.toUpperCase(i) <= 'E')
//                .takeWhile(i -> i < 'a')
//                .filter(i -> Character.toUpperCase(i) > 'E')
//                .skip(5)
                .forEach(d -> System.out.printf("%c ", d));

        Main.printLineBreaks(true);

        Random r = new Random();

        Stream.generate(() -> r.nextInt((int) 'A', (int) 'Z' + 1))
                .limit(50)
                .distinct()
                .sorted()
                .forEach(d -> System.out.printf("%c ", d));


    }
}
