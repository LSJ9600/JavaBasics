package com.syntax.class04;

import java.util.Scanner;

public class BooleanValue {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you get a diploma?" + " Please enter True or False.");
		
		boolean diploma=scanner.nextBoolean();
		
		if (diploma)
		{ 
			System.out.println("Congratulations!");
			System.out.println("What is you GPA score?");
			
		double gpa=scanner.nextDouble();
			
			
		if (gpa>=3.5)
		{
			System.out.println("You are eligible for scholarship.");
			
		}
		else 
		{
			System.out.println("You should have studied harder.");
		}
		
		}
		else
		{ 
			System.out.println("You should get a degree.");
			
		}
		
		}


}
