package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class MultipleOfFive implements VerificationStrategy {
    @Override
    public String verifyNumber(FizzBuzz fizzBuzz) {
        try {
            if (fizzBuzz.getNumber() % 5 == 0) {
                return "Buzz";
            }
        } catch (IllegalArgumentException e) {
            System.out.println("O valor passado não é múltiplo de cinco");
        }
        return null;
    }
}
