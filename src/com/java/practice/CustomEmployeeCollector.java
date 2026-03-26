package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class CustomEmployeeCollector {
	
//	Scenarios:
//		implement a custom collector to group elements and apply a transformation
//		 
//		Query:
//		Write a custom collector that groups a list of Employee objects by department and 
//		collects the names of employees in each department as a comma-separated string.
//		 
//		POJO:
//		Employee - name, department, age, salary, designation
//		List<Employee> employees; 
	
//	employeeList.stream().collect(Collectors.groupingBy(
//			Employee::getDepartment,
//			Collectors.mapping(Employee::getName,Collectors.joining(','))));
	
//	public static Collector<Employee,
//    Map<String, StringJoiner>,
//    Map<String, String>> groupByDeptAndJoinNames() {
//
//return Collector.of(
//
//        // 1️⃣ Supplier
//        HashMap::new,
//
//        // 2️⃣ Accumulator
//        (map, employee) -> {
//            map.computeIfAbsent(
//                    employee.getDepartment(),
//                    k -> new StringJoiner(",")
//            ).add(employee.getName());
//        },
//
//        // 3️⃣ Combiner (for parallel streams)
//        (map1, map2) -> {
//            map2.forEach((dept, joiner) ->
//                    map1.merge(dept, joiner,
//                            (j1, j2) -> j1.merge(j2))
//            );
//            return map1;
//        },
//
//        // 4️⃣ Finisher
//        map -> {
//            Map<String, String> result = new HashMap<>();
//            map.forEach((dept, joiner) ->
//                    result.put(dept, joiner.toString())
//            );
//            return result;
//        }
//);
//}
//	
//	public static void main(String[] args) {
//		Map<String, String> result =
//		        employees.stream()
//		                .collect(EmployeeCollector.groupByDeptAndJoinNames());
//
//		System.out.println(result);
//	}

}
   