package com.syntax.review;

public class NestedIfVsLogicalAnd {

		public static void main(String[] args) {

	        boolean programmer=true;
	        boolean manualTester=true;
	        boolean knowFramework=true;

	        if(programmer&&manualTester&&knowFramework) {
	            System.out.print("You can be an automation engineer");
	        }
	        else
	        {
	            System.out.println("You must know a pgogramming language, manual testing and some framework"
	                    + "to be an automation engineer");
	        }

	        
System.out.println("-----------------------------------------------------------------------------------------------");
	        

    if(programmer) {
        if(manualTester) {

            if(knowFramework) {
                System.out.print("You can be an automation engineer");
            }else {
                System.out.println("You need to know a framework as well ");
            }
            }else {
                System.out.println("You need to know Manual testing as well");
            }
        }else {
            System.out.println("You need to be a programmer as well");
        }
    
    
    


	    }

	}

