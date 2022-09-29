package com.syntax.class07;

public class CW3 {

	public static void main(String[] args) {
        // print 100 to 1 only odd numbers
        
		int a = 99;

        while (a >= 1) {
            System.out.print(a + " ");
            a-=2;
        }

        System.out.println("Another way");

        int b = 100;

        while (b >= 1) {

            if (b % 2 != 0) {
                System.out.print(b + " ");
            }

            b--;
        }

	}

}
