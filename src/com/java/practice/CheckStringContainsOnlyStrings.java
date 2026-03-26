package com.java.practice;

public class CheckStringContainsOnlyStrings {
       
	 public static void main(String[] args) {
		 System.out.println(checkStringContainsOnlyStrings("12345"));  // true
	        System.out.println(checkStringContainsOnlyStrings("123a5"));  // false
	        System.out.println(checkStringContainsOnlyStrings(""));       // false
	}
	 
//	 public static boolean checkStringContainsOnlyStrings(String str) {
//		 if(str==null || str.isEmpty()) {
//			 return false;
//		 }
//		 return str.matches("\\d+");
//	 }
	 
	 public static boolean checkStringContainsOnlyStrings(String str) {
		 return str!=null && !str.isEmpty() &&
				 str.matches("\\d+");
	 }
}
