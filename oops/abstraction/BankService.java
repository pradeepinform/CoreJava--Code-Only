package abstraction;

import java.util.Scanner;

public class BankService extends Bank{
	
	private double bal=5000;
	private int pwd;
	public double money;

	@Override
	void Deposite() {
		// TODO Auto-generated method stub
		System.out.println("Enter Password:");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1245)
		{
			System.out.println("Enter Deposite Amount:");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Deposited Money:"+money);
			System.out.println("Total Balance:"+bal);
		}
		else {
			System.out.println("Invelid Password");
		}
		
	}

	@Override
	void Withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Password:");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==2131)
		{
			System.out.println("Enter Widthraw Amount:");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("Withdraw Money:"+money);
			System.out.println("Total Balance:"+bal);
		}
		else {
			System.out.println("Incorrect Password");
		}
		
	}

	@Override
	void ceckBal() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Password:");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==2131)
		{
			System.out.println("Total Balance:"+bal);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}

}
