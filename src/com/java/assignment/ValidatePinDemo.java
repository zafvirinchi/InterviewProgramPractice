package com.java.assignment;

public class ValidatePinDemo {
	
	public static void main(String[] args) {
		String str = "11256r";
		
		System.out.println("Result==>"+validatePin(str));
		
		//validatePin(str);
	}

	private static int validatePin(String pin) {
		// TODO Auto-generated method stub
		
		int failedConditions = 0;

        // 1. Length check
        if (!(pin.length() == 4 || pin.length() == 6)) {
            failedConditions++;
        }
        
        if(!pin.matches("\\d+")) {
        	failedConditions++;
        	
        }
        
        //inserting integer value in integer array
        int[] digits = new int[pin.length()];
        
        for(int i=0; i<digits.length; i++) {
        	digits[i] = pin.charAt(i) - '0';
        }
        
        // 3. Duplicate check
        
        boolean seen[] = new boolean[10];
        boolean duplicateFound = false;
        
        for (int b : digits) {
			if(seen[b]) {
				duplicateFound = true;
				break;
			}
			seen[b] = true;
		}
        
        if (duplicateFound) {
            failedConditions++;
        }

        // 4 & 5. Ascending / Descending check
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != digits[i - 1] + 1) {
                ascending = false;
            }
            if (digits[i] != digits[i - 1] - 1) {
                descending = false;
            }
        }

        if (ascending || descending) {
            failedConditions++;
        }

        return failedConditions;
		
	}

}
