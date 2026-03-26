package com.java.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeated {
	
	public static void main(String[] args) {
		String word = "swiss";
		 
		Character nrc = getFirstNonRepeatingCharacter(word);
		System.out.println("FirstNonRepeatingCharacter===>"+nrc);
		
	}

	private static Character getFirstNonRepeatingCharacter(String word) {
		// TODO Auto-generated method stub
		return word.chars().mapToObj(c->(char)c)
		     .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
		     .entrySet()
		     .stream()
		     .filter(e->e.getValue()==1)
		     .map(Map.Entry::getKey)
		     .findFirst()
		     .orElse('\0');
		
//       Map<Character, Long> entry = (Map<Character, Long>) word.chars().mapToObj(c->(char)c)
//	     .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
//	     .entrySet()
//	     .stream()
//	     .filter(e->e.getValue()==1)
//	     .map(Map.Entry::getKey,Map.Entry::getValue)
	     
       
      // System.out.println(entry);
	    
		
	}

}
