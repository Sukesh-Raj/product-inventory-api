package com.spring.ProductInventory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(ProductNotFoundException exc) {

        ErrorResponse error = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),   // 404
                exc.getMessage(),               // custom message
                System.currentTimeMillis());    // timestamp

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(InvalidInputException exc)
    {
        ErrorResponse error = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exc.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
