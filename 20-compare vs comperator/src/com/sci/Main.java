package com.sci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> pList = new ArrayList<>();
        Collections.addAll(pList, new Person(1, "Aung Aung", 3500, 23),
                new Person(2, "Kyaw Kyaw", 2500, 20),
                new Person(3, "Zaw Zaw", 1500, 10),
                new Person(4, "Phyo Aung", 4000, 22),
                new Person(5, "Mg Mg", 500, 24));

        
        Collections.sort(pList);
        System.out.println("Sorted by name:");
        System.out.println(pList);

       
        Comparator<Person> sort1 = new SortPerson.SortByName();
        pList.sort(sort1);
        System.out.println("Sorted by name:");
        pList.forEach(System.out::println);
        System.out.println();

        
        Comparator<Person> sort2 = new SortPerson().new SortBySalary();//create object to inner class
        pList.sort(sort2);
        System.out.println("Sorted by salary:");
        pList.forEach(a->System.out.println(a+"\n"));// using Lambda
        System.out.println();
    }
}
