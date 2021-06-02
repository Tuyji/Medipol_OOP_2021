package com.school;

import com.school.util.FileUtil;

import java.io.File;


public class Main {
	public static void main(String args[]){
		File file = new File("C:\\Users\\90505\\Desktop\\Medipol_OOP_2020-master\\Medipol_OOP_2020-master\\6- Exceptions and File IO\\OgrenciBilgiSistemi\\src\\com\\school\\ogrenciler.csv");
		String icerik = FileUtil.readFile(file);
		System.out.println(icerik);
	}
}
