package com.java.practice;

public class User {
	 String name;
     boolean isActive;
     boolean isPremium;
     
		public User(String name, boolean isActive, boolean isPremium) {
			super();
			this.name = name;
			this.isActive = isActive;
			this.isPremium = isPremium;
		}
		
		public boolean isActive() {
	        return isActive;
	    }

	    public boolean isPremium() {
	        return isPremium;
	    }
}
