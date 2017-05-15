package com.datastructures.collections;

import java.util.ArrayList;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class APIArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("developer");
        arrayList.add("tester");
        arrayList.add("manager");
        for (String s : arrayList) {
            System.out.println(s);
        }

        // array list of objects

        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("hussein", 34);
        Employee e2 = new Employee("Mohamed", 19);

        employees.add(e1);
        employees.add(e2);
        for (Employee e : employees) {
            System.out.println("My name is " + e.getName() + " and am " + e.getAge() + " years old.");
        }
    }
}

