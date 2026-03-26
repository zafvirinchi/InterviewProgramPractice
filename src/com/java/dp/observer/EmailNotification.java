package com.java.dp.observer;

public class EmailNotification implements Observer{

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email sent: " + message);
	}

}
