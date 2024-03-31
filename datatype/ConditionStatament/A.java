package ConditionStatament;

import java.util.Scanner;

/*
 * 
 * Condition Statement
 * 1-if
 * 2-if else
 * 3-else if
 * 4-nested if
 * 5-Switch case
 * 
 * 1- if statement ===> it is used when we want to test a single condition.
 * 
 * 2- if else statement ===> it is used when we want to execute two statement 
 *                           for a single condition.
 * 
 * 3- else if ===> it is used when we have only one if block, multiple else if 
 *                 block and at the last else block.
 *                 
 * 4- nested if-else ===> when ever , we define if-else block inside another
 * 						  block called nested if-else.
 * 
 * 
 * */

public class A {
	public static void main(String[] args) {
		
		//if statement and if-else statement code
		
		/*
		 * int pwd; System.out.println("Enter the Password"); Scanner s = new
		 * Scanner(System.in); pwd=s.nextInt(); if(pwd==9105) {
		 * System.out.println("my name:= pradeep kumar");
		 * System.out.println("my phone:= 9105313503"); } else {
		 * System.out.println("this is wrong password"); }
		 */
		
		
		//if and else-if statement code
		
		/*
		 * int marks; System.out.println("Enter marks"); Scanner s = new
		 * Scanner(System.in); marks=s.nextInt();
		 * 
		 * if(marks>=60 && marks<=100) { System.out.println("First Division"); } else
		 * if(marks>=45 && marks<=60) { System.out.println("Second Division"); } else
		 * if(marks>=33 && marks<=45) { System.out.println("Third Division"); } else {
		 * System.out.println("Fail"); }
		 */
		
		
		int num1=20, num2=10,num3=45;
		
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Maximim Number:"+num1);
			}
			else
			{
				System.out.println("Maximim Number:"+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Maximim Number:"+num2);
			}
			else
			{
				System.out.println("Maximim Number:"+num3);
			}
			
		}
	}

	
	
}
