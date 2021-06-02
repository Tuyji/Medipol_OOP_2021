package com.school.exceptions;

public class MultipleCatchBlock {

    public static void main(String args[]) {

        int a = 10, b = 2;
        int vals[] = { 1, 2, 3 };

        try {
            int result = a / b; // generate an ArithmeticException

            vals[10] = 19; // generate an ArrayIndexOutOfBoundsException

        // This catch clause catches both exceptions.
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught: " + ex);
            ex.printStackTrace();
        }

        System.out.println("After multi-catch.");
    }
}
