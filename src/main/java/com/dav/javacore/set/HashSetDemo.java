package com.dav.javacore.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create hash set
        Set<String> hs = new HashSet<String>();
        // Add new element to HashSet
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("M");
        hs.add("I");
        hs.add("L");
        hs.add("Q");
        hs.add("P");
        // Add double element with value is "F" but only one value received
        hs.add("F");
        hs.add("F");

        System.out.println(hs);

        hs.remove("F");

        System.out.println(hs);
    }
}
