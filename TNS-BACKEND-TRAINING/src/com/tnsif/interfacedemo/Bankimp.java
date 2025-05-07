package com.tnsif.interfacedemo;

public class Bankimp implements Bank{
	int balance=1500;

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if(amount>0&&amount<balance) {
			balance+=amount;
			System.out.println("the balance after deposit"+balance);		}
		else {
			System.err.println("invalid");
		
		
	}

		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount>0&&amount<balance) {
			balance-=amount;
			System.out.println("the balance after after withdraw"+balance);		}
		else {
			System.err.println("insufiiicent balance");
		
		
	}
		
	}
	

}
