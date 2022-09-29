package com.syntax.class08;

public class MilitaryClockHw {

	public static void main(String[] args) {
		// Create a digital clock using nested loops
		//If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes
		
		for (int h=00; h<24; h++) {
			for (int m=00; m<60; m++) {
				System.out.println(h + ":" + m );
			}
		}

	}

}
