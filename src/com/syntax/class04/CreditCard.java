package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a credit card? Please enter yes or no");
		
		String card=scanner.next();
		
		if (card.equals("yes"))
		{ 
			System.out.println("What is the balance on your card?");
			
			
		double balance=scanner.nextDouble();
		if (balance>1000)
		{
			System.out.println("Please pay off immediately.");	
		}
		else 
		{
			System.out.println("You can spend more.");
		}
		
		}
		else
		{ 
			System.out.println("I would like to offer you to get a credit card.");
		}

	}

}
