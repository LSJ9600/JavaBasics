package com.syntax.class04;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Please enter the name of your city.");
		
		String city=value.next();
		
		System.out.println("What is the temperature of your city in Fahrenheit?");
		
		double f=value.nextDouble();
		double c=(f-32)*5/9;
		
		
		System.out.println("The temperature in the city is " + c + " degree celcius.");

		
	}

}
