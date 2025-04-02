package com.mk.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTerminal {
    public static void main(String[] args) {
        // statistical reduction methods

        var result = IntStream
                .iterate(0, i -> i <=1010, i -> i + 10)
                .summaryStatistics();

        System.out.println("Result--> " + result);

        var leapYearData = IntStream
                .iterate(2000, i -> i <= 2035, i -> i + 1)
                .filter(year -> year % 4 == 0)
                .peek(s -> System.out.println("--> " + s))
                .summaryStatistics();
        System.out.println("Result--> " + leapYearData);

        Main.printLineBreaks(true);

        TheatreSeat[] seats = new TheatreSeat[100];

        Arrays.setAll(seats, i -> new TheatreSeat(
                (char) ('A' + i / 10), i % 10 + 1
        ));

//        System.out.println(Arrays.toString(seats));

        long reservationCount = Arrays.stream(seats)
                .filter(TheatreSeat::isReserved)
                .count();
        System.out.println("reservationCount: " + reservationCount);

        boolean hasBookings = Arrays.stream(seats)
                .anyMatch(TheatreSeat::isReserved);
        System.out.println("hasBookings: " + hasBookings);

        boolean fullyBooked = Arrays.stream(seats)
                .allMatch(TheatreSeat::isReserved);
        System.out.println("fullyBooked: " + fullyBooked);

        boolean eventWashedOut = Arrays.stream(seats)
                .noneMatch(TheatreSeat::isReserved);
        System.out.println("eventWashedOut: " + eventWashedOut);
    }
}
