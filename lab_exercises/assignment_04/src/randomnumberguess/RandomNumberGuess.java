package randomnumberguess;

import java.util.Scanner;

public class RandomNumberGuess {


    public static void guessingNumberGame() {


        // Double //  0 - 1 arasında değer
        double random = Math.random();


        // 0 - 100 int değer
        int number = (int) (100 * random);


        // Deneme sayısı
        int K = 10;


        int i, guess;


        System.out.println("1 ve 100 arasinda bir sayi uretilmistir ve bu sayiyi 10 denemede bulalim");


         //            i = 0 ,1 ,2 ,3 ,4, 5, 6, 7, 8, 9, 10
        // deneme sayısı = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11


        // Scanner get guess number
        Scanner sc = new Scanner(System.in);



        for(i = 1; i <= K; i++) {

            System.out.println("Guess the number:");

            guess = sc.nextInt();

            if(number == guess) {
                System.out.println("Tebrikler ! Numarayi dogru tahmin ettiniz." + "Guess Number is : " + guess);
                System.out.println("Deneme sayisi: " + (i + 1));
                break;
            }
            else if(number > guess && ( i != K)) {
                System.out.println("Tahmin edilen sayi random sayidan kucuktur, tahmininizi artirin. Guess is:  " + guess);
            } else if(number < guess && ( i != K)) {
                System.out.println("Tahmin edilen sayi random sayidan buyuktur, tahmininizi azaltin. Guess is:  " + guess);
            } else if(i == K) {
                System.out.println("Max deneme sayisina ulastiniz: Number is: " + number);
                break;
            }

        }


    }

    // Driver Code
    public static void main(String arg[])
    {
        // Function Call
        guessingNumberGame();
    }

}
