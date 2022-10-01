package com.syntax.review;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		// how would you reverse a String without using reverse function?
		
				/* 1. use StringBuilder and reverse method
				 * 2. use charAt();
				 * 3. use toCharArray(); -. HW
				 */
				
			// way 2
				String str="hello";
				String newString="";
				
				for(int i=str.length()-1; i>=0; i--) {
					
					newString=newString+str.charAt(i);
				}
				
				System.out.println(newString);
				
				System.out.println("********************************");
				
			// way 1	
				String s="Class is almost over";
				StringBuilder sb=new StringBuilder(s);
				sb.reverse();
				
				System.out.println(sb);
				
				System.out.println("********************************");
				
			// way 3
				String name1 = "Hello world";
		        char[] array = name1.toCharArray();
		        String Reverse=" ";
		        
		        for(int i=array.length-1; i>=0; i--){
		            Reverse+=array[i];

		        }
		        System.out.println(Reverse);

	}

}
