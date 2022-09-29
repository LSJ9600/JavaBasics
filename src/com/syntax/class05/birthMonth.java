package com.syntax.class05;

import java.util.Scanner;

public class birthMonth {

	public static void main(String[] args) {
			
		/*Write a program for user to enter his/hers birth month. Based on the month define the season.
			 * Example: if user is born in March, April, May → season =”Spring” 
			 * if user is born in June, July, August → 
			 * season =”Summer”  etc …
			 */
		
		Scanner month= new Scanner (System.in);
		System.out.println("Enter your birth month");
		int days= month.nextInt();
		
		if (days>=3 && days<=5)  {
			System.out.println("It is Spring");
		}else if (days>=6 && days<=8) {
			System.out.println("It is Summer");
		}else if (days>=9 && days<=11) {
			System.out.println("It is Fall");
		}else if (days>=12 && days<=2) {
			System.out.println("It is Winter");
		}
		
		
		
	}

}
