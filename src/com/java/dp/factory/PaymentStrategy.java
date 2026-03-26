package com.java.dp.factory;

public interface PaymentStrategy {
	boolean pay(double amount);
	String getType();

}
