package loops;

public class ForLoop {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("i = " + i);
        System.out.println("i = " + (i + 1));
        System.out.println("i = " + (i + 2));
        System.out.println("i = " + (i + 3));
        System.out.println("i = " + (i + 4));
        System.out.println("i = " + (i + 5));
        System.out.println("i = " + (i + 6));
        System.out.println("i = " + (i + 7));
        System.out.println("i = " + (i + 8));
        System.out.println("i = " + (i + 9));
        System.out.println("i = " + (i + 10));


        for(int j = 0; j <= 10; j++) {
            System.out.println("j = " + j);

            if(i == 5)
                break;
        }

    }

}
