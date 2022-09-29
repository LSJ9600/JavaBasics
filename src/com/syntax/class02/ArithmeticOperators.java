package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// +, -, *, /, %
		//% is used for remainder - modulus operator
		
		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c=10;
		int d=3;
		
		int sum= c+d; //13
		int sub=c-d; //7
		int div=c/d; //3
		int rem=c%d; //1
		
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(rem);
		
		int e=10;
		int f=5;
		
		System.out.println("division = " + e/f); //2
		System.out.println("remainder = " + e%f); //0
		
		
		double num1=10.0;
		double num2=3.0;
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		
		float number1=10.0F;
		float number2=3.0F;
		
		System.out.println(number1/number2);
		
		
		
		
		
	}

}
