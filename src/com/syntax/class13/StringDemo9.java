package com.syntax.class13;

public class StringDemo9 {

	public static void main(String[] args) {
		
		// to print the index of a repeated specific letter
			String str="Thor love and thunder";
			
			for (int i=0; i<str.length(); i++) {
				
				if (str.charAt(i)=='o') {
					
					System.out.println(i);
				}
				
			}

	}

}
