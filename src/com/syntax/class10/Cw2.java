package com.syntax.class10;

public class Cw2 {

	public static void main(String[] args) {
		// Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades. 
		//Then your program should print name of the students that has A and B grade
		
		String[][] result = {{"Smith","John","Jackson","Obama"},
                				{"A","B","C","D"}  };
		
        System.out.println(result[0][0]+" has got '"+result[1][0]+"' grade.");
        System.out.println(result[0][1]+" has got '"+result[1][1]+"' grade. ");
        System.out.println(result[0][2]+" has got '"+result[1][2]+"' grade. ");
        System.out.println(result[0][3]+" has got '"+result[1][3]+"' grade. ");
		
		
		
        for(int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++){
                System.out.print( result[i][j]+ "  ");
             }
            System.out.println();
        }
        
		
		
		
		
		
		
		
		

	}

}
