package com.dav.javacore.java.util.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Create TreeSet
        Set<String> ts = new TreeSet<String>();
        // Add element to TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        //Print out element
        System.out.println(ts);
    }
}
