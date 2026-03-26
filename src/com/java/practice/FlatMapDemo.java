package com.java.practice;

import java.util.stream.Collectors;

public class FlatMapDemo {
	
	/*
	 * Mental model
	 * 
	 * “map gives lists, flatMap opens each list and pours everything into one
	 * stream.”
	 */
	
	public static void main(String[] args) {
//		Each order contains multiple items.
//		👉 Find all item names costing > 1000
		
//		orders.stream().flatMap(o->o.getItems.streams())
//		.filter(item->item.getPrice() > 1000)
//		.map(Item::getName).collect(Collectors.toList());
	}

}
