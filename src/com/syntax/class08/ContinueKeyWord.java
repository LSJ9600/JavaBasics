package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		
		for (int a=1; a<5; a++) {

			
			if (a==3) {
				continue;
			
			}			
			
			System.out.println(a);
            
           //continue keyword: continues to the next cycle. and usually used inside some type of conditions
			
			
			
	//print numbers 1-20 except 3,7,11
			
			 for (int i=1; i<=20; i++) {

		            if(i==3 || i==7 || i==11) {
		                continue;
		            }

		            System.out.print(i+" ");
		        }

	}

}}
