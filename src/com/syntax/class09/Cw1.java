package com.syntax.class09;

public class Cw1 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		//WAY ONE
		
					char[] grade= {'A', 'B', 'C', 'D'};
		
					System.out.println(grade[1]);

		//WAY TWO
		
					char [] arr = new char[4];
		
					arr[0]='A';
					arr[1]='B';
					arr[2]='C';
					arr[3]='D';
	     
					System.out.println(arr[1]);
	     
	     
	}

}
