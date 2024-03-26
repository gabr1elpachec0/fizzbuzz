package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class FizzBuzz {
    private int number;
    private VerificationStrategy verificationStrategy;

    public FizzBuzz(int number, VerificationStrategy verificationStrategy) {
        this.number = number;
        this.verificationStrategy = verificationStrategy;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VerificationStrategy getVerificationStrategy() {
        return verificationStrategy;
    }

    public void setVerificationStrategy(VerificationStrategy verificationStrategy) {
        this.verificationStrategy = verificationStrategy;
    }
}
