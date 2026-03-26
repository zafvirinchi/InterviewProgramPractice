package com.ds.hashing;

import java.util.Arrays;
import java.util.Iterator;

public class Test7 {
	
//	Find the missing numbers in Integer array {1,2,3,4,7,8,9}.
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,8,9};
		
		int[] missingNumber =  findMissingNumber(arr);
		
	}

	private static int[]  findMissingNumber(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		int mssingArrSize = arr[n]-n;
		
		int[] missingNumber = new int[mssingArrSize];
		
		int sumOfInteger = ((n *(n-1))/2);
		
		int sum = Arrays.stream(arr).sum();
		
		int remainingNumber = sumOfInteger - sum;
		
		if((remainingNumber%2)==0) {
			for(int i=0;i<mssingArrSize; i++) {
				missingNumber[i] = remainingNumber%2;
			}
			
		}
		
		for(int i=0;i<mssingArrSize; i++) {
			missingNumber[i] = remainingNumber-1%2;
		}
		
		
		return missingNumber;
		
	}

}
