package com.school.fileoperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\medipol\\test.txt");  // Dosya nesnesi

        if(!f.exists()){		//Dosya zaten var mı
            f.createNewFile(); //Dosyayı oluştur
        }


    }
}
