package com.ds.hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1Java {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "four");
		map.put("2", "three");
		map.put("3", "two");
		map.put("4", "one");
		
		Map<String, String> reversedMap =
		map.entrySet().stream().sorted(Map.Entry.<String,String>comparingByKey().reversed())
		.collect(Collectors.toMap
				(Map.Entry::getKey, 
				Map.Entry::getValue,
				(oldVal, newVal)->oldVal,LinkedHashMap::new
				
			));
		
		map.clear();
		map.putAll(reversedMap);
		
		reversedMap.entrySet().stream().forEach(System.out::println);
	}
	
}
