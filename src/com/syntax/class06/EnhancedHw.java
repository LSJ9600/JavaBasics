package com.syntax.class06;

import java.util.Scanner;

public class EnhancedHw {

	public static void main(String[] args) {
		
		Scanner month= new Scanner (System.in);
		System.out.println("Enter your birth month");
		
		int days= month.nextInt();
		String season= null;
		
		if (days>=3 && days<=5)  {
			season = "Spring";
			
		}else if (days>=6 && days<=8) {
			season = "Summer";
			
		}else if (days>=9 && days<=11) {
			season = "Fall";
			
		}else if (days>=12 && days<=2) {
			season = "Winter";
			
		}else {
			System.out.println("Wrong number is entered");
			season = "Invalid";
		}
		{
			System.out.println(season);
		}
	}

}
