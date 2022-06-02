package com.arithmeticOperations.controller;

import com.arithmeticOperations.services.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arithmetic")
public class ArithmeticController {

    @Autowired
    private ArithmeticService arithmeticService;

    @GetMapping("/sum/{number1}/{number2}")
    public float getSum(@PathVariable("number1") float number1, @PathVariable("number2") float number2) {
        return arithmeticService.add(number1, number2);
    }

    @GetMapping("/subtract/{number1}/{number2}")
    public float getDifference(@PathVariable("number1") float number1, @PathVariable("number2") float number2) {
        return arithmeticService.subtract(number1, number2);
    }

    @GetMapping("/multiply/{number1}/{number2}")
    public float getMultiplication(@PathVariable("number1") float number1, @PathVariable("number2") float number2) {
        return arithmeticService.multiply(number1, number2);
    }

    @GetMapping("/divide/{number1}/{number2}")
    public float getDivision(@PathVariable("number1") float number1, @PathVariable("number2") float number2) {
        return arithmeticService.divide(number1, number2);
    }
}

