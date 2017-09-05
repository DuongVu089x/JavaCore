package com.dav.javacore.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        // Create LinkedHashSet
        Set<String> hs = new LinkedHashSet<String>();
        // Add element to hs
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        // Print out value
        System.out.println(hs);
    }
}
