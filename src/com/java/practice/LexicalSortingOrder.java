package com.java.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LexicalSortingOrder {
	
    public static void main(String[] args) {
    	Integer[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                20, 21, 30, 31, 40, 41, 50, 51,
                60, 61, 70, 71, 80, 81, 90, 91,
                100, 101
            };
    	
//    List<Integer> result = Arrays.stream(numbers)
//    	    .sorted(Comparator.comparing(String::valueOf)).toList();
    	
    	  //System.out.print(result);
    	
    	Arrays.sort(numbers, (a,b)->String.valueOf(a).compareTo(String.valueOf(b)));
    	
    	System.out.println(Arrays.toString(numbers));
    
  

	}
}
