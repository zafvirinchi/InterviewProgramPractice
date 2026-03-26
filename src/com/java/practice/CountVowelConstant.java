package com.java.practice;

public class CountVowelConstant {
	
	public static void main(String[] args) {
		String str = "Hello World";
		//input: 
		
	Long vowels = str.chars()
		//.filter(c->Character.isLetter(c))
		.filter(c->"aeiou".indexOf(c)!=-1)
		.count();
	
	System.out.println("vowels==>"+vowels);
		
	}

}
