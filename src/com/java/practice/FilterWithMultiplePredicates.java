package com.java.practice;

import java.util.List;
import java.util.function.Predicate;

public class FilterWithMultiplePredicates {
	
       public static void main(String[] args) {
    	   
    	   Predicate<User> isActive = u -> u.isActive();
           Predicate<User> isPremium = u -> u.isPremium();
           //Predicate<User> isActiveAndisPremium =  u.isActive() && (u.isPremium());
    	   
    	   
    	   List<User> users = List.of(
    			    new User("A", true, true),
    			    new User("B", true, false),
    			    new User("C", false, true)
    			);
    	   
    	   
    	   List<User> activeAndPremium = users.stream()
    			   .filter(u->u.isActive() && (u.isPremium())).toList();
    	   
	}
      
       
        
}



//Predicate<FilterWithMultiplePredicates> isActive = u->u.is
