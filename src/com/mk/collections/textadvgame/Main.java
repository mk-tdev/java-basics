package com.mk.collections.textadvgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdventureGame adventureGame = new AdventureGame();
//        System.out.println(adventureGame);

        adventureGame.play("road");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);

            if (direction.equals("Q")) {
                break;
            }
            adventureGame.move(direction);
        }
    }
}
