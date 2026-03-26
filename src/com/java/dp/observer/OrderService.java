package com.java.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements Subject{
	private List<Observer> observers = new ArrayList<>();
	private String orderStatus;
	
	public void setStatus(String status) {
		this.orderStatus = orderStatus;
		notifyObservers();
	}
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observers.forEach(o->o.update(orderStatus));
	}

}
