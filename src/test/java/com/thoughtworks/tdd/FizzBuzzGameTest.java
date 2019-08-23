package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {
	@Test
	public void should_return_1_when_FizzBuzz_given_1() {
		int number = 0;
		//given
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		//when
		String word = fizzBuzzGame.getWords(number);
		//then
		//Assertions.assertEquals("1", word);
//		assertThat(word, is("1"));
	}
	
	public void should_return_fizzBuzz_when_3_given_number() {
		int number = 3;
		//given
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		//when
		String word = fizzBuzzGame.getWords(number);
		//then
		Assertions.assertEquals("fizz", word);
	}
}
