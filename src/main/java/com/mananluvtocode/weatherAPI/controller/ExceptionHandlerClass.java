package com.mananluvtocode.weatherAPI.controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(RuntimeException e) {
        e.printStackTrace();
        return "notfound";
    }
}
