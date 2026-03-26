package com.java.practice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ForkJoinPoolWorkStealing {
	
	public static void main(String[] args) {
		/*
		 * Each worker has its own deque (double-ended queue)
		 * 
		 * Workers:
		 * 
		 * Pop tasks from their own head
		 * 
		 * Steal tasks from other workers’ tail
		 * 
		 * This reduces contention (less locking).
		 */
		
//		list.parallelStream()
//	    .map(x -> x * x)
//	    .forEach(System.out::println);

//		ForkJoinPool customPool = new ForkJoinPool(4);
//
//		customPool.submit(() ->
//		    list.parallelStream()
//		        .forEach(System.out::println)
//		).join();
		
		
//		| Aspect           | ForkJoinPool          | ExecutorService   |
//		| ---------------- | --------------------- | ----------------- |
//		| Task model       | Small recursive tasks | Independent tasks |
//		| Work-stealing    | ✅ Yes                 | ❌ No              |
//		| Queue            | Per-thread deque      | Shared queue      |
//		| Best for         | CPU-bound             | IO / blocking     |
//		| Thread usage     | Aggressive            | Conservative      |
//		| Parallel streams | ✅ Used                | ❌ Not used        |
		
		
//		ExecutorService executor = Executors.newFixedThreadPool(10);
//
//		CompletableFuture<User> user =
//		    CompletableFuture.supplyAsync(this::getUser, executor);
//
//		CompletableFuture<Order> order =
//		    CompletableFuture.supplyAsync(this::getOrder, executor);
//
//		CompletableFuture<Payment> payment =
//		    CompletableFuture.supplyAsync(this::getPayment, executor);
//
//		CompletableFuture<ApiResponse> response =
//		    CompletableFuture.allOf(user, order, payment)
//		        .thenApply(v ->
//		            new ApiResponse(user.join(), order.join(), payment.join())
//		        );

		
//		Ultimate Interview Answer (Strong)
//
//		“Parallel streams rely on ForkJoinPool and are best for CPU-bound 
//		operations, while CompletableFuture provides flexible asynchronous 
//		control and is preferred for IO-heavy microservices. Misusing parallel 
//		streams for blocking calls can severely degrade performance.”


	}

}
