package com.dav.javacore.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

// TODO: Auto-generated Javadoc
/**
 * The Class IODemo.
 */
public class IODemo {

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void main(String[] args) throws IOException {
        readFileOffline();
        readFileOnline();
    }

    /**
     * Read file online.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static void readFileOnline() throws IOException {
        File directory = new File("");
        InputStream isYahoo = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            // Tạo đối tượng URL chỉ đến trang web yahoo
            URL yahoo = new URL("http://news.zing.vn");
            // Mở luồng dữ liệu vào từ nội dung trang chủ yahoo
            isYahoo = yahoo.openStream();
            // Tạo luồng buffer lưu giữ nội dung trang chủ yahoo
            bis = new BufferedInputStream(isYahoo);
            bos = new BufferedOutputStream(new FileOutputStream(directory.getAbsoluteFile() + "/src/main/resources/demoBuffer.txt"));
            // Đọc 100 KB cùng một lúc
            byte[] bytes = new byte[100 * 1024];
            int readNum;
            while ((readNum = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readNum);
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc dữ liệu !");
        } finally {
            // Đóng các luồng vào
            if (isYahoo != null) {
                isYahoo.close();
            }
            if (bis != null) {
                bis.close();
            }
            if (bos != null) {
                bis.close();
            }

        }

    }

    /**
     * Read file offline.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static void readFileOffline() throws IOException {
        File directory = new File("");
        File fileHeader = new File(directory.getAbsoluteFile() + "/src/main/resources/header.txt");
        InputStream inputStream = new FileInputStream(fileHeader);
        int size = inputStream.available();
        byte[] data = new byte[size];
        inputStream.read(data, 0, data.length);
        inputStream.close();
        OutputStream outputStream = new FileOutputStream(directory.getAbsolutePath() + "/src/main/resources/output.txt");
        outputStream.write(data, 0, data.length);
        outputStream.close();

    }
}
