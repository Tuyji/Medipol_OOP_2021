package arrays;

public class ArraysExample {

    public static void main(String[] args) {


        // Tanımlama şekil 1
        int[] a = new int[5];

        // a -->    [] [] [] [] []


        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;


        // Tanımlama şekil 1
        int[] a2 = {0, 1, 2, 3, 4};



        for (int j = 0; j < a2.length; j++)
            System.out.println(a2[j]);


        // a -->   [0] [1] [2] [3] [4]




        //for (int j = 0; j < a.length; j++)
          //  System.out.println(a[j]);


        a[3] = 35;


        //for (int j = 0; j < a.length; j++)
          //  System.out.println(a[j]);


        double[] db = new double[4];



        String[] s = new String[3];
        int uzunluk = s.length;

        s[0] = "A";
        s[1] = "B";
        s[2] = "C";


        String[] s2 = {"A", "B", "C"};



        System.out.println("S dizisinin çıktısı: ");
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println("S2 dizisinin çıktısı: ");
        for(int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }



    }
}