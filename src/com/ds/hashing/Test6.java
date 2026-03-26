package com.ds.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test6 {
	
//	Find the longest substring without repeating characters , 
//	"abcabcdbbabc".
	public static void main(String[] args) {
		
		String s= "abcabcdbbabc";
		
		String str = "pwwkew";
		
		String longestString = longestSubString(s);
		
		System.out.println("longestString:: "+longestString);
		
	}

private static String longestSubString(String s) {
	// TODO Auto-generated method stub
	Map<Character,Integer> map = new LinkedHashMap<>();
	
	int left = 0;
	int maxLength = 0;
	int startIndex =0;
	

	for(int right = 0; right < s.length(); right++) {
		 char c = s.charAt(right);
		 
		 if(map.containsKey(c)) {
			 left = Math.max(left, map.get(c)+1);
		 }
		 
		 map.put(c, right);
		 
		 if(right-left > maxLength) {
			 maxLength = right-left+1;
			 startIndex = left;
		 }
	}
	
	return s.substring(startIndex, startIndex + maxLength);
}

}
