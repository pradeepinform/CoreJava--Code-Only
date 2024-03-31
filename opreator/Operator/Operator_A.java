package Operator;

import java.util.Scanner;

public class Operator_A {
	
	/*
	 * Operator ===> operator is a symbol that is used, to perform operations according to user 
	 * 				 requirement. 
	 * 
	 * 1- Arithmetic operator ===> (+,-,*,/,%)
	 * 2- Relational operator ===> (==, !=, >,<,<=,>=)
	 * 3- Logical Operator ===> (&& ,||, !)
	 * 
	 * */

	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.println("Enter the Number:");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Any choice Number:");
		ch=s.nextInt();
		switch (ch)
		{
		 		case 1:c=a+b;
		 		System.out.println("Addition = "+c);
		 		break;
		 		
		 		case 2:c=a*b;
		 		System.out.println("Multiply = "+c);
		 		break;
		 		
		 		case 3: c=a-b;
		 		System.out.println("Substrection = "+c);
		 		break;
		 		
		 		case 4:c=a/b;
		 		System.out.println("Division = "+c);
		 		break;
		 		
		 		default:
		 			System.out.println("No values");
		}
	}
}
