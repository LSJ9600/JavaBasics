package com.syntax.class10;

public class EnhancedForLoopTwoDArray {

	public static void main(String[] args) {
		
		//printing all values from a 2D Array
		
		String[][] arr= {
                {"Yusuf","Hamza","Adam","John"},
                {"A","B","C","D"}
        };
        
		//regular for loop
		
		for(int i=0; i<arr.length; i++) {
            
			for (int j=0; j<arr[i].length; j++){
               
				System.out.print( arr[i][j]+ " ");
            }
			
				System.out.println();
        }
		

        //enhanced for loop
		
		for (String[] singleArray:arr) { //loops over 1D or single array
			
			for(String ele:singleArray) { //loops over each element of 1D Array
				
				System.out.print(ele + " ");
			}
			
				System.out.println();
		}
		
		
		
		
	}

}
