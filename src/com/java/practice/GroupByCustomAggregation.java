package com.java.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCustomAggregation {
	
	record Transaction(String category,Double amount) {}
         public static void main(String[] args) {
			
        	 List<Transaction> transactions = List.of(new Transaction("Food", 50.0),
        			                                  new Transaction("Travel", 300.0),
        			                                  new Transaction("Food", 30.0)
        			                                   );
        	 
        Map<String, Double> transactionsGroupByCategory = transactions.stream()
        	 .collect(Collectors.groupingBy(Transaction::category, Collectors.summingDouble(Transaction::amount)));
		
         System.out.println(transactionsGroupByCategory);
         }
}
