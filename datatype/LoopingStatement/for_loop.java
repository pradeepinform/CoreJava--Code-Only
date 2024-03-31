package LoopingStatement;

import java.util.Scanner;

/*
 * 
 * Loop ===> whenever we want to repeat certain statement several times then we should
 * 			 write those statement inside loop body.
 * 
 * syntax
 * 
 * for(initialization; condition; incr/decr)
 * {
 * 
 *        code
 * }
 * 
 * 
 * 
 * 
 * */

public class for_loop {
	
	public static void main(String[] args) {
		
		//for loop
		
		/*int num;
		System.out.println("Enter Number:");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}
		*/
		
		
		
		//while loop
		
		
		/*int num;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		while(num>=0)
		{
			if(num%2==0)
			{
				System.out.println("Even Number");
				break;
			}
			else {
				System.out.println("Odd Number");
				break;
			}
		}
		//System.out.println("while loop ended");
		 
		 */
		
		
		//do-while loop
		
		int num;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		do 
		{
			System.out.println(num);
			++num;
		}
		while (num<=10);
		
		 
	}

}
