package com.example.springbootcontroller.controller;

import com.example.springbootcontroller.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator")

public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping()

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")

    public String plus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {
        if (a == 0 || b == 0) return "Один или оба входных параметров не должны быть равны нулю!";
        int plus = calculatorService.plus(a, b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping("/minus")

    public String minus(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b) {
        if (a == 0 || b == 0) return "Один или оба входных параметров не должны быть равны нулю!";
        int minus = calculatorService.minus(a, b);
        return a + " - " + b + " = " + minus;
    }

    @GetMapping("/multiple")

    public String multiple(@RequestParam(name = "num1") Integer a,
                           @RequestParam(name = "num2") Integer b) {
        if (a == 0 || b == 0) return "Один или оба входных параметров не должны быть равны нулю!";
        int multiple = calculatorService.multiple(a, b);
        return a + " * " + b + " = " + multiple;
    }

    @GetMapping("/divide")

    public String divide(@RequestParam(name = "num1") Integer a,
                         @RequestParam(name = "num2") Integer b) {
        if (a == 0 || b == 0) return "Один или оба входных параметров не должны быть равны нулю!";
        double divide;

        try {
            divide = calculatorService.divide(a, b);
        } catch (Throwable e) {
            return e.getMessage();
        }

        return a + " / " + b + " = " + divide;
    }

}
