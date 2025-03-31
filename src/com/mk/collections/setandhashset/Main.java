package com.mk.collections.setandhashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ArrayAndArrayList();
//        LinkedListAndArrayList();

//        MapAndHashMap();
        SetAndHashSet();
    }

    public static void ArrayAndArrayList() {
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        System.out.println(Arrays.toString(fruits));
        System.out.println(fruitsList);
        System.out.println("-".repeat(20));
        fruitsList.forEach(System.out::println);
        System.out.println("-".repeat(20));
        System.out.println(fruits[1]);
        System.out.println("-".repeat(20));
        System.out.println(fruitsList.get(1));
        System.out.println("-".repeat(20));
        System.out.println(fruits.length + " - "  + fruitsList.size());
        fruitsList.add("Durian");
        System.out.println(fruitsList);
        System.out.println("-".repeat(20));
        fruits[0] = "Mango";
        System.out.println(Arrays.toString(fruits));
        System.out.println("-".repeat(20));
        System.out.println(fruitsList);
        fruitsList.set(0, "Red Apple");
        System.out.println(fruitsList);
        fruitsList.remove("Durian");
        System.out.println(fruitsList);
    }

    public static void LinkedListAndArrayList() {
        LinkedList<String> fruitsList1 = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango"));

        LinkedList<String> fruitsList2 = new LinkedList<>(Arrays.asList("Durian", "Red Apple", "Chikku", "Watermelon"));

        System.out.println(fruitsList1);
        System.out.println("-".repeat(20));
        System.out.println(fruitsList2);

        System.out.println(fruitsList2.contains("Red Apple"));
        System.out.println(fruitsList2.get(2));

    }

    public static void MapAndHashMap() {
        HashMap<String, Integer> empIDs = new HashMap<>();

        empIDs.put("John", 123);
        empIDs.put("Carl", 951);
        empIDs.put("Jane", 456);
        empIDs.put("Mary", 789);
        System.out.println(empIDs);
        System.out.println("-".repeat(20));
        System.out.println(empIDs.get("John"));
        System.out.println("-".repeat(20));
        empIDs.replace("John", 124);
        System.out.println(empIDs);
        System.out.println("-".repeat(20));
        System.out.println(empIDs.containsKey("John"));
        System.out.println("-".repeat(20));
        System.out.println(empIDs.containsValue(951));
        System.out.println("-".repeat(20));
        empIDs.put("Carl", 955);
        System.out.println(empIDs);
        System.out.println("-".repeat(20));
        empIDs.putIfAbsent("Jane", 459);
        System.out.println(empIDs);
        System.out.println("-".repeat(20));
        empIDs.remove("Carl");
        System.out.println(empIDs);
        System.out.println("-".repeat(20));
    }

    public static void SetAndHashSet() {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");

        System.out.println(names);
        System.out.println("-".repeat(10));
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-".repeat(10));
        names.forEach(System.out::println);
        System.out.println("-".repeat(10));

        Iterator<String> namesIte = names.iterator();

        while (namesIte.hasNext()) {
            System.out.println("Ite " + namesIte.next());
        }
        System.out.println("-".repeat(10));

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);
        numberList.add(2);

        System.out.println(numberList);
        System.out.println("-".repeat(10));

        Set<Integer> numberSet = new HashSet<>(numberList);

        System.out.println(numberSet);
        System.out.println("-".repeat(10));

        System.out.println(names.contains("Joan"));
        System.out.println(names.contains("Bob"));
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);
        System.out.println("-".repeat(10));

        Set<Integer> numberTreeSet = new TreeSet<>(numberList);
        System.out.println(numberTreeSet);

        // 
    }
}
