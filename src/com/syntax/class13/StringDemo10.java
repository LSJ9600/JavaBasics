package com.syntax.class13;

import java.util.Arrays;

public class StringDemo10 {

	public static void main(String[] args) {
		
		
		String str = "Batch 14 is really good";
		String [] arr = str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[0]);

		
		System.out.println("****************************************");
		
		
		String str2="Today is Sunday. Sunday is good. Java is also good";
		String [] arr2 = str2.split("[.]"); // [] used to express individual character
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
