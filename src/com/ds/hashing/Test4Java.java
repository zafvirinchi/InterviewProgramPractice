package com.ds.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test4Java {
	
   public static void main(String[] args) {
//	   Rama- "555-1123", "555-3389"
//	   Sita - "555-2243", "555-5264"
//	   Laxman - "555-6654", "555-3242"
	   
//	   List<String> RamaphoneList = new ArrayList<>();
//	   
//	   List<String> SitaphoneList = new ArrayList<>();
//	   
//	   List<String> LaxmanphoneList = new ArrayList<>();
//	   
//	   RamaphoneList.add("555-1123");
//	   RamaphoneList.add("555-3389");
//	   
//	   SitaphoneList.add("555-2243");
//	   SitaphoneList.add("555-5264");
//	   
//	   LaxmanphoneList.add("555-6654");
//	   LaxmanphoneList.add("555-3242");
//	   
//	   Map<String,List<String>> phoneMap = new HashMap<>();
//	   
//	   phoneMap.put("Rama", LaxmanphoneList);
//	   phoneMap.put("Sita", LaxmanphoneList);
//	   
//	   phoneMap.put("Laxman", LaxmanphoneList);
//	   
//	   List<String> allPhoneNumbers =
//	   phoneMap.values().stream().flatMap(List::stream).collect(Collectors.toList());
//	   
//
//        System.out.println(allPhoneNumbers);
	   
	   //phoneMap.entrySet().stream().flatMap(m->(m)List);
	   
	   
	   //Input:  s = "ABC"
	  // Output: "ABC", "ACB", "BAC", "BCA", "CAB", "CBA"
	   

	   
	   String input = "ABC";
	   if(input.length()==0) {
		   return;
	   }
	   
	   String result = "";
	   
	   permute(input,result);
	   
	
   }

   private static void permute(String input, String result) {
	// TODO Auto-generated method stub
	   if (input.length() == 0) {
           System.out.println(result);
           return;
       }
	 
	   for (int i = 0; i < input.length(); i++) {
		   char ch = input.charAt(i);
		   
		   String remaining = input.substring(0, i) + input.substring(i + 1);
		    
		   permute(remaining, result + ch);
		
	      }
	
   }
}
