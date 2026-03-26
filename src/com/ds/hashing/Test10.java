package com.ds.hashing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test10 {
   
	public static void main(String[] args) {
//		int num = 90;
//		
//		getPrimeNumber(num);
		
		String str = "Good Morning";
		
		getStringFreq(str);
	}

	private static void getStringFreq(String str) {
		// TODO Auto-generated method stub
		
		String strArr[] = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for (String string : strArr) {
			sb.append(string.toLowerCase());
		}
		
		String concatenatedStr = sb.toString();
		
		concatenatedStr.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.forEach(System.out::println);
		
		
	}

//	private static void getPrimeNumber(int num) {
//		// TODO Auto-generated method stub
//		
//	  for(int i=2; i<num-1; i++) {
//		  if(num%i==0) {
//			  return;
//		  }
//	  }
//		
//	}
}
