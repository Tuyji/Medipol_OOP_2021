package com.school.exceptions;

public class DummyErrorMessage {

    public static void main(String[] args) {

        try {
            int a = 42,  d = 0;

            double result = a / d;

            System.out.println("This will not be printed.");

        } catch (ArithmeticException e) {
            String errorMessage = e.getMessage();
            System.out.println(errorMessage);
        }

        System.out.println("After catch statement.");
    }


}
