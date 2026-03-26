package com.java.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestSalaryGroupByDepartment {


	
	public static void main(String[] args) {
		/*
		 * Stream operations in Java 8 are lazy by design — intermediate operations
		 * (map, filter, sorted) do not execute immediately. They build a pipeline and
		 * run only when a terminal operation (collect, forEach, reduce) is invoked.
		 * Lazy evaluation improves performance by enabling short-circuiting and
		 * pipeline fusion. Eager evaluation exists only in terminal operations where
		 * results must be produced.
		 */
		Stream<Integer> s = Stream.of(1, 2, 3, 4)
		        .filter(n -> {
		            System.out.println("Filtering " + n);
		            return n % 2 == 0;
		        }); // Lazy, nothing printed yet

		s.forEach(System.out::println); // Terminal operation
		
//		employees
//		   ↓
//		group by department
//		   ↓
//		collect department employees into List
//		   ↓
//		NOW run custom logic (collectingAndThen)
//		   ↓
//		Optional<Employee>
		
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "A", "IT", 90000),
	            new Employee(2, "B", "IT", 80000),
	            new Employee(3, "C", "IT", 90000),
	            new Employee(4, "D", "HR", 60000),
	            new Employee(5, "E", "HR", 50000),
	            new Employee(6, "F", "FIN", 100000),
	            new Employee(7, "G", "FIN", 90000)
	        );
		
				Map<String, Employee> secondHighestEmpByDept =
	            employees.stream()
	                .collect(Collectors.groupingBy(
	                    Employee::getDepartment,
	                    Collectors.collectingAndThen(
	                        Collectors.toList(),
	                        list -> list.stream()
	                            .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                            .map(e -> Map.entry(e.getSalary(), e))
	                            .distinct()              // remove duplicate salaries
	                            .skip(1)                 // skip highest salary
	                            .map(Map.Entry::getValue)
	                            .findFirst()
	                            .orElse(null)            // convert Optional -> Employee
	                    )
	                ))
	                .entrySet()
	                .stream()
	                .filter(e -> e.getValue() != null) // remove depts without 2nd highest
	                .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue
	                ));

	        // 🔹 Print result
	        secondHighestEmpByDept.forEach((dept, emp) ->
	            System.out.println(dept + " -> " + emp)
	        );
	    }

		
	}

	
	class Employee {
	    private int id;
	    private String name;
	    private String department;
	    private double salary;

	    public Employee(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    public String getDepartment() { return department; }
	    public double getSalary() { return salary; }

	    @Override
	    public String toString() {
	        return name + " (" + salary + ")";
	    }
	}




