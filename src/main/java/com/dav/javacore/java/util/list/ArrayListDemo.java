package com.dav.javacore.java.util.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> demo = new ArrayList<String>();

        // Add char from "A" to "Z" in ASCII
        for (int i = 65; i < 91; i++) {
            demo.add(Character.toString((char) i));
        }

        // Print char
        demo.forEach(string -> {
            System.out.println(string);
        });

        demo.remove(2);
        demo.remove("B");

        // Print char in arrayList after remove element
        System.out.println("============");
        demo.forEach(string -> {
            System.out.println(string);
        });
    }
}
