package com.java.practice;

import java.util.List;

public class FindCommonPrefix {
	
     public static void main(String[] args) {
    	 
    	 List<String> strList = List.of("flower","flow","flight");
    	 
    	String commonPrifix = findCommonPrefix(strList);
    	
    	System.out.println("commonPrifix: "+commonPrifix);
		
	}

	 private static String findCommonPrefix(List<String> strList) {
		// TODO Auto-generated method stub
		
		  String first = strList.get(0);
		  
		  for (int i = 0; i < first.length(); i++) {
			  
			  char c = first.charAt(i);
			  
			  for (String s : strList) {
				  if(i>=s.length() || s.charAt(i)!= c) {
					  return s.substring(0, i);
				  }
			    }
			  
			 
			
		   }
		  return first;
	 }
}
