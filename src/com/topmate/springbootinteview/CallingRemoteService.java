package com.topmate.springbootinteview;

public class CallingRemoteService {
	//Assume you are making a REST API call from one service to another service.
	//How will you manage data security, and what are possible ways to make remote
	//calls?
      public static void main(String[] args) {
//		WebClient.create()
//		   .get().uri("https://service/api/employees")
//		   .header("Authorization","Bearer token")
//		   .retrieve()
//		   .bodyToMono(Employee.class);
    	  
    	  
    	 // You are calling one service from another. What if the remote service goes down
    	  //or is not responding?
    	  
//    	  @CircuitBreaker(name="employeeService" fallbackMethod="fallback")
//    	  public Employee getEmployee(Long id) {
//    		  return restTemplate.getForObject("https://service/api/" + id, Employee.class);
//    	  }
//    	  
//    	  public Employee fallback(long id,Throwable t) {
//    		  return new Employee(id,"Unknown",0);
//    	  }
	}
}
