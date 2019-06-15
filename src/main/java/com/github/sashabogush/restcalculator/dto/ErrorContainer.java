package com.github.sashabogush.restcalculator.dto;

public class ErrorContainer {
    private String error;

    public ErrorContainer(){}

    public ErrorContainer(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
