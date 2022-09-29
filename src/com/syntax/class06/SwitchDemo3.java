package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		/*we need to ask a user where he/she is from
		 * based on the country we need to define favorite food
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		
		String country=in.nextLine();
		String favoriteFood;
		
		switch (country) {
		
		case "USA":
			favoriteFood= "burgers and fries";
			break;
		case "Kazakhstan":
			favoriteFood= "beshparmak";
			break;
		case "Turkey":
			favoriteFood= "adana kebab";
			break;
		case "Venezuela":
			favoriteFood= "arepa";
			break;
		case "India": 
			favoriteFood= "Chicken curry";
			break;
		case "Yemen":
			favoriteFood= "mandi";
			break;
		case "Afghanistan":
			favoriteFood="Qaboli Pulao";
		default:
			favoriteFood= "Unknown";
			break;
		}

		System.out.println("You are from "+ country+ " and your favorite food is " + favoriteFood);
	}

}
