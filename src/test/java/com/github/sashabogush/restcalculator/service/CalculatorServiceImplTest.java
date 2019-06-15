package com.github.sashabogush.restcalculator.service;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorServiceImplTest {

    private CalculatorServiceImpl calculatorServiceImpl;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setup() {
        this.calculatorServiceImpl = new CalculatorServiceImpl();
    }

    @Test
    public void plusShouldReturnCorrectValue() {
        double actual = calculatorServiceImpl.plus(2, 1);
        assertThat(actual).isEqualTo(3);
    }

    @Test
    public void minusShouldReturnCorrectValue() {
        double actual = calculatorServiceImpl.minus(2, 1);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void multiplyShouldReturnCorrectValue() {
        double actual = calculatorServiceImpl.multiply(2, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void divideShouldReturnCorrectValue() {
        double actual = calculatorServiceImpl.divide(2, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void divideShouldThrowIllegalArgumentExceptionWhenSecondArgumentIsZero() {
        exception.expect(IllegalArgumentException.class);
        calculatorServiceImpl.divide(2, 0);
    }
}
