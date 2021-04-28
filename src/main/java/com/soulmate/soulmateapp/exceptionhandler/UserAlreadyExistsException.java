package com.soulmate.soulmateapp.exceptionhandler;

public class UserAlreadyExistsException extends Exception{

    private String message;

    public UserAlreadyExistsException() {
    }

    public UserAlreadyExistsException(String message) {
        super();
        this.message = message;
    }
}
