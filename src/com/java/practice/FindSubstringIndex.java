package com.java.practice;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindSubstringIndex {
	
	public static void main(String[] args) {
		 String s1 = "dipsanddip";
	        String s2 = "dip";
	        

	        System.out.println(findIndices(s1, s2));
	}

	private static List<Integer> findIndices(String s1, String s2) {
		// TODO Auto-generated method stub
		
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i <= s1.length() - s2.length(); i++) {
			//array_type array_element = s1[i];
			if(s1.substring(i, i + s2.length()).equals(s2)) {
				result.add(i);
			}
			
		}
		
		return result;
	}
	
	private static List<Integer> findIndicesJava8(String s1, String s2) {
		// TODO Auto-generated method stub
		
		List<Integer> result = new ArrayList<>();
//		
//		for (int i = 0; i <= s1.length() - s2.length(); i++) {
//			//array_type array_element = s1[i];
//			if(s1.substring(i, i + s2.length()).equals(s2)) {
//				result.add(i);
//			}
//			
//		}
		
		IntStream.iterate(s1.indexOf(s2),
                i -> i >= 0,
                i -> s1.indexOf(s2, i + 1))
       .forEach(result::add);

return result;
		
		
	}


}
