package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Olena";
        String lastName="Dudka";
        
        System.out.println(firstName+lastName); // Mostly this is used
        System.out.println(firstName.concat(" ").concat(lastName));
        
        String str= " ";
        
        System.out.println(str.isEmpty()); //includes spaces and anything in colon
        //System.out.println(str.isBlank()); //does not include spaces
        
        
	}

}
