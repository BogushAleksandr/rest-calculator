package com.github.sashabogush.restcalculator.controller;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.github.sashabogush.restcalculator.dto.ErrorContainer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<ErrorContainer> handleError(WebRequest request, Throwable throwable) {
        String pattern = "(\\w{5,6}Element)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(throwable.getMessage());
        matcher.find();

        String message = "Invalid value of " + matcher.group(1);

        return new ResponseEntity<>(new ErrorContainer(message), HttpStatus.BAD_REQUEST);
    }
}
