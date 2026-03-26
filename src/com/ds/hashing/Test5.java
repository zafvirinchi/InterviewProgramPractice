package com.ds.hashing;

import java.util.Arrays;
import java.util.Iterator;

public class Test5 {

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		
		int result[] = result(arr);
		//int result[] = productExceptSelf(arr);
		
	    Arrays.stream(result).forEach(k->System.out.println(k));
	
	}
	
	
	private static int[] result(int[] arr) {
		
     int result[] = new int[arr.length]; // [24,12,8,6] 
		
		result[0] = 1;
       
		//left side
		for(int j=1; j<arr.length;j++) {
			result[j] = result[j-1]* arr[j-1];
		}
		
		//right side
		int right = 1;
		for(int i = arr.length-1; i>=0; i--) {
			result[i] = result[i] * right;
			right = right * arr[i];
		}
		
		return result;
	}
	
}
	


