package com.syntax.class11;

public class DogHw {
		//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	String name;
	String color;
	String breed;
	double weight;
	int age;
	

	void play() {
		System.out.println(name +" is playing catch.");
	}
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
	void bark() {
		System.out.println(name + " is barking.");
	}
	
	public static void main (String[] args) {
			
		DogHw dog1=new DogHw();
		dog1.name="Tommy";
		dog1.color="white";
		dog1.breed="Husky";
		dog1.age=10;
		dog1.weight=25;
		dog1.bark();

		DogHw dog2 = new DogHw();
		dog2.name="Chloe";
		dog2.color="black";
		dog2.breed="Bulldog";
		dog2.age=12;
		dog2.weight=30;
	    dog2.sleep();
	
		DogHw dog3=new DogHw();
		dog3.name="Jimmy";
		dog3.color="brown";
		dog3.breed="Labrador";
		dog3.age=13;
		dog3.weight=20;
		dog3.play();
	}
}
