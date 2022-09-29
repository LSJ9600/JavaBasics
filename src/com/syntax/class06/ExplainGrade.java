package com.syntax.class06;

import java.util.Scanner;

public class ExplainGrade {

	public static void main(String[] args) {
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner out=new Scanner(System.in);
		System.out.println("Please enter your grade in a letter format.");
		
		char grade=out.next().charAt(0);
		String answer;

	        switch(grade) {
	        
	        case 'A':
	            answer="Excellent";
	            break;
	        case 'B':
	            answer="Good";
	            break;
	        case 'C':
	            answer="Average";
	            break;
	        case 'D':
	            answer="Bad";
	            break;
	        case 'F':
	            answer="Not Pass";
	            break;
	        default:
	            answer="Not Acceptable";
	            break;
	        }
	        
	        System.out.println("Your got a grade "+ grade + " which means you did " + answer);

	    }
		
		
		
	}


