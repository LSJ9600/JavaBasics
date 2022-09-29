package com.syntax.class04;

import java.util.Scanner;

public class MortgageRate {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Please enter the mortgage rate.");
		
		double rate=value.nextDouble();
		
		if (rate>4.5)
		{ 
			System.out.println("Will not buy a house.");
		}
		else 
		{
			System.out.println("Will consider buying a house");
			System.out.println("Please enter the mortgage price.");
		}
		int mortgage=value.nextInt();
	
		if (mortgage>200000)
		{
			System.out.println("Will take a loan.");
		}
		else
		{ 
			System.out.println("Will pay with cash.");	
		}

	}

}
