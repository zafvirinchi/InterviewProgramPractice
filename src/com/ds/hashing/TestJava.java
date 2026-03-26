package com.ds.hashing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestJava {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,3,4,4,4,4};
		
		Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,Collectors.counting())).forEach((k,v)->System.out.println(k+"->"+v));
		
//	    Map<Integer, Integer> map = new LinkedHashMap<>();
//		
//	    int count = 0;
//		for (int i : arr) {
//			if(map.containsKey(i)) {
//				map.put(null, null)
//			}
//			
//		}
	
		
	}
}
