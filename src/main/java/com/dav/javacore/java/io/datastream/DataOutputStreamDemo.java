package com.dav.javacore.java.io.datastream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        DataInputStream dis = null;
        try {

            fis = new FileInputStream(new File("src/main/resources/io/dataStreamDemo.txt").getAbsolutePath());

            dis = new DataInputStream(fis);

            int cityId1 = dis.readInt();
            System.out.println("Id: " + cityId1);
            String cityName1 = dis.readUTF();
            System.out.println("Name: " + cityName1);
            int cityPopulation1 = dis.readInt();
            System.out.println("Population: " + cityPopulation1);
            float cityTemperature1 = dis.readFloat();
            System.out.println("Temperature: " + cityTemperature1);

            int cityId2 = dis.readInt();
            System.out.println("Id: " + cityId2);
            String cityName2 = dis.readUTF();
            System.out.println("Name: " + cityName2);
            int cityPopulation2 = dis.readInt();
            System.out.println("Population: " + cityPopulation2);
            float cityTemperature2 = dis.readFloat();
            System.out.println("Temperature: " + cityTemperature2);

            dis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (dis != null) {
                dis.close();
            }
        }

    }
}
