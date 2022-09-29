package com.syntax.class11;

public class PhoneHw {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
	String make;
	String model;
	String color;
	int storage;
	boolean cheap;
	double size;
	
	void call() {
		System.out.println(model + " calling someone special");
	}
	void takePicture() {
		System.out.println(model + " taking pictures of our family");
	}
	void recording() {
		System.out.println(model + " recording classes");
	}
	
	public static void main(String[]args) {
		
		PhoneHw iphone=new PhoneHw();
		iphone.make="Apple";
		iphone.model="Iphone 14 Pro Max";
		iphone.color="Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		iphone.call();
		
		PhoneHw samsung=new PhoneHw();
		samsung.make="Samsung";
		samsung.model="S22 Ultra";
		samsung.color="Grey";
		samsung.storage=256;
		samsung.size=6.7;
		samsung.cheap=false;
		samsung.takePicture();
		
		PhoneHw pixcel=new PhoneHw();
		pixcel.make="Google";
		pixcel.model="Google Pixcel 7 Pro";
		pixcel.color="Obsidian";
		pixcel.storage=128;
		pixcel.size=6.4;
		pixcel.cheap=false;
		pixcel.recording();
		
	}
}
