package com.school.exceptions;

public class MyExceptionTest {


    public static void main(String[] args) throws MyException {

        compute(4);

        try {
             compute(14);
        } catch (MyException e) {
            System.out.println("Caught " + e);

        }


    }


    static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");

        if (a > 10)
            throw new MyException(a);

        System.out.println("Normal exit");
    }

}
