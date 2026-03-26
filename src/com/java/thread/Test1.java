package com.java.thread;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
    	//longest common prefix
    	//["flower","flow","flight"]
//    List<String> strList = 	List.of("flower","flow","flight");
//    
//    Map<String,Integer> map = new HashMap<>();
    
//    strList.stream()
//    .forEach(str->str.chars().mapToObj(c->(char)c)
//    		.collect(Collectors.groupingBy(c->c,!)))
    	
    
//    for (String string : strList) {
//    	char[] ch = string.toCharArray();
//    	Map<String,Integer> seen = new HashMap<>();
//    	int count = 0;
//    	if(!map.containsKey(ch)) {
//    		map.put(ch, count++)
//    	}
//		
//	}
    	
//    	string =  babad, result = bab
//    			o/p 3
    	
    	String str = "babad";
    	//String result = "bab";
    	
    	int strLength = 0;
    	
    	
    	
    	if(str.length()%2!=0) {
    		strLength =str.length()-1;
    		char[] ch = str.toCharArray();
    		StringBuilder sb1 = new StringBuilder();
    		for (int i = 0; i < strLength-1; i++) {
				sb1.append(ch[i]);// baba
			}
    		if(sb1.equals(sb1.reverse())) { //baba == abab
    			int len = sb1.length(); 
        		System.out.println("length:"+len);
    		}
    	}
    	
    
    	
	}
}
