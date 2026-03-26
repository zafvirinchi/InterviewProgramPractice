package com.java.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementInList {
	
	public static void main(String[] args) {
		List<String> usernames = List.of("alice", "bob", "charlie", "bob", "alice");
		
		Set<String> nonDuplicateList = new HashSet<>();
		
		Set<String> elementSet = usernames.stream().filter(username->!nonDuplicateList.add(username))
				.collect(Collectors.toSet());
		System.out.println("elementSet==>"+elementSet);
	}

}
