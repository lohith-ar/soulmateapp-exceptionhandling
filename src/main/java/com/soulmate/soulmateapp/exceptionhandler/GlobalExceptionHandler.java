package com.soulmate.soulmateapp.exceptionhandler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Value(value = "${data.exception.message1}")
    private String message1;

    @Value(value = "${data.exception.message2}")
    private String message2;

    @ExceptionHandler( value = UserAlreadyExistsException.class)
    public ResponseEntity<String> userAlreadyExists (){
        return new ResponseEntity<String>( message1, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = UserDoesNotExistsException.class)
    public ResponseEntity<String> userDoesnotExist(){
        return new ResponseEntity<String>(message2, HttpStatus.OK);
    }


}
