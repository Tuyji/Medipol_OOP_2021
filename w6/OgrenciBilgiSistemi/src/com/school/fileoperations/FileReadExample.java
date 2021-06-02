package com.school.fileoperations;

import com.school.util.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadExample {

    public static void main(String args[]){
        File file = new File("C:\\Users\\90505\\Desktop\\Medipol_OOP_2020-master\\Medipol_OOP_2020-master\\6- Exceptions and File IO\\OgrenciBilgiSistemi\\src\\com\\school\\ogrenciler.csv");



        String icerik = readFile(file);
        System.out.println(icerik);
    }

    public static String readFile(File file) {
        String line="";
        String icerik="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null)
                icerik += "\\n" + line;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return icerik;
    }
}
