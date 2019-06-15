package com.github.sashabogush.restcalculator.controller;

import com.github.sashabogush.restcalculator.dto.RequestContainer;
import com.github.sashabogush.restcalculator.dto.ResponseContainer;
import com.github.sashabogush.restcalculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(value = "/plus", method = RequestMethod.POST)
    public ResponseEntity<ResponseContainer> plus(@RequestBody RequestContainer requestContainer){
        final double result = calculatorService.plus(
                requestContainer.getFirstElement(),
                requestContainer.getSecondElement());

        return new ResponseEntity<>(new ResponseContainer(result), HttpStatus.OK);
    }

}
