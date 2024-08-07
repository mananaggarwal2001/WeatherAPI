package com.mananluvtocode.weatherAPI.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(RuntimeException e, Model themodel) {
        e.printStackTrace();
        themodel.addAttribute("country", e.getMessage());
        return "notfound";
    }
}
