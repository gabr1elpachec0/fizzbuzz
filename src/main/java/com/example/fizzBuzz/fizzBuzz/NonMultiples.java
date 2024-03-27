package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class NonMultiples extends VerificationStrategy {
    @Override
    public int verifyIfNonMultipleOrContains(FizzBuzz fizzBuzz) {
        if (fizzBuzz.getNumber() % 3 != 0 && fizzBuzz.getNumber() % 5 != 0) {
            return fizzBuzz.getNumber();
        } else {
            return 0;
        }
    }
}
