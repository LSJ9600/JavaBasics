package com.syntax.class06;

import java.util.Scanner;

public class CountryLanguage {
	
	//Ask user to enter their country and capture it. Once values are captured print which language user speaks.


	public static void main(String[] args) {
		
		Scanner out=new Scanner(System.in);
		System.out.println("Please enter you country you are from.");
		
		String country=out.nextLine();
		String language;
		
		switch (country) {
		
		case "USA":
			language= "English";
			break;
		case "China":
			language= "Chinese";
			break;
		case "Japan":
			language= "Japanese";
			break;
		case "Saudi Arabia":
			language= "Arabic";
			break;
		case "India": 
			language= "Urdu";
			break;
		default:
			language= "Unknown";
			break;
		}

		System.out.println("You are from "+ country+ " and the language you speak is " + language);
	}

	}


