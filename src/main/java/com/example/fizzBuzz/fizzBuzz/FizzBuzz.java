package com.example.fizzBuzz.fizzBuzz;

import com.example.fizzBuzz.VerificationStrategy;

import java.util.List;

public class FizzBuzz {
    private List<VerificationStrategy> strategies;

    public FizzBuzz(List<VerificationStrategy> strategies) {
        this.strategies = strategies;
    }
    public String verifyFizzBuzz(int number) {
        try {
            for (VerificationStrategy strategy : strategies) {
                if (strategy.isStrategy(number)) {
                    return strategy.processStrategy(number);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        return "Não foi possível realizar a verificação";
    }
}
