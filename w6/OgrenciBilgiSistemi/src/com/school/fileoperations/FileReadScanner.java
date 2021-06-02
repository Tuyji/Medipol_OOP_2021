package com.school.fileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadScanner {


    public static void main (String[] args) throws IOException, FileNotFoundException {


        try {
            File f = new File("C:\\medipol\\test.txt");
            Scanner s = new Scanner(f);

            while(s.hasNext()){
                String satir = s.nextLine();
                System.out.println(satir);
            }
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
