package com.topmate.javainterview;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeDataOperation {
	
	//I have a list of 10K employee data. I want to perform some data transformation
	//and filtration, remove duplicates, and get data in sorted order. How do you handle
	//it?
	public static void main(String[] args) {
//		employeeList.stream().filter(e->e.salary>10000)
//		   .distinct()
//		   .sorted(Comparator.comparing(Employee::getName).reversed())
//		   .collect(Collectors.toList());
		
		
//		Filter Employee data where Name starts with “A”, CITY=”Bangalore”,
//				SALARY>100k, sort data by Employee Name in DESC order, avoid duplicate data,
//				and in the final response collect only Name, Salary, and Designation (Employee class
//				has more than 10 fields). How would you do it?
		
//List<Map<Strig,Object>> filteredEmployeeList = employeeList.stream()
//		.filter(e->e.getName.startsWith("A") &&
//				e.getCity.equalsIgnoreCase("Bangalore") && e.getSalary>100000)
//		        .ditinct()
//		        .sorted(Comparator.comparing(Employee::getName).reversed())
//		        .map(e->
//		        Map.of("name",e.getName(),
//		        		"salary",e.getSalary(),
//		        		"designation",e.getDesignation()))
//		        .colleect(Collectors.toList());
		   
	}

}
