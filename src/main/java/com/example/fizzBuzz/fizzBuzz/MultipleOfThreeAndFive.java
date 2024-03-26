package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class MultipleOfThreeAndFive implements VerificationStrategy {
    @Override
    public String verifyNumber(FizzBuzz fizzBuzz) {
        try {
            if (fizzBuzz.getNumber() % 3 == 0 && fizzBuzz.getNumber() % 5 == 0) {
                return "FizzBuzz";
            }
        } catch (IllegalArgumentException e) {
            System.out.println("O valor passado não é múltiplo de três nem de cinco");
        }
        return null;
    }
}
