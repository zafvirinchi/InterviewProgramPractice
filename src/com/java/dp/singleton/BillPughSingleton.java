package com.java.dp.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {
		
	}

	private static class Holder{
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	private BillPughSingleton getInstance() {
	     return Holder.instance;
	}
}
