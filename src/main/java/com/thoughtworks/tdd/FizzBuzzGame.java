package com.thoughtworks.tdd;

public class FizzBuzzGame {
	public String getWords(int number) {
		String word = "";
		for(int i= 0 ;i <= number;i++) {
			if(number % 3 == 0) {
				word = "fizz";
			}else if(number % 5 == 0){
				word = "Buzz";
			}else if(number % 7 == 0) {
				word = "Wizz";
			}
		}
		return word;
	}
}
