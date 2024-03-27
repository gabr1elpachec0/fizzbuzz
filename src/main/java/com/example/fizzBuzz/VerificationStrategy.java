package com.example.fizzBuzz;

import com.example.fizzBuzz.fizzBuzz.FizzBuzz;

public interface VerificationStrategy {
    boolean isStrategy(int number);
    String processStrategy(int number);
}
