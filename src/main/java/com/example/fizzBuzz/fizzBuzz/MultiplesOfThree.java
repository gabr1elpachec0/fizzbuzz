
package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class MultiplesOfThree implements VerificationStrategy {


    @Override
    public boolean isStrategy(int number) {
        return number % 3 == 0;
    }

    @Override
    public String processStrategy(int number) {
        return "Fizz";
    }
}
