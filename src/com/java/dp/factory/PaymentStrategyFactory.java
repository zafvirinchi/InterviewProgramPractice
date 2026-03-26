package com.java.dp.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentStrategyFactory {
//	private final Map<String, PaymentStrategy> strategies = new HashMap<>();
	
//	public PaymentStrategyFactory(List<PaymentStrategy> strategyList) {
//		  strategyList.forEach(this::register);
//		  
//	}

	private static PaymentStrategy createPayment(String type, PaymentDetails details) {
		return switch(type.toUpperCase()) {
		     case "DEBIT" -> new DebitCardStrategy(details);
		     case "CREDIT" -> new CreditCardStrategy(details);
		     default -> throw new IllegalArgumentException("Unknown Payment Type: " +type);
		};
	}

}
