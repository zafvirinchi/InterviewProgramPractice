package com.java.dp.builder;

public class User {
    private final String name;
    private final int age;
    private final String email;
    
	public User(Builder builder) {
		
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
	}
	
	private static class Builder{
	    private String name;
	    private int age;
	    private String email;
	    
		public Builder name(String name) {
		
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age =  age;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	    
	    
	}
	
	
	public static void main(String[] args) {
		User user = new User.Builder().age(30).name("Zafrul").email("abc@gmail.com").build();
	}
    
    
}
