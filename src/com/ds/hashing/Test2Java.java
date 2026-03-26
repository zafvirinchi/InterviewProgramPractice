package com.ds.hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2Java {
  public static void main(String[] args) {
	  
	  
	  List<String> fruits = new ArrayList<>();
	  
	  fruits.add("Mango");
	  fruits.add("Mango");
	  fruits.add("Banana");
	  fruits.add("Banana");


Map<String, Long> map	 = fruits.stream()
	  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	  
 System.out.println(map.entrySet());
	
}
}
