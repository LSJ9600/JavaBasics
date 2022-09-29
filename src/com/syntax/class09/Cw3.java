package com.syntax.class09;

public class Cw3 {

	public static void main(String[] args) {
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.

		
		//WAY ONE
		
					String[] word= {"Java", "Saturday", "Day", "coding", "is"};
		
					System.out.println(word[1]+" "+ word[4]+" "+ word[0]+" "+ word[3]+" "+ word[2]);

		//WAY TWO
		
					String [] arr = new String[5];
		
					arr[0]="Java";
					arr[1]="Saturday";
					arr[2]="Day";
					arr[3]="coding";
					arr[4]="is";
	     
					System.out.println(word[1]+" "+ word[4]+" "+ word[0]+" "+ word[3]+" "+ word[2]);

		
		
		
		
		
	}

}
