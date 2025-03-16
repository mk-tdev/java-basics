package com.mk.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class CompareTo {
    public static void main(String[] args) {
//        PrimitiveCompare();

        NonPrimitiveCompare();
    }

    public static void PrimitiveCompare() {
        Integer five = 5;
        Integer[] others = {5, 10, 50, -50, 1, 9};

        for (Integer i: others) {
            int val = five.compareTo(i);

            System.out.printf("%d %s %d: compareTo= %d%n", five, (val == 0) ? "==" : (val < 0) ? "<" : ">", i, val);
        }

        System.out.println("-".repeat(30));
        String banana = "banana";
        String[] fruits = {"amla","apple", "banana", "pear", "lemon", "BANANA", "kiwi"};

        for(String f: fruits) {
            int val = banana.compareTo(f);

            System.out.println(f + "-->  " + val);
        }

        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        System.out.println("A:"+(int)'A' + "a:"+(int)'a');
        System.out.println("B:"+(int)'B');
        System.out.println("C:"+(int)'C');

        System.out.println("-".repeat(35));
    }

    public static void NonPrimitiveCompare() {
        Student riya = new Student("Riya");
        Student[] students = {
                new Student("Sri"),
                new Student("Mk"),
                new Student("Arun"),
                new Student("Riya"),
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());

        System.out.println("result = " + riya.compareTo(new Student("Vani")));

        for (Student s: students) {
            System.out.println(s);
        }
    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student>{
    private static int LAST_ID = 1000;
    private static Random random = new Random();
    private int id;
    protected double gpa;
    String name;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
//        return name.compareTo(o.name);
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
