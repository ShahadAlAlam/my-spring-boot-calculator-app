package com.saa.calculator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CalculatorController {
    @GetMapping(value = "/home")
    public String getHome(String[] args) {
        return "Welcome to Calculation Home";
    }

    @PostMapping(value = "/add")
    public String getAdd(@RequestBody Map<String,Object> data) {
        try{
        return String.valueOf(Double.parseDouble(data.get("FirstNumber").toString()) +
        Double.parseDouble(data.get("SecondNumber").toString()));
        } catch (Exception e){
            return e.getMessage();
        }
    }

    @PutMapping(value = "/sub")
    public String getSub(@RequestParam(name="FirstNumber") Double firstNumber,@RequestParam(name="SecondNumber") Double secondNumber) {
        try{
        return String.valueOf(firstNumber-secondNumber);
        } catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping(value = "/mul")
    public String getMul(@RequestBody Map<String,Object> data) {
        try{
        return String.valueOf(Double.parseDouble(data.get("FirstNumber").toString()) *
                Double.parseDouble(data.get("SecondNumber").toString()));
        } catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping(value = "/div")
    public String getDiv(@RequestBody Map<String,Object> data) {
        try{
        return String.valueOf(Double.parseDouble(data.get("FirstNumber").toString()) /
                Double.parseDouble(data.get("SecondNumber").toString()) );
        } catch (Exception e){
            return e.getMessage();
        }

    }
}
