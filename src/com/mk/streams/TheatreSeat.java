package com.mk.streams;

import java.util.Random;

public record TheatreSeat(
        char rowMarker, int seatNumber, boolean isReserved
) {

    public TheatreSeat(char rowMarker, int seatNumber) {
        this(rowMarker, seatNumber, new Random().nextBoolean());
//        this(rowMarker, seatNumber, false);
    }
}
