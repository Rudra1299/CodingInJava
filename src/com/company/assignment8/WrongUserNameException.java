package com.company.assignment8;

public class WrongUserNameException extends Exception{
    public WrongUserNameException(String errorMessage) {
        super(errorMessage);
    }
}
