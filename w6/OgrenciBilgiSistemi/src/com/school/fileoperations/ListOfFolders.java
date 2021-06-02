package com.school.fileoperations;

import java.io.File;

public class ListOfFolders {

    public static void main(String[] args) {

        File klasor = new File("C:/dummy");

        String dosyalar[] = klasor.list();

        for (int i = 0; i < dosyalar.length; i++) {
            System.out.println(dosyalar[i]);
        }

    }

}
