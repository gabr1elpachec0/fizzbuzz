package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class ContainsThreeAndFive implements VerificationStrategy {
    private final String fizz = "3";
    private final String buzz = "5";

    @Override
    public boolean isStrategy(int number) {
        return fizzBuzzContainsFizzAndBuzz(number);
    }

    @Override
    public String processStrategy(int number) {
        return "FizzBuzz";
    }

    private boolean fizzBuzzContainsFizzAndBuzz(int number) {
        return fizzBuzzContainsFizz(number) && fizzBuzzContainsBuzz(number);
    }

    private boolean fizzBuzzContainsFizz(int number) {
        return String.valueOf(number).contains(fizz);
    }

    private boolean fizzBuzzContainsBuzz(int number) {
        return String.valueOf(number).contains(buzz);
    }
}
