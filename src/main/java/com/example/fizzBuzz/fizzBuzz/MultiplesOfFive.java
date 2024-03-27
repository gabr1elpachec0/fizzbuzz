
package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class MultiplesOfFive extends VerificationStrategy {
    @Override
    public String verifyIfMultipleOrContains(FizzBuzz fizzBuzz) {
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
