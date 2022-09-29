package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		
		// Outer loop: controls inner loop
		for (int i=1; i<3; i++) {

            System.out.println("Hello");
            
        // inner loop: depends on outer loop
            for (int j=1; j<=3; j++) {

                System.out.println("Bye");
		}
	}
		   
		System.out.println(" -----------------------------  ");

	       
			for(int i=0; i<=2; i++) {

	            for(int j=1; j<4; j++) {

	                System.out.println(i+" "+j);

	            }
	        }

	        System.out.println("End of the code");
	    }
	}

