package com.mk.streams.student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentEngamentSystem {
    public static void main(String[] args) {
        Course pymc = new Course("Pymc", "Pymc Programming");
        Course jmc = new Course("Jmc", "Java Programming");
        Course jsmc = new Course("jsmc", "Java Programming");

//        Student mk = new Student(
//                "IN", 2019, 30, "M", true, jmc, pymc
//        );
//        System.out.println(mk);
//        mk.watchLecture("Jmc", 10, 5, 2019);
//        mk.watchLecture("Pymc", 7, 7, 2020);
//        System.out.println(mk);

        Stream.generate(() -> Student.getRandomStudent(jmc, pymc, jsmc))
                .limit(10)
                .forEach(System.out::println);

        Student[] students = new Student[1000];
        Arrays.setAll(students, i -> Student.getRandomStudent(jmc, pymc, jsmc));

//        var maleStudents = Stream.generate(
//                () -> Student.getRandomStudent(jmc, pymc, jsmc))
//                .limit(1000);
//
//        maleStudents = maleStudents.filter(s -> s.getGender().equals("M"));

        var maleStudents = Arrays.stream(students)
                .filter(student -> student.getGender().equals("M"));

        System.out.println("# of male students " + maleStudents.count());

        for (String gender : List.of("M", "F")) {
            var myStudents = Arrays.stream(students)
                    .filter(student -> student.getGender().equals(gender));

            System.out.println("# of " + gender + " students " + myStudents.count());
        }

        List<Predicate<Student>> list = List.of(
                (s) -> s.getAge() < 10,
                (Student s) -> s.getAge() >= 20 && s.getAge() <= 60
        );

        long total = 0;
        for (int i = 0; i < list.size(); i++) {
            var mystudents = Arrays.stream(students).filter(list.get(i));
            long cnt = mystudents.count();
            total += cnt;
            System.out.printf(
                    "# of students (%s) - %d%n",
                    i == 0 ? " <30" : ">= 30 && < 60", cnt);
        }
        System.out.println(
                "# for students >= 60 = " + (students.length - total)
        );
    }
}
