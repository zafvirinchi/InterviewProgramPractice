package com.java.dp;

public class Logger {
         
	private Logger() {
		if(Holder.Instance!=null){     //Prevents object creation using new Logger()
			throw new RuntimeException("Use getInstance()"); //Protects against reflection attacks
		}
	}
//	🔹 Why a static inner class?
//
//			Inner classes are NOT loaded until referenced
//
//			JVM loads classes lazily
//
//			🔹 When is Holder loaded?
//
//			👉 ONLY when this line executes:
	     //Holder.INSTANCE
	private static class Holder{
		private static final Logger Instance = new Logger();
	}
	//🔹 What happens at that moment?

//JVM loads Holder class
//
//JVM initializes static fields
//
//INSTANCE = new Logger() runs once
//
//JVM guarantees thread safety

//JVM class initialization is atomic & synchronized by JVM itself
	private static Logger getInstance() {
		return Holder.Instance;
	}
}
