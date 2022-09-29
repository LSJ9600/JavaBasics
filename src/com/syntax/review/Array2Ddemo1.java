package com.syntax.review;

public class Array2Ddemo1 {

	public static void main(String[] args) {
		
		String [] individualsInRoom1= new String [] {"Sabej", "Shah", "Hassan"};
		String [] individualsInRoom2= new String [] {"Roman", "Mina"};
		String [] individualsInRoom3= new String [] {"Asad", "Priyasri", "Ali"};
		
		// a 2D array that will store 3 single arrays
		String [] [] rooms= new String [3] [];
		
		rooms [0]=individualsInRoom1;
		rooms [1]=individualsInRoom2;
		rooms [2]=individualsInRoom3;
		
		System.out.println(rooms[1][1]);
	}

}
