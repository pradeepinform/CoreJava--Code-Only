package encapsulation;

import java.util.Scanner;

/*==========================================================================
 * Encapsulation
 * ===============================
 * Encapsulation is mechanism through which we can binding the data members
 * and member methods in a single unit.
 * =========================================================================
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */


public class Bank {
	
	private double bal=5000;
	private int pwd;
	
	public void deposite(double money)
	{
		System.out.println("Enter The Password:");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1232)
		{
			bal=bal+money;
			System.out.println("Deposited Money: "+money);
			System.out.println("Total Balance: "+bal);
		}
		else {
			System.out.println("Incorrect Password....");
		}
		
	}
	public void withdraw(double money)
	{
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1524)
		{
			bal=bal-money;
			System.out.println("Withdrawn Money: "+money);
			System.out.println("Total Balance:"+bal);
		}
		else {
			System.out.println("Incorrect password");
		}
	}
	
	public void checkBal()
	{
		System.out.println("Enter The Password");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==2314)
		{
			System.out.println("Total Balance:"+bal);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}

}
