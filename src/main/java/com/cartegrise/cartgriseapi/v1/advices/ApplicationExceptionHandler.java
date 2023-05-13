package com.cartegrise.cartgriseapi.v1.advices;

import java.util.stream.Collectors;

import org.springframework.data.rest.core.RepositoryConstraintViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;




@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{

    // Hadling request validation exceptions
    @ExceptionHandler({ RepositoryConstraintViolationException.class })
    public ResponseEntity<Object> handleAccessDeniedException(
      Exception ex, WebRequest request) {
          RepositoryConstraintViolationException nevEx = 
            (RepositoryConstraintViolationException) ex;

        //   String errors = nevEx.getErrors().getAllErrors().stream()
        //     .map(p -> p.toString()).collect(Collectors.joining("\n"));
          
          return new ResponseEntity<Object>(nevEx.getErrors().getAllErrors(), new HttpHeaders(),
            HttpStatus.BAD_REQUEST);
    }

}
