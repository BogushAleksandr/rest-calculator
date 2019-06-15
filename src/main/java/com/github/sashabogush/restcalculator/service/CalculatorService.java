package com.github.sashabogush.restcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    double plus(double firstElement, double secondElement) {
        return firstElement + secondElement;
    }

    double minus(double firstElement, double secondElement){
        return firstElement - secondElement;
    }

    double multiply(double firstElement, double secondElement){
        return firstElement * secondElement;
    }

    double divide(double firstElement, double secondElement){
        if(secondElement == 0){
            throw new IllegalArgumentException("second element cannot be 0 :)");
        }
        return firstElement / secondElement;
    }
}
