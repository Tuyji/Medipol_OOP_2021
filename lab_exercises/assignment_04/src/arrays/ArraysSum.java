package arrays;

import java.util.Scanner;

public class ArraysSum {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Dizinin eleman sayısını giriniz: ");

        int N = s.nextInt();


        int[] a = new int[N];

        int toplam = 0;

        System.out.println("Dizinin elemanlarını giriniz: ");

        for(int i = 0; i < N; i++ ) {

            a[i] = s.nextInt();

            toplam = toplam + a[i];

        }

        System.out.println("Toplam: " + toplam);



    }


}
