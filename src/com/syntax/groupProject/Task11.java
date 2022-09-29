package com.syntax.groupProject;

public class Task11 {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings?
		
		String [] words= {"Ali", "Ayesha", "Maxim", "Rimma", "Lubna", "Serhii", "Tatiana", "Ugur", "Lubna", "Ayesha", "Ugur"};

		for(int i=0; i<words.length; i++) {
			
			for (int j=i+1; j<words.length;j++) {
				
				if(words[i].equals(words[j])) {
						
					System.out.println(words[i] +" is duplicated in the array");}
			
		 }
	    }
	   }
	}