package com.syntax.class10;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		
		String[][] countries= {
                {"Usa", "Canada"}, //1 array with index 0
                {"Peru", "Brazil", "Colombia", "Ecuador"}, //2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany", "Turkiye", "Moldova", "Ukraine"},
                {"Kazakhstan", "Afghanistan", "Korea"}
        };
		
		//getting the value of each row
		
	    System.out.println(countries.length); // 5 - total # of arrays or rows
       
	    int elementOf1Array = countries[0].length;
        System.out.println("# of elements from 1 Array: "+elementOf1Array);// 2

        int elementOf2Array = countries[1].length;
        System.out.println("# of elements from 2 Array: "+elementOf2Array);// 4
       

        
        //Getting all values for 2D Arrays
       
        for(int r =0; r<countries.length; r++) { // loops over rows
            for(int c=0; c<countries[r].length; c++) {
                System.out.print(countries[r][c]+" ");
            }
            System.out.println();
        }

        
        
        
        // to print something specific
        
        for (String[] country : countries) {

            for (String c : country) {

                if (c.equals("Kazakhstan")) {
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
            }
            System.out.println();
        }
        
        
        
        //enhanced for loop to print all value of 2D Array
        
        for (String[] country:countries) {
        	
        	for (String c:country) {
        		
        		System.out.print(c + " ");
        	}
        		System.out.println();
        }
        
        }
		
}
