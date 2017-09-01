package com.dav.javacore.list;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        // Create linked list
        LinkedList<String> ll = new LinkedList<String>();
        // Add element in linked list
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Noi dung ban dau cua LinkedList: " + ll);

        // Delete element in linked list
        ll.remove("F");
        ll.remove(2);
        System.out.println("Noi dung cua LinkedList sau khi xoa: " + ll);

        // Delete first element and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("LinkedList sau khi xoa phan tu dau tien va cuoi cung: " + ll);

        // Get element and reset value for it
        Object val = ll.get(2);
        ll.set(2, (String) val + " Dathaydoi");
        System.out.println("LinkedList sau khi thay doi: " + ll);
    }

}
