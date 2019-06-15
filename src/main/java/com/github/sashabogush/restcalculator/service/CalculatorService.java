package com.github.sashabogush.restcalculator.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    double plus(double firstElement, double secondElement);
    double minus(double firstElement, double secondElement);
    double multiply(double firstElement, double secondElement);
    double divide(double firstElement, double secondElement);
}
