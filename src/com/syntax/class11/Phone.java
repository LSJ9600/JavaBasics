package com.syntax.class11;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	boolean cheap;
	double size;
	
	void call() {
		System.out.println("calling......");
	}
	void takePicture() {
		System.out.println("Taking pictures");
	}
	
	public static void main(String[]args) {
		
		// this is how you create an object in a class---> Nameofclass Variablename= new Nameofclass();
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 14 Pro Max";
		iphone.color="Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		
		System.out.println("Make " + iphone.make + " Model " + iphone.model);
		iphone.call();
		
		System.out.println("*****************************************");
		
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 Ultra";
		samsung.color="Grey";
		samsung.storage=256;
		samsung.size=6.7;
		samsung.cheap=false;
		
		System.out.println(iphone.make);
		
		System.out.println(samsung.make);
		
	}
	
}
