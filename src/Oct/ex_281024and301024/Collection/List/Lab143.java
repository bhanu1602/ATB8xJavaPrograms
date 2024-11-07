package Oct.ex_281024and301024.Collection.List;

import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab143 {

    // Iterating over List Interface in Java
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Priscilla");
        list.add("Mary");

        // 1. Using traditional for loop with index
        System.out.println("Using for loop with index:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        // 2. Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        // 3. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        // 4. Using forEach() method with Lambda expression (Java 8+)
        System.out.println("Using forEach with Lambda:");
        list.forEach(s -> System.out.println(s));

        System.out.println();

        // 5. Using ListIterator (allows bidirectional traversal)
        System.out.println("Using ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}

