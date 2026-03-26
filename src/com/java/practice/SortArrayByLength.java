package com.java.practice;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayByLength {
	
	public static void main(String[] args) {
		String[] input = {"Java", "Python", "C", "C++"};
		
		// Arrays.sort(input,Comparator.comparingInt(String::length));
		
		String[] result = Arrays.stream(input)
				.sorted(Comparator.comparing(String::length)).toArray(String[]::new);
		
		System.out.println("result===>"+Arrays.toString(result));
	}

}
