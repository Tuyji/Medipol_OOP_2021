package com.school.exceptions;

public class DummyPrintStc {

    public static void main(String[] args) {

        try {
            int a = 42,  d = 0;

            double result = getResult(a, d);

            System.out.println("This will not be printed.");

        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
            e.printStackTrace();
        }

        System.out.println("After catch statement.");
    }

    public static double getResult(int a, int d) {
        double result = a / d;

        return result;
    }


}
