package com.syntax.class09;

public class EnhancedLoop {

	public static void main(String[] args) {
	      // only when we deal with arrays or collections
        // we can use for each loop, enhanced for loop, advanced for loop

        String[] iceCream = { "vanilla", "chocolate", "pistashio", "kulfi", "mango" };

        for (String flavor : iceCream) {
            System.out.println(flavor);
        }

        System.out.println(" --------------------------------  ");

        char[] letters = { 'A', 'B', 'C', 'D' };

        for (char letter : letters) {

            System.out.print(letter + "  ");
        }

        System.out.println(" --------------------------------  ");

        int[] numbers = { 12, 56, 345, 1, 0, 9 };
        //get all elements using regular for loop

        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
        //get all values using enhanced for loop
        // this loop always loops ONLY 1 way : from start till end
        for(int num:numbers) {
            System.out.print(num+" ");
        }
    }
}

