package com.java.dp.abstractFactory;

//Abstract Factory provides an interface to create 
//families of related objects without specifying their concrete classes.

//“Each payment gateway provides a family of related operations like 
//payment and refund. Abstract Factory helps us create compatible gateway-specific 
//implementations while keeping business logic independent of vendor APIs.”
public interface PaymentGatewayFactory {
    PaymentProcessor createPaymentProcessor();
    RefundProcessor createRefundProcessor();
    InvoiceProcessor createInvoiceProcessor();
}
