package com.dav.javacore.java.string;

// TODO: Auto-generated Javadoc
/**
 * The Class StringBufferDemo.
 */
public class StringBufferDemo {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
        appendStringBuffer();
        insertStringBuffer();
        replaceStringBuffer();
        deleteStringBuffer();
    }

    /**
     * Delete string buffer.
     */
    private static void deleteStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);
    }

    /**
     * Replace string buffer.
     */
    private static void replaceStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }

    /**
     * Insert string.
     */
    private static void insertStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");
        System.out.println(sb);

    }

    /**
     * Append string.
     */
    private static void appendStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println(sb);
    }
}
