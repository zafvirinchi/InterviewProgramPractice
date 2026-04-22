package com.sql.practice;

public class SQLTest {
     
	  //Find the second highest salary in each department
	
//	  select department_id,employee_id,salary
//	   from(select department_id, employee_id, salary,
//			     DENSE_RANK() over(           //handles duplicate salaries correctly
//			    		 PARTITION BY department_id,  //Separate each department
//			    		 ORDER BY salary desc       
//			    		 )AS rank
//			       from employee 
//			   )t
//	   WHERE rank = 2;
	
//	select e1.*
//	 from employee e1
//	 where 2 = (
//			 select count(DISTINCT e2.salary)
//			 FROM employee e2
//			 where e2.department_id = e1.department_id
//			 AND e2.salary > e1.salary
//		);
	 
}
