package com.github.sashabogush.restcalculator.service;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setup() {
        this.calculatorService = new CalculatorService();
    }

    @Test
    public void plusShouldReturnCorrectValue() {
        double actual = calculatorService.plus(2, 1);
        assertThat(actual).isEqualTo(3);
    }

    @Test
    public void minusShouldReturnCorrectValue() {
        double actual = calculatorService.minus(2, 1);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void multiplyShouldReturnCorrectValue() {
        double actual = calculatorService.multiply(2, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void divideShouldReturnCorrectValue() {
        double actual = calculatorService.divide(2, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void divideShouldThrowIllegalArgumentExceptionWhenSecondArgumentIsZero() {
        exception.expect(IllegalArgumentException.class);
        calculatorService.divide(2, 0);
    }
}
