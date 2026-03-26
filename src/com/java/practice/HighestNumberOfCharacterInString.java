package com.java.practice;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestNumberOfCharacterInString {
	
	
	public static void main(String[] args) {
		String str = "aaaaaaaaaaaaaaaaabbbbcddddeeeeee";
		
		//HighestNumberOfCharacterInString
//		Character result =str.chars().mapToObj(ch->(char)ch)
//		    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		    .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
//		
//		System.out.println("result==>"+result);
		
		//** duplicate character and its count **//
		
 str.chars().mapToObj(ch->(char)ch)
		      .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		      .entrySet().stream().forEach(System.out::println);
		      
		    		  
		
	}

}
