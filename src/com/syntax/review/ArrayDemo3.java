package com.syntax.review;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// create an array to say the price of each dress and the total amount of all dresses.
		
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Please enter the number of dresses you want to buy");
		int noOfdresses=scanner.nextInt();
		
		double [] prices=new double [noOfdresses];
		
		for (int i=0; i<noOfdresses; i++) {
			System.out.println("Please enter the price of dress no " + (i+1));
			prices[i]=scanner.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		
		/*Limitations of enhanced loop
		 * we can only go in one direction
		 * we can't skip the elements
		 * we can't use enhanced loop to update  the elements in an array
		 * we can only use it to access the elements
		 */
		
		double sum=0;
		for (double price: prices) {
			sum+=price;
		}
		System.out.println("Total prices of all the dresses is " + sum);
		
	}
	
}
