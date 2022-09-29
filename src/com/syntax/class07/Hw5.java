package com.syntax.class07;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...
		
		Scanner input= new Scanner (System.in);
		String name=null;
		
		for (int i = 1; i <= 3; i++) {

            System.out.println("What is your name?");
            name=input.nextLine();
            

	} System.out.println("Good afternoon "+ name);

	}}
