package com.syntax.class09;

public class Hw1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

		String[] car= {"BMW", "Mercedes-Benz", "Nissan", "Toyota", "Ford", "Audi"};
		
		// Regular loop
		
		for(int i=0; i<car.length; i++) {
            System.out.print(car[i] + " ");
        }
		
		System.out.println(" ");
		
		// Enhanced Loop
		
		 for(String build:car) {
	            System.out.print(build + " ");
	}

}
}
