package com.example.fizzBuzz;

import com.example.fizzBuzz.fizzBuzz.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzApplicationTests {
    @Test
    void multipleOfThree() {
        MultiplesOfThree multipleMultiplesOfThree = new MultiplesOfThree();
        FizzBuzz fizzBuzz = new FizzBuzz(3, multipleMultiplesOfThree);
        assertEquals("Fizz", multipleMultiplesOfThree.verifyIfMultipleOrContains(fizzBuzz));
    }

    @Test
    void multipleOfFive() {
        MultiplesOfFive multiplesOfFive = new MultiplesOfFive();
        FizzBuzz fizzBuzz = new FizzBuzz(5, multiplesOfFive);
        assertEquals("Buzz", multiplesOfFive.verifyIfMultipleOrContains(fizzBuzz));
    }

    @Test
    void multipleOfThreeAndFive() {
        MultiplesOfThreeAndFive multipleMultiplesOfThreeAndFive = new MultiplesOfThreeAndFive();
        FizzBuzz fizzBuzz = new FizzBuzz(30, multipleMultiplesOfThreeAndFive);
        assertEquals("FizzBuzz", multipleMultiplesOfThreeAndFive.verifyIfMultipleOrContains(fizzBuzz));
    }

    @Test
    void testNonMultipleValues() {
        NonMultiples nonMultiples = new NonMultiples();
        FizzBuzz fizzBuzz = new FizzBuzz(7, nonMultiples);
        assertEquals(7, nonMultiples.verifyIfNonMultipleOrContains(fizzBuzz));
    }
}
