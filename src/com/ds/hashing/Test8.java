package com.ds.hashing;

public class Test8 {
	
	int n = 5;
   public static void main(String[] args) {
	   fact(8);
    }

   private static void fact(int n) {
	// TODO Auto-generated method stub
	   System.out.print("Factcors are: ");
	   
	   for(int i=1; i<=n; i++ ) {
		   
		   if(n%i==0) {
			   System.out.print(+i + ",");
		   }
	   }
	
   }
}



