package com.syntax.class05;

import java.util.Scanner;

public class dayOfWeek {

	public static void main(String[] args) {
		/*Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”
		 */

		Scanner day= new Scanner (System.in);
		System.out.println("What day of the week is it in numbers?");
		int days= day.nextInt();
		
		if (days==1 || days==2 || days==3 || days==4 || days==5)  {
			System.out.println("It is a weekday");
		}else if (days==6 || days==7) {
			System.out.println("It is a weekend");
		}else 
		{System.out.println("Invalid number");
		}
		
		
	}

}
