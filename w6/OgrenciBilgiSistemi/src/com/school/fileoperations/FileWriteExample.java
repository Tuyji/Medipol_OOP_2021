package com.school.fileoperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {

    public static void main(String[] args) {

        File f = new File("C:\\medipol\\test.txt");
        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream(f);

            String yazi = "Yazı yazılacak";

            fos.write(yazi.getBytes());
            fos.flush();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
