
package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

public class MultiplesOfThree extends VerificationStrategy {
    @Override
    public String verifyIfMultipleOrContains(FizzBuzz fizzBuzz) {
        try {
            if (fizzBuzz.getNumber() % 3 == 0) {
                return "Fizz";
            }
        } catch (IllegalArgumentException e) {
            System.out.println("O valor passado não é múltiplo de três");
        }
        return null;
    }
}
