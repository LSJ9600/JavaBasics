package com.syntax.class02;

public class NonPrimitivesDataType {

	public static void main(String[] args) {
		
		// string is just one example of many non primitive data types
		
		String name="Asma";
		String address="123 address street";
		String number= "123 456 7890";
		String character= "a";
		int age=17;
		//String age="17"; //anything you put inside "" -> becomes a String
		
		//type syso + control + space -> auto completes the statement 
		
		System.out.println(name);
		
		// String Concatenation when adding 2 string together "My name is" + "Asma"
		
		System.out.println("My name is "+ name);
		
		//Asma is 17
		System.out.println(name + " is " +age );
		
		String fruit= "apple";
		double price = 1.99;
				
		// The price of the apple is 1.99
				
		System.out.println("The price of the " + fruit + " is " + price);
		
		fruit="mango";
		price=5.99;
		 
		System.out.println("The price of the " + fruit + " is " + price);
		
		//The price of the mango is 5.99
		
		
		/*to attach value (int, double, boolea, char, String etc)
		 * to a String we use + 
		 * + next to the String acts as a Concatenation
		 */
		
		
		
	}

}
