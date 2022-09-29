package com.syntax.class05;

import java.util.Scanner;

public class currentTime {

	public static void main(String[] args) {
		/*Write a program that will ask user to input inputs the current time (use 24 hour format).
		 * Based on the given time define:
		 * if hour is between 1-11 --> Morning
		 * if hour between 12-15 --> Afternoon
		 * if hour between 16-20 --> Evening
		 * if hour between 21-24 --> Night
		 */
		
		Scanner time=new Scanner (System.in);
		System.out.println("Please input the current time (use 24 hour format)");
		int current=time.nextInt();
		
		if (current>=1 && current<=11) {
			System.out.println("It is Morning");
		}else if (current>=12 && current<=15) {
			System.out.println("It is Afternoon");
		}else if (current>=16 && current<=20) {
			System.out.println("It is Evening");
		}else if (current>=21 && current<=24) {
			System.out.println("It is Night");
		}
		
		
		
	}

}
