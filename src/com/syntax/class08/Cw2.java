package com.syntax.class08;

import java.util.Scanner;

public class Cw2 {

	public static void main(String[] args) {
		/* Create a secret number and let user guess the number
		 * once user guessed your number --> program should say You won!
		 */

		int a=7;
		
		Scanner input=new Scanner (System.in);
		int number;
		
		do {
			System.out.println("Please guess my secret number.");
			number=input.nextInt();
			
		} while (number!=7);
		
		System.out.println("You won!");
		
		
	

}}
