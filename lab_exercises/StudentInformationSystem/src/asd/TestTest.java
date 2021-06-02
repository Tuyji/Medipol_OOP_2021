package asd;

import java.util.Arrays;
import java.util.Scanner;

public class TestTest {

    public static void main(String[] args) {
        int bos;
        int [] sayilar = new int[5];
        Scanner sca = new Scanner(System.in);

        for (int i =0; i<5; i++){
            System.out.println("Sayıların " + (i+1) + ".elemanını girinz.");
            sayilar[i] = sca.nextInt();
        }

        for (int i = 0; i<4; i++){
            for (int j =i+1; j<5; j++){

                if (sayilar[j]<sayilar[i]){
                    bos = sayilar[i];
                    sayilar[i]= sayilar[j];
                    sayilar[j] = bos;
                }
            }
        }
        for (int i =0; i <1 ;i++){
            System.out.println("("+sayilar[0] + ","+sayilar[1] + ","+sayilar[2] + ","+sayilar[3] + ","+sayilar[4]+")");

        }

    }


}
