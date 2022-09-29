package com.syntax.class08;

public class Cw1 {

	public static void main(String[] args) {
		// From the range from 1-50 please find the sum of all even number and all odd number
		
		int odd=0;
		int even=0;

		for (int i=1; i<=50; i++) 
		
		{ if (i%2==0) 
		
			{even=i+even;
			
			} else 
				
			{ 	odd=i+odd;
		  	
		  	}
			
		
	} System.out.println("Sum of even numbers " + even);
	  System.out.println("Sum of odd numbers " + odd);

}
}
