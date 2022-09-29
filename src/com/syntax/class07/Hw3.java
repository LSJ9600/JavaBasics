package com.syntax.class07;

public class Hw3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		
		 int a=0;
	        
	        while(a<20) {
	            a+=2;
	       
	            System.out.print(a+" ");}


	        System.out.println("Another way");

	        int i = 0;

	        while (i <= 20) {

	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }

	            i++;
	        }
	        
	}
	}