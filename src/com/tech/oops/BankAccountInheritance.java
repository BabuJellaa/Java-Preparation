package com.tech.oops;

import java.util.Scanner;

/*Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
Create a subclass called  SavingsAccount  that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.*/

class BankAccount{
	public BankAccount(long amount) {
		this.balanceAmount = amount;
	}
	long balanceAmount;
	
	public void deposit(int depositAmount) {
		balanceAmount+=depositAmount;
	}
	public void withdraw(int withdrawAmount) {
		if(withdrawAmount<balanceAmount) {
			balanceAmount-=withdrawAmount;
		}
		else {
			System.out.println("Withdrawal not possible because of insufficient balance...!!!\n Your account balance is : "+balanceAmount);
		}
	}
	public long getBalanceAmount() {
		return balanceAmount;
	}
}
class SavingsAccount extends BankAccount{

	public SavingsAccount(long amount) {
		super(amount);
	}
	@Override
	public void withdraw(int withdrawAmount) {
		if(getBalanceAmount()-withdrawAmount<100) {
			System.out.println("Balance should be minimum of 100/-.......!!!");
		}
		else {
			super.withdraw(withdrawAmount);
		}
	}
}

public class BankAccountInheritance {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please deposit some amount :");
		long depositAmount=scanner.nextLong();
		SavingsAccount account=new SavingsAccount(depositAmount);
		System.out.println("Please enter how much you want to withdraw from it..");
		int withdrawAmount=scanner.nextInt();
		account.withdraw(withdrawAmount);
		scanner.close();
	}
}
