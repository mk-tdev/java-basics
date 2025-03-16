package com.mk.others;

public class SwitchEnhanced {
    public static void main(String[] args) {

        System.out.println("Which quarter is Feb: "
                + whichQuarter("JUN"));
    }

    public static String whichQuarter(String month) {
        return switch (month) {

            case "JAN", "FEB", "MAR" -> {
                yield "1st";
            }

            case "APR", "MAY", "JUN" -> "2nd";

            default -> {
                String response =   " " + "Unexpected";
                yield response;
            }
        };
    }
}
