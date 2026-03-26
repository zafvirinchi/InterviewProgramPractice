package com.java.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThenComposeThenCombine {
	
	public static void main(String[] args) {
		//thenCompose() = dependent async call (flatMap)
		//thenCombine() = independent async calls (merge results)
		
//		thenCompose  → step 2 depends on step 1 result
//		thenCombine  → step 2 runs independently
		
		//The next async task depends on the previous result 
		//then thenCompose thenApply will not work
		
//		CompletableFuture<CompletableFuture<User>> future =
//			    getUserId()
//			        .thenApply(id -> getUserById(id)); // ❌ nested future
		
		/*
		 * getUserId() → returns CompletableFuture<Integer> 
		 * getUserById(id) → returns CompletableFuture<User> 
		 * 
		 * thenCompose() flattens it
		 */
		
//		CompletableFuture<User> future = 
//				getUserId()
//				   .thenCombine(id->getUserById(id));

//		You have two independent futures and want to combine their results
//		CompletableFuture<User> userFuture = getUser();
//		CompletableFuture<Account> accountFuture = getAccount();
//
//		CompletableFuture<UserAccount> result =
//		    userFuture.thenCombine(accountFuture,
//		        (user, account) -> new UserAccount(user, account)
//		    );
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(()->{
		
	     sleep(500);
		return 2;
		},executorService);
		
		future1.thenApply(i->i*2).thenAccept(i->System.out.println("i==>"+i))
		.exceptionally(exn -> { exn.printStackTrace(); return null; });
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(()->3);
		
		future1.thenCombine(future2, Integer::sum).thenAccept(sum->System.out.println("Sum:"+sum));


		
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
