package com.company.assignment8;

public class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String errorMessage) {
        super(errorMessage);
    }
}
