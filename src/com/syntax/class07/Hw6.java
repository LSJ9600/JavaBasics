package com.syntax.class07;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		/* Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
		 * Keep asking to pay for coffee until the user enters the EXACT amount . 
		 * If the user gives more than coffee price --> ask them to give less, 
		 * if the user gives less money then ask to give more. 
		 * Once user give EXACT amount print “Please enjoy your coffee
		 */

	
		Scanner input=new Scanner (System.in);
		double coffee;
		
		do {
			System.out.println("Please pay for the coffee.");
			coffee=input.nextDouble();
			
		if (coffee<3) {System.out.println("Please give more");
		}else if (coffee>3) {System.out.println("Please give less");}
		
		} while (coffee!=3);
		
		System.out.println("Please enjoy your coffee");
		
		
		
		
	}

}
