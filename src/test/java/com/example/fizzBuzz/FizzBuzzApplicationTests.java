package com.example.fizzBuzz;

import com.example.fizzBuzz.fizzBuzz.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzApplicationTests {
    List<VerificationStrategy> strategies;

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        strategies = List.of(
                new ContainsThreeAndFiveAndMultipleOfFive(),
                new ContainsThreeAndFive(),
                new MultiplesOfThreeAndFive(),
                new MultiplesOfThree(),
                new MultiplesOfFive(),
                new NonMultiples()
        );
        fizzBuzz = new FizzBuzz(strategies);
    }

    @Test
    void testPriorityCases() {
        assertEquals("Fizz", fizzBuzz.verifyFizzBuzz(9));
        assertEquals("Buzz", fizzBuzz.verifyFizzBuzz(10));
        assertEquals("FizzBuzz", fizzBuzz.verifyFizzBuzz(15));
        assertEquals("FizzBuzzBuzz", fizzBuzz.verifyFizzBuzz(35));
        assertEquals("1", fizzBuzz.verifyFizzBuzz(1));
        assertEquals("FizzBuzz", fizzBuzz.verifyFizzBuzz(53));
    }
}
