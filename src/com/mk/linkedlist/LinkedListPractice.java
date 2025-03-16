package com.mk.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
};

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place australia = new Place("Australia", 6000);
        Place australiaAgain = new Place("australia", 6000);
        addPlace(placesToVisit, australia);
        addPlace(placesToVisit, australiaAgain);
        addPlace(placesToVisit, new Place("Malaysia", 50));
        addPlace(placesToVisit, new Place("Thailand", 2000));
        addPlace(placesToVisit, new Place("Bali", 1500));
        addPlace(placesToVisit, new Place("India", 4000));
        addPlace(placesToVisit, new Place("Vietnam", 5000));

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward  = true;

       printMenu();
       while (!quitLoop) {
           if (!iterator.hasPrevious()) {
               System.out.println("Originating: " + iterator.next());
               forward = true;
           }
           if (!iterator.hasNext()) {
               System.out.println("Final: " + iterator.previous());
               forward = false;
           }
           System.out.println("Enter value: ");
           String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

           switch (menuItem) {
               case "F":
                   System.out.println("User wants to go forward");
                   if (iterator.hasNext()) {
                       System.out.println(iterator.next());
                   }
                   break;
               case "B":
                   System.out.println("User wants to go backwards");
                   if (iterator.hasPrevious()) {
                       System.out.println(iterator.previous());
                   }
                   break;
               case "M":
                   printMenu();
                   break;
               case "L":
                   System.out.println(placesToVisit);
                   break;
               default:
                   quitLoop = true;
                   break;
           }
       }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for(Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace: list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    private static void printMenu () {
        System.out.println("""
                    Available actions (select work or letter):
                    (F)orward
                    (B)ackwords
                    (L)ist Places
                    (M)enu
                    (Q)uit
                """);
    }
}
