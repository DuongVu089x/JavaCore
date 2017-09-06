package com.dav.javacore.java.util.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Capacity start is 3 and incr is 2
        Vector<Number> v = new Vector<Number>(3, 2);
        System.out.println("Size ban dau: " + v.size());
        System.out.println("Capacity ban dau: " + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity sau 4 lan cong la: " + v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Capacity hien tai: " + v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Capacity hien tai: " + v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Capacity hien tai: " + v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("Phan tu dau tien: " + (Integer) v.firstElement());
        System.out.println("Phan tu cuoi cung: " + (Integer) v.lastElement());
        if (v.contains(new Integer(3))) System.out.println("Vector chua 3.");

        // Print element in vector.
        Enumeration<Number> vEnum = v.elements();
        System.out.println("\nCac phan tu trong Vector:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
