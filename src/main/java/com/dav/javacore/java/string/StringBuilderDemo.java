package com.dav.javacore.java.string;

// TODO: Auto-generated Javadoc
/**
 * The Class StringBuilderDemo.
 */
public class StringBuilderDemo {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        appendStringBuilder();
        insertStringBuilder();
        replaceStringBuilder();
        deleteStringBuilder();
    }

    /**
     * Delete string builder.
     */
    private static void deleteStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(1, 3);
        System.out.println(sb);
    }

    /**
     * Insert string builder.
     */
    private static void insertStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.insert(1, "Java");
        System.out.println(sb);
    }

    /**
     * Replace string builder.
     */
    private static void replaceStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }

    /**
     * Append string builder.
     */
    private static void appendStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);
    }
}
