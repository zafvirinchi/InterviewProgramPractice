package com.java.practice;

public class Anagram {
	
	public static void main(String[] args) {
		String s1 = "MADAM";
		String s2 = "MADAM";
		
		System.out.println(chackAnagram(s1,s2));
		
	}

	private static Boolean chackAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		
		int[] frq = new int[26];
		

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			
			return false;
		}
		
		for (int i = 0; i < s1.length(); i++) {
			 frq[s1.charAt(i) - 'a']++;
		        frq[s2.charAt(i) - 'a']--;
		}
		
		for (int count : frq) {
			if(count!=0) return false;
		}
		
		return true;
	}

}
