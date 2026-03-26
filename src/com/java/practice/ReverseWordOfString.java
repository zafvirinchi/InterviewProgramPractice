package com.java.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordOfString {

	public static void main(String[] args) {
		String st = "This is Java";
		
		StringBuilder result = new StringBuilder();
		
		String[] strArr = st.split(" ");
		
//		for (String str : strArr) {
//			StringBuilder sb = new StringBuilder(str).reverse();
//			sb.append(" ");
//			result.append(sb);
//		}
		
		for (String str : strArr) {
			int i = str.length()-1;
			
			while(i>=0) {
				result.append(str.charAt(i));
				i--;
			}
			
			
			result.append(" ");
		}
		
		System.out.println("result: "+result.toString().trim());
		
//		String output = Arrays.stream(st.split(" "))
//				.map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
//		
//		System.out.println("Output===>"+output);
	}
}
