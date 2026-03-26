package com.java.practice;

public class StockProfit {
	
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			
			minPrice = Math.min(minPrice,price);
			
			int profit = price - minPrice;
			
			maxProfit = Math.max(maxProfit, profit);
			
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {7,1,5,3,6,4};
		int maxProfit = maxProfit(arr);
		
		System.out.println("maxProfit==>"+maxProfit);
	}

}
