package com.java.practice;

public class CharacterCount {
    
	 public static void main(String[] args) {
//		 Input - "ABBCCCDDDDA"
//		 Output - "A2B2C3D4"
		
//			        String input = "ABBCCCDDDDA";
//			        StringBuilder result = new StringBuilder();
//
//			        int count = 1;
//
//			        for (int i = 1; i < input.length(); i++) {
//
//			            if (input.charAt(i) == input.charAt(i - 1)) {
//			                count++;
//			            } else {
//			                result.append(input.charAt(i - 1)).append(count);
//			                count = 1;
//			            }
//			        }
//
//			        // last character
//			        result.append(input.charAt(input.length() - 1)).append(count);
//
//			        System.out.println(result);
		 
		 String s = "ABBCCCDDDDA";

		 String result =
		         s.chars()
		          .mapToObj(c -> (char)c)
		          .collect(
		              java.util.stream.Collectors.collectingAndThen(
		                  java.util.stream.Collectors.groupingBy(
		                      c -> c,
		                      java.util.LinkedHashMap::new,
		                      java.util.stream.Collectors.counting()
		                  ),
		                  m -> m.entrySet()
		                        .stream()
		                        .map(e -> e.getKey() + "" + e.getValue())
		                        .collect(java.util.stream.Collectors.joining())
		              )
		          );

		 System.out.println(result);
	}
}
