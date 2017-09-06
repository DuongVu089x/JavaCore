package com.dav.javacore.java.io.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class SerializableDemo.
 */
public class SerializableDemo {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {

        saveObjectToFile();
        getObjectFromFile();
    }

    /**
     * Gets the object from file.
     *
     * @return the object from file
     */
    private static void getObjectFromFile() {
        StudentPOJO student = null;

        try {
            FileInputStream fos = new FileInputStream(new File("src/main/resources/io/serializableDemo.txt").getAbsolutePath());
            ObjectInputStream oos = new ObjectInputStream(fos);
            student = (StudentPOJO) oos.readObject();
            oos.close();
            fos.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.err.println(student.getName());
        System.err.println(student.getAge());

    }


    /**
     * Save object to file.
     */
    private static void saveObjectToFile() {
        // Tạo đối tượng Student trước
        StudentPOJO student = new StudentPOJO();
        student.setName("Vu");
        student.setAge(21);

        try {
            // Dùng FileOutputStream để lưu vào một tập tin bất kỳ
            FileOutputStream fos = new FileOutputStream(new File("src/main/resources/io/serializableDemo.txt").getAbsolutePath());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

}
