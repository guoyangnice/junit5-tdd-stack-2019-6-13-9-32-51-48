package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {
	@Test
	public void should_return_1_when_FizzBuzz_given_1() {
		int number = 1;
		//given
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		//when
		String word = fizzBuzzGame.getWords(number);
		//then
		Assertions.assertEquals("1", word);
	}
	
	@Test
	public void should_return_fizzBuzz_when_3_given_number() {
		int number = 3;
		//given
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		//when
		String word = fizzBuzzGame.getWords(number);
		//then
		Assertions.assertEquals("fizz", word);
	}
	
	@Test
	public void should_fizzBuzzAll_when_number_given_number() {
		int number = 15;
		//given
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		//when
		String word = fizzBuzzGame.getWords(number);
		//then
		Assertions.assertEquals("fizzBuzz", word);
	}
	
}
