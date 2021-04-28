package com.soulmate.soulmateapp.exceptionhandler;

public class UserDoesNotExistsException extends Exception{
    private String message;
    public UserDoesNotExistsException() {
    }

    public UserDoesNotExistsException(String message) {
        super();
        this.message=message;
    }
}
