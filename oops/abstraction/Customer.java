package abstraction;

import java.util.Scanner;

public class Customer {
	
	public static void main(String[] args) {
		BankService bank=new BankService();
		
		bank.bankDetail();
		int ch;
		System.out.println("1.Deposite:");
		System.out.println("2.Withdraw:");
		System.out.println("3.checkBalance:");
		
		System.out.println("Enter the choice:");
		Scanner s2 = new Scanner(System.in);
		
		ch= s2.nextInt();
		
		switch(ch)
		{
			case 1: bank.Deposite();
			break;
			
			case 2: bank.Withdraw();
			break;
			
			case 3: bank.ceckBal();
			break;
			
			default:
				System.out.println("Invalid Choice:");
		}
		
	}
	
}
