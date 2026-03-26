package com.java.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
	
	public static void main(String[] args) {
		String str = "pwwkew";
		
       String longestString = longestSubString(str);
		
		System.out.println("longestString:: "+longestString);
	}

	private static String longestSubString(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		int left = 0;
		int maxLength = 0;
		int startIndex = 0;
		
		for (int right = 0; right < str.length(); right++) {
			
			char c = str.charAt(right);
			
			if(map.containsKey(c)) {
				left = Math.max(right, map.get(c)+1);
			}
			
			map.put(c, right);
			
			if(right-left+1 > maxLength) {
				maxLength = right - left +1;
				startIndex = left;
			}
			
		}
		
		return str.substring(startIndex, startIndex+maxLength);
	}

}
