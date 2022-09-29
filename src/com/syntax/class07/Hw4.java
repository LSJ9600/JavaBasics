package com.syntax.class07;

public class Hw4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		int a = 51;

        while (a >= 20) {
            System.out.print(a + " ");
            a-=2;
        }

        System.out.println("Another way");

        int b = 50;

        while (b >= 20) {

            if (b % 2 != 0) {
                System.out.print(b + " ");
            }

            b--;
        }

	}

}
