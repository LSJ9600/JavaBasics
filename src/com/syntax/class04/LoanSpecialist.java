package com.syntax.class04;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Please enter the amount of loan needed.");
		
		int loan=value.nextInt();
		
		if (loan<=200000)
		{ 
			System.out.println("We will lend you the money.");
		}
		else 
		{
			System.out.println("You are rejected.");

		}
		
	}

}
