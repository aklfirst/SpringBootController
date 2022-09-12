package com.example.springbootcontroller.service;

import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {



    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiple(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return (double) a / b;
    }
}
