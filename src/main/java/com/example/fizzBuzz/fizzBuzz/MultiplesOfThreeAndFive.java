package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class MultiplesOfThreeAndFive implements VerificationStrategy {

    @Override
    public boolean isStrategy(int number) {
        return (number % 3 == 0) && (number % 5 == 0);
    }

    @Override
    public String processStrategy(int number) {
        return "FizzBuzz";
    }
}