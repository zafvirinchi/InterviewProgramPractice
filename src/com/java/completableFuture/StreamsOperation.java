package com.java.completableFuture;

import java.util.stream.Stream;

public class StreamsOperation {
	
	public static void main(String[] args) {
		
//		You cannot read the same InputStream twice without resetting.
//		Streams behave similarly — one-time pipelines.
		
		Stream<String> stream = Stream.of("A", "B", "C");

		stream.forEach(System.out::println); // OK

		stream.forEach(System.out::println); // IllegalStateException
	}

}
