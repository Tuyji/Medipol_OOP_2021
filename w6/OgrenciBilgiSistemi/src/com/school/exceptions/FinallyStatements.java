package com.school.exceptions;

public class FinallyStatements {


    public static void main(String[] args) throws MyException {

        try {
            MyExceptionTest.compute(14);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        } finally {
            System.out.println("Finally Block: ");
        }
    }



}
