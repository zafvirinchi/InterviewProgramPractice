package com.java.dp.abstractFactory;

public class RazorPayFactory implements PaymentGatewayFactory{

	@Override
	public PaymentProcessor createPaymentProcessor() {
		// TODO Auto-generated method stub
		return new RajorpayPayment();
	}

	@Override
	public RefundProcessor createRefundProcessor() {
		// TODO Auto-generated method stub
		return new RazorPayRefund();
	}

	@Override
	public InvoiceProcessor createInvoiceProcessor() {
		// TODO Auto-generated method stub
		return new RazorPayInvoice();
	}

}
