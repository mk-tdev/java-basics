package com.mk.others;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Input1");
        String input1 = scanner.nextLine();
        System.out.println("Enter Input1");
        String input2 = scanner.nextLine();

        System.out.println("Entered " + input1 + " - " + input2);
    }
}
