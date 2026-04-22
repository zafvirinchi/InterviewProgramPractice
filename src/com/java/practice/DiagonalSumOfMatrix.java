package com.java.practice;

public class DiagonalSumOfMatrix {
	
//	Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//	For example, the square matrix  is shown below:
//	1 2 3
//	4 5 6
//	9 8 9
//	The left-to-right diagonal =15 . The right to left diagonal = 17. Their absolute difference is 2.

	public static void main(String[] args) {
		 int a[][] = {
	                {1,2,3},
	                {4,5,6},
	                {9,8,9}
	        };
		 
		 int n = a.length;
		 int leftDiagonalSum = 0;
		 int rightDiagonalSum = 0;
		 
		 for (int i = 0; i < n; i++) {
			 leftDiagonalSum += a[i][i];
			 rightDiagonalSum += a[i][n-1-i];
			
		}
		 
		 System.out.println("leftDiagonalSum:: "+leftDiagonalSum);
		 System.out.println("rightDiagonalSum:: "+rightDiagonalSum);
		 
		 int diagonalDiff = Math.abs(rightDiagonalSum-leftDiagonalSum);
		 
		 System.out.println("diagonalDiff :: "+diagonalDiff);
		 }

}
