package com.ds.hashing;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test11 {
   public static void main(String[] args) {
      List<String> list1 = List.of("aa", "bb", "cc"); 
       
       List<String> list2 = List.of("cc", "dd", "aa"); 
       
       //output:- aa,aa
       
       List<String> list3 = new LinkedList<>();
       
       for(String s:list1) {
    	   if("aa".equals(s)) {
    		   list3.add("aa");
    	   }
       }
       
      
       
       Optional<String> str =   list2.stream().filter(l->l.equals(list3.get(0))).findAny();
       
       list3.add(str.get());
       
       list3.stream().forEach(System.out::println);
       
       List<String> result = Stream.of(list1,list2).filter(list->list.contains("aa"))
    		   .map(list->"aa").collect(Collectors.toList());
       
       

    }
}
