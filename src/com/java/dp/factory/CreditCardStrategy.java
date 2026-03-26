package com.java.dp.factory;

public final class CreditCardStrategy implements PaymentStrategy {
  
	 private PaymentDetails paymentDetails;
	 
	 
	
	public CreditCardStrategy(PaymentDetails paymentDetails) {
		
		this.paymentDetails = paymentDetails;
	}

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

}
