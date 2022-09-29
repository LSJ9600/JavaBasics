package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		Scanner ask = new Scanner(System.in);
        String ans;

        do {
            System.out.println("Did you get a job?");
            ans = ask.nextLine();

    }while (!ans.equalsIgnoreCase("Yes"));
        
        System.out.println("Congratulations!!");

	}

}
