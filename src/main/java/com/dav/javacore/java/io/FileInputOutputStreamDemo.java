package com.dav.javacore.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(new File("src/main/resources/io/inputStream.txt").getAbsolutePath());
            // Size of file
            int size = fis.available();

            byte[] data = new byte[size];

            fis.read(data, 0, data.length);

            fos = new FileOutputStream(new File("src/main/resources/io/outputStream.txt").getAbsolutePath());
            // Write array data to output
            fos.write(data, 0, data.length);

            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("Lỗi đọc/ghi tập tin !");
        } finally {
            if (fis != null) {
                // Close input stream
                fis.close();
            }
            if (fos != null) {
                // Close output stream
                fos.close();
            }
        }
    }

}
