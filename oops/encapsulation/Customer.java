package encapsulation;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Bank b = new Bank();
		int ch;
		System.out.println("1. Deposite:");
		System.out.println("2. Withdraw:");
		System.out.println("3. checkBalance:");
		
		System.out.println("Enter Your choice:");
		Scanner s2 = new Scanner(System.in);
		
		ch = s2.nextInt();
		switch(ch)
		{
		   case 1: b.deposite(1000);
		   break;
		   
		   
		   case 2: b.withdraw(2000);
		   break;
		   
		   case 3: b.checkBal();
		   break;
		   
		   default:
			   System.out.println("Invalid choice:");
		}
	}

}
