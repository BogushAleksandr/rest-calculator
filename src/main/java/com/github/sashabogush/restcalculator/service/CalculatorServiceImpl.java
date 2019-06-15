package com.github.sashabogush.restcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public double plus(double firstElement, double secondElement) {
        return firstElement + secondElement;
    }

    public double minus(double firstElement, double secondElement){
        return firstElement - secondElement;
    }

    public double multiply(double firstElement, double secondElement){
        return firstElement * secondElement;
    }

    public double divide(double firstElement, double secondElement){
        if(secondElement == 0){
            throw new IllegalArgumentException("second element cannot be 0 :)");
        }
        return firstElement / secondElement;
    }
}
