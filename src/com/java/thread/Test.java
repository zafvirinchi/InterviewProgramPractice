package com.java.thread;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		String str = "helloworld";
	     
	     str.chars().mapToObj(c->(char)c)
	     .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())).
	    		 entrySet().stream().forEach(System.out::println);
	}
	 
}
