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

    @ExceptionHandler( value = UserAlreadyExistsException.class)
    public ResponseEntity<String> userAlreadyExists (UserAlreadyExistsException userExists){
        return new ResponseEntity<String>("User already existing", HttpStatus.CONFLICT);
    }


}
