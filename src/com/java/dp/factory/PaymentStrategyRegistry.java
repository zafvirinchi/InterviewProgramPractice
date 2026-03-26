package com.java.dp.factory;

public interface PaymentStrategyRegistry {
     PaymentStrategy getStrategy(String type);
     void register(String type,PaymentStrategy strategy);
}
