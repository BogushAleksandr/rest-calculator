package com.github.sashabogush.restcalculator.dto;

public class ResponseContainer {

    private double result;

    public ResponseContainer(){}

    public ResponseContainer(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
