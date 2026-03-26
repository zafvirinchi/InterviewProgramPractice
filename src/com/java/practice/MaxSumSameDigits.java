package com.java.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxSumSameDigits {
	
	
//	There is an array A consisting of N integers. 
//	What is the maximum sum of two integers from A that have common first and last digits? 
//	If there are no two integers that have common first and last digits, 
//	the function should return −1. Examples: 1. Given A = [405, 45, 300, 300], 
//	the function should return 600. 
//	There are two pairs of integers that share first and last digits: (405, 45) and (300, 300). 
//	The sum of the two 300s is bigger than the sum of 405 and 45. 2. 
//	Given A = [30, 909, 3190, 99, 3990, 9009], the function should return 9918.
	
	public static int solution(int[] A) {

        Map<String, PriorityQueue<Integer>> map = new HashMap<>();

        for (int num : A) {
            int first = getFirstDigit(num);
            int last = num % 10;

            String key = first + "-" + last;

            map.putIfAbsent(key, new PriorityQueue<>(Collections.reverseOrder()));
            map.get(key).add(num);
        }

        int maxSum = -1;

        for (PriorityQueue<Integer> pq : map.values()) {
            if (pq.size() >= 2) {
                int firstMax = pq.poll();
                int secondMax = pq.poll();
                maxSum = Math.max(maxSum, firstMax + secondMax);
            }
        }

        return maxSum;
    }

    private static int getFirstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{405, 45, 300, 300})); // 600
        System.out.println(solution(new int[]{30, 909, 3190, 99, 3990, 9009})); // 9918
    }

}
