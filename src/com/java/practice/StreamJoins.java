package com.java.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoins {
	
	// SQL JOIN → Simulated with flatMap() + filter()

//Java Streams don’t have a direct JOIN method.
//You can simulate joins using flatMap(), filter(), or maps for efficient lookups.
//Example (using a realistic join key departmentId):
	
	public static void main(String[] args) {
		
//	Map<String,Department> departmentMap =	departmentList.stream()
//			.collect(Collectors.toMap(Department::getDepartmentId, d->d));
//		
//	List<Person> persoList =	personList.stream()
//		.filter(p->departmentMap.contains(p.getDepartmentId()))
//		.map(p->p.getName() + "Works in" +
//				departmentMap.get(p.getDepartmentId()).getName());
		
//		Stream.concat(people1.stream(), people2.stream())
//		.distinct().collect(Collectors.toList());
	}

	// SQL Equivalent: SELECT p.name, d.name FROM people p
//  INNER JOIN department d ON p.departmentId = d.departmentId;
}
