package arrays;

import java.util.Arrays;

public class TwoDArray {


    public static void main(String[] args) {

        int[][] M = new int[5][2];

        for(int row = 0; row < 5; row ++) {
            for(int col = 0; col < 2; col ++)
                M[row][col] = row + col;
        }

        System.out.println(Arrays.deepToString(M));
    }
}


 // M[0][0] = 0;
// M[0][1] = 1;

