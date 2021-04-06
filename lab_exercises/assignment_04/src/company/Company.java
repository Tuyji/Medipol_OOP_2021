package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Company {


	public static void main(String[] args) {


		System.out.println("Maliyet Tutarini Giriniz: ");


		List<Integer> intList = new ArrayList<>();


		Scanner cost = new Scanner(System.in);


		int costPrice = cost.nextInt();

		System.out.println("Satis Tutarini Giriniz: ");


		Scanner sell = new Scanner(System.in);


		int sellingPrice = sell.nextInt();

		if(sellingPrice > costPrice){
			System.out.println("Kar yaptiniz: " + (sellingPrice - costPrice));
		} else{
			System.out.println("Zarar yaptiniz: " + (costPrice - sellingPrice));
		}

	}


}
