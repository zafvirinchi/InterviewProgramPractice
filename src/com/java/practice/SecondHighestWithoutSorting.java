package com.java.practice;

public class SecondHighestWithoutSorting {
	
	public static void main(String[] args) {
		int[] arr = {8,2,5,9,6};
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int n : arr) {
		    if (n > max) {
		        secondMax = max;
		        max = n;
		    } else if (n > secondMax && n != max) {
		        secondMax = n;
		    }
		}
	}

}
