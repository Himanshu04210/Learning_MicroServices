package com.masai.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourcesNotFoundException.class)
    public ResponseEntity<?> ResourceNotFoundExceptionHandler(ResourcesNotFoundException re, WebRequest request) {
        MyErrorDetails myErrorDetails = MyErrorDetails.builder().details(request.getDescription(false)).message(re.getMessage()).timeStamp(LocalDateTime.now()).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(myErrorDetails);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> ResourceNotFoundExceptionHandler(Exception ex, WebRequest request) {
        MyErrorDetails myErrorDetails = MyErrorDetails.builder().details(request.getDescription(false)).message(ex.getMessage()).timeStamp(LocalDateTime.now()).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(myErrorDetails);
    }



}
