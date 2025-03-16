package com.mk.nestedclasses;

import com.mk.nestedclasses.domain.Employee;
import com.mk.nestedclasses.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1001, "John", 2015),
                new Employee(1009, "Doe", 2011),
                new Employee(1022, "Jane", 2014),
                new Employee(1102, "Kane", 2018),
                new Employee(1202, "Dimitri", 2011)));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (Employee e: employees) {
            System.out.println(e);
        }

        System.out.println("Store Members");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Ajay", 2019, "Target"),
                new StoreEmployee(10021, "Arun", 2016, "JBL"),
                new StoreEmployee(10071, "Praba", 2016, "Samsung"),
                new StoreEmployee(10018, "Sri", 2016, "Airlines"),
                new StoreEmployee(10019, "Riya", 2020, "Apple")
        ));

//        var genericEmployee = new StoreEmployee();
        var comparator =  new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee se: storeEmployees) {
            System.out.println(se);
        }
    }

}
