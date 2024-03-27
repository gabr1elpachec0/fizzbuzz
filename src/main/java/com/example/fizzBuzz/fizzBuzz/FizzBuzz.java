package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class FizzBuzz {
    private int number;
    private VerificationStrategy strategy;

    public FizzBuzz(int number, VerificationStrategy strategy) {
        this.number = number;
        this.strategy = strategy;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
