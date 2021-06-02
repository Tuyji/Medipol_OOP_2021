package com.school.exceptions;

public class DummyTryCatch {

    public static void main(String[] args) {

        try {
            int a = 42,  d = 0;

            double result = a / d;

            System.out.println("This will not be printed.");

        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }

        System.out.println("After catch statement.");


    }


}
