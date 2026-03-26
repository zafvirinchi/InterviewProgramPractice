package com.java.practice;

import java.util.Arrays;

//Indian mathematician D.R. Kaprekar observed a very interesting property of number 6174.
//
//If you take any four digit number (let's say 3281) 
//and arrange its digits in descending order (8321) and ascending order (1238) 
//and then subtract the smaller number from the larger number -- and if you repeat that process, you will reach number 6174.
//
//For example:
//
//3281: 8321 - 1238 = 7083 8730 - 0378 = 8352 8532 - 2358 = 6174
//
//Number 6174 - when you do this process, will result into 6174 itself.
//
//Exception to this is a four digit number with all same digits (such as 1111, 2222, 3333 etc.), as that will result into 0 in the very first step.
//
//Your task is to write a function that finds out that for all four digit numbers (from 1000 to 9999), 
//how many steps does it take to reach the magic number (6174). 
//The function should also find out if it can't reach the number 6174 for whatever reason.
//
//
//
//Hint: Define a threshold - a large number of steps - after which, 
//your function should give up and declare that a given four digit number can't reach the magic number.


public class Kaprekar6174 {
	private static final int KAPREKAR_CONSTANT = 6174;
	private static final int THRESHOLD = 6174;
	
	private static int stepsTo6174(int num){
		
		if(num>9999 || num<1000) {
			throw new IllegalArgumentException("Number must be four digits");
		}
		
		if(allDigitsSame(num)) {
			return -1;
		}
		
		int steps = 0;
		
		while(num!=KAPREKAR_CONSTANT) {
			
			num = kaperkarStep(num);
			steps++;
			
			if(steps>THRESHOLD) {
				return -1;
			}
			
		}
		return steps;
	}
	
	private static int kaperkarStep(int num) {
		char[] chArr = String.format("%04d", num).toCharArray();
		
		Arrays.sort(chArr);
		
		int asc = Integer.parseInt(new String(chArr));
		
		reverse(chArr);
		
		int desc = Integer.parseInt(new String(chArr));

		return desc-asc;
		
	}
	
	private static void reverse(char[] chArr) {
		// TODO Auto-generated method stub
		
		for (int i = 0, j= chArr.length-1; i<j; i++, j-- ) {
			char temp = chArr[j];
			chArr[j]=chArr[i];
			chArr[i] = temp;
		}
		
	}

	private static boolean allDigitsSame(int num) {
		char[] chArr =String.valueOf(num).toCharArray();
		
		char firstChar = chArr[0];
		
		for (char c : chArr) {
			if(c!=firstChar) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(stepsTo6174(3281)); // 3
        System.out.println(stepsTo6174(1000)); // 5
        System.out.println(stepsTo6174(1111)); // -1
        System.out.println(stepsTo6174(6174)); // 0
	}
}
