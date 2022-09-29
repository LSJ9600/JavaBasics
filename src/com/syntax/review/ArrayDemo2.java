package com.syntax.review;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
	       String [] dresses=new String[] {"Pink Dress","cocktail","Summer Dress","Night Dress"
	                ,"Pencil Dress"};
		    //length of array
	        System.out.println(dresses.length);

	        //regular for loop to print value-mostly used
	        for(int i=0;i<dresses.length;i++) {
	            System.out.println("Lets try "+dresses[i]);
	        }

	        //enhanced for loop to get all value
	        for (String dress:dresses) {
	        	System.out.println(dress);
	        }
	        
	        //works for all arrays char int string to print all elements without a loop
	        //you will also have to import the Array for it to work
	        System.out.println(Arrays.toString(dresses));
	}

}
