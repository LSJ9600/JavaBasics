package com.syntax.groupProject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Using Scanner create an array of integer values. After the array is created, 
		//calculate the sum of all stored elements in that array.

		
		Scanner input=new Scanner(System.in);
        
		System.out.println("Input numbers of elements");
        int n=input.nextInt();
        int[]array=new int[n];
        
        System.out.println("Enter elements");

        for(int i=0;i<n;i++) {
            array[i]=input.nextInt();
        }
        
        int sum=0;
        
        for(int value:array) {
        sum+=value;
        
        }    System.out.println("The sum of the elements you entered is "+ sum);
        
		}
	
    }


	


