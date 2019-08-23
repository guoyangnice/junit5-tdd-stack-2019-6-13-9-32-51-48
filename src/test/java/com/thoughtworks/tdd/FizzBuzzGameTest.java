package com.thoughtworks.tdd;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {
	@Test
	public void should_return_1_when_FizzBuzz_given_1() {
		//given
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		//when
		String word = fizzBuzzGame.getWords();
		//then
		assertThat(word, is("1"));
	}
}
