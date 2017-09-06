package com.dav.javacore.java.io.datastream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int cityIdA = 1;
        String cityNameA = "Green Lake City";
        int cityPopulationA = 500000;
        float cityTempA = 15.50f;

        int cityIdB = 2;
        String cityNameB = "Salt Lake City";
        int cityPopulationB = 250000;
        float cityTempB = 10.45f;

        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream(new File("src/main/resources/io/dataStreamDemo.txt").getAbsolutePath());
            dos = new DataOutputStream(fos);

            dos.writeInt(cityIdA);
            dos.writeUTF(cityNameA);
            dos.writeInt(cityPopulationA);
            dos.writeFloat(cityTempA);

            dos.writeInt(cityIdB);
            dos.writeUTF(cityNameB);
            dos.writeInt(cityPopulationB);
            dos.writeFloat(cityTempB);

            dos.flush();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
            if (dos != null) {
                dos.close();
            }

        }

    }
}
