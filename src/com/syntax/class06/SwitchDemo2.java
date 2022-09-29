package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
        // matching cases must be of the same data type as a variable in switch
        // no duplicated case in switch
		/*  Limitations of SWITCH CASE:
		 * -they can not use logical operators
		 * -they can not use relational operators
		 * -they can not work with boolean values
		 * -they can not work with float/double and long data types
		 */

        char choice='Y';
        String answer;

        switch(choice) {
        case 'Y':
            answer="Yes";
            break;
        case 'N':
            answer="No";
            break;
        case 'M':
            answer="Maybe";
            break;
        default:
            answer="Unkown";
            break;
        }
        
        System.out.println(answer);

    }
}
