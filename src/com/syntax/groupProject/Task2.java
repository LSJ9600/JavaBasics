package com.syntax.groupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. 
		// When an array is created, retrieve all values from it and 
		// while retrieving those values print capital for each country. (use 2 different loops).

		Scanner scan = new Scanner(System.in);
        
		System.out.println("How many countries would you like to enter?");
        int length=scan.nextInt();
       
        String countries[] = new String[length];
        String capitals[] = new String [length];

        scan.nextLine(); //to process the nextline
        
        for (int i = 0; i < length; i++) {
            
        	System.out.println("Please enter the country");
            countries[i] = scan.nextLine();
           
            System.out.println("Please enter the capital " +countries[i]);
            capitals[i] = scan.nextLine();
        }
        
        for (int i=0; i<length; i++) {
            System.out.println(" The capital of " +(countries[i] +" is " +(capitals[i])));

        }
        
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.toString(capitals));

	}
	
}

	

