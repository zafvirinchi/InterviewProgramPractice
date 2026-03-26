package com.java.practice;

import java.util.Comparator;
import java.util.Optional;

public class MostRecentFailedRequest {

//	You are given a list of Log objects.
//	Each Log contains the following fields:
//	requestId
//	statusCode
//	timestamp
//	Requirement:
//	A request is considered failed if statusCode >= 400
//	Find the most recent failed request
//	Print its requestId
//	Use Java 8 Stream API
	
	public static void main(String[] args) {
		
//		Optional<String> requestId = logs.stream().filter(log->log.statusCode >=400)
//				.max(Comparator.comparing(Log::getTimeStamp)).map(Log::getRequestId);
	}
}
