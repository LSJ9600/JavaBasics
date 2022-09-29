package com.syntax.class04;

import java.util.Scanner;

public class DmvRepresentative {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Please enter your age.");
		
		int age=value.nextInt();
		
		if (age>=18)
		{ 
			System.out.println("We will issue a drivers licence.");
		}
		else 
		{
			System.out.println("Please get a learners permit.");

		}
		
	}

}
