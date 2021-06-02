package com.school.exceptions;

public class MyExceptionNew extends Exception {

    private String errorCode;

    public MyExceptionNew(String errorCode){
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
