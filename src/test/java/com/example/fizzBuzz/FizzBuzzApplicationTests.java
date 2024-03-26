package com.example.fizzBuzz;

import com.example.fizzBuzz.fizzBuzz.FizzBuzz;
import com.example.fizzBuzz.fizzBuzz.MultipleOfFive;
import com.example.fizzBuzz.fizzBuzz.MultipleOfThree;
import com.example.fizzBuzz.fizzBuzz.MultipleOfThreeAndFive;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void multipleOfThree() {
		MultipleOfThree multipleOfThree = new MultipleOfThree();
		FizzBuzz fizzBuzz = new FizzBuzz(3, multipleOfThree);
		assertEquals("Fizz", multipleOfThree.verifyNumber(fizzBuzz));
	}

	@Test
	void multipleOfFive() {
		MultipleOfFive multipleOfFive = new MultipleOfFive();
		FizzBuzz fizzBuzz = new FizzBuzz(5, multipleOfFive);
		assertEquals("Buzz", multipleOfFive.verifyNumber(fizzBuzz));
	}

	@Test
	void multipleOfThreeAndFive() {
		MultipleOfThreeAndFive multipleOfThreeAndFive = new MultipleOfThreeAndFive();
		FizzBuzz fizzBuzz = new FizzBuzz(30, multipleOfThreeAndFive);
		assertEquals("FizzBuzz", multipleOfThreeAndFive.verifyNumber(fizzBuzz));
	}
}
