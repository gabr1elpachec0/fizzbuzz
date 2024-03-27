
package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class MultiplesOfFive implements VerificationStrategy {

    @Override
    public boolean isStrategy(int number) {
        return number % 5 == 0;
    }

    @Override
    public String processStrategy(int number) {
        return "Buzz";
    }
}
