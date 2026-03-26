package com.java.dp.factory;

public class DebitCardStrategy implements PaymentStrategy{
   private PaymentDetails paymentDetails;
   
	public DebitCardStrategy(PaymentDetails paymentDetails) {
	
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
		return "DEBIT";
	}

	

}
