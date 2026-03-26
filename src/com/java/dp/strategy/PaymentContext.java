package com.java.dp.strategy;

public class PaymentContext {
     PaymentStrategy paymentStrategy;

	 public PaymentContext(PaymentStrategy paymentStrategy) {
	
		this.paymentStrategy = paymentStrategy;
	 }
     
	 public void execute(int amount) {
		 paymentStrategy.pay(amount);
	 }
	 
     
}
