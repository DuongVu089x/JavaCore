package com.dav.javacore.java.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputStreamDemo {

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream fis = null;
        ByteArrayOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            byte[] bytes = "Hello World !".getBytes();

            fis = new ByteArrayInputStream(bytes);

            int size = fis.available();
            byte[] data = new byte[size];

            fis.read(data, 0, data.length);

            bos = new ByteArrayOutputStream();

            fos = new FileOutputStream(new File("src/main/resources/io/outputByteStream.txt").getAbsolutePath());

            bos.write(data, 0, data.length);
            bos.writeTo(fos);
            bos.close();

        } catch (Exception e) {

            System.out.println("Lỗi đọc/ghi luồng dữ liệu !");
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (bos != null) {
                bos.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
