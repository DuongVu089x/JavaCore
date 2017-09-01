package com.dav.javacore.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        // Create HashMap
        Map<String, Double> hm = new HashMap<>();
        // Push element to HashMap
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        // Get collection entry
        Set<Entry<String, Double>> set = hm.entrySet();
        // Get iterator
        Iterator<Entry<String, Double>> i = set.iterator();

        // Print element
        while (i.hasNext()) {
            Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();
        // Update account of Balance
        double balance = ((Double) hm.get("Zara")).doubleValue();
        hm.put("Zara", new Double(balance + 1000));
        System.out.println("Balance hien tai cua Zara la: " + hm.get("Zara"));
    }
}
