package com.example.fizzBuzz.fizzBuzz;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String verifyNumber() {
        if ((number % 3 == 0 && number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return null;
    }

    public String toString(int number) {
        String value = Integer.toString(number);
        return value;
    }
}
