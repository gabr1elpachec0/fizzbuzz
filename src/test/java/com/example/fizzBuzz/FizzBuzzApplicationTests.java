package com.example.fizzBuzz;

import com.example.fizzBuzz.fizzBuzz.FizzBuzz;
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
		FizzBuzz fizzBuzz = new FizzBuzz(3);
		assertEquals("Fizz", fizzBuzz.verifyNumber());
	}

	@Test
	void multipleOfFive() {
		FizzBuzz fizzBuzz = new FizzBuzz(5);
		assertEquals("Buzz", fizzBuzz.verifyNumber());
	}

	@Test
	void multipleOfThreeAndFive() {
		FizzBuzz fizzBuzz = new FizzBuzz(53);
		assertEquals("FizzBuzz", fizzBuzz.verifyNumber());
	}
}
