package com.thoughtworks.tdd;

public class FizzBuzzGame {
	public String getWords(int number) {
		String word = "";
//		for(int i = 0;i <= number;i++) {
			if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
				word = "fizzBuzzWizz";
				return word;
			}
			
			if(number % 3 == 0 && number % 5 == 0) {
				word = "fizzBuzz";
				return word;
			}
			
			if(number % 3 == 0) {
				word = "fizz";
				return word;
			}else if(number % 5 == 0){
				word = "Buzz";
				return word;
			}else if(number % 7 == 0) {
				word = "Wizz";
				return word;
			}
//		}
		return String.valueOf(number);
	}
}
