package com.syntax.class13;

public class Task5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true Abbc =>false

		//reverse equals to word is palidrome
		
		String a="Java";
		
		String wordReverse= " ";
		
		for (int i=a.length()-1; i>=0; i--) {
			
			wordReverse+=a.charAt(i); 
		}
		
		if (a.equalsIgnoreCase(wordReverse)) {
			
			System.out.println("Word is palindrome");
		
		}else {
			
			System.out.println("Word in not palindrome");
		}
		
	}

}
