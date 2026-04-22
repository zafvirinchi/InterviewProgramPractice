package com.java.practice;

public class SecondHighestElementWithoutSorting {

	public static void main(String[] args) {
		int []a = {2,3,1,5,4};
		
		int secondHighestNum = getSecondHighestElement(a);
		
		System.out.println("secondHighestNum--->"+secondHighestNum);
	}

	private static int getSecondHighestElement(int[] a) {
		// TODO Auto-generated method stub
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int num : a) {
			if(num>first) {
				second = first;   //push current max to second
				first = num;      //update max
			}else if(num> second && num!=first) {
				second = num;     //update second max
			}
		}
		
		return second;
	}
}
