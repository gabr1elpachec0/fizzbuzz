package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class ContainsThreeAndFiveAndMultipleOfFive implements VerificationStrategy {
    private final String fizz = "3";
    private final String buzz = "5";

    @Override
    public boolean isStrategy(int number) {
        return (fizzBuzzContainsFizzAndBuzz(number) && number % 5 == 0);
    }

    @Override
    public String processStrategy(int number) {
        return "FizzBuzzBuzz";
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
