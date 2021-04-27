package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		upcasting();
		downcasting();
		withdrawFromSavingsAccount();
		withdrawFromBusinessAccount();
	}
	
	public static void upcasting() {
		
		Account accountTwo;
		Account accountOne = new Account(1001, "Alex", 0.0);
		Account accountThree = new BusinessAccount(1003, "John", 0.0, 200.0);
		Account accountFour = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		BusinessAccount businessAccountOne = new BusinessAccount(1002, "Mary", 0.0, 500.0);
		accountTwo = businessAccountOne;
		
		System.out.println("Account #1");
		System.out.println(accountOne);
		System.out.println();
		
		System.out.println("Business Account #1");
		System.out.println(businessAccountOne);
		System.out.println();
		
		System.out.println("Upcasting Business Account #1 to Account #2");
		System.out.println(accountTwo);
		System.out.println();
		
		System.out.println("Business Account #2 is an Account");
		System.out.println(accountThree);
		System.out.println();
		
		System.out.println("Savings Account #1 is an Account");
		System.out.println(accountFour);
		System.out.println();
	}
	
	public static void downcasting() {
		
		Account accountFive = new BusinessAccount(1005, "Barney", 0.0, 200.0);
		Account accountSix = new SavingsAccount(1006, "Frank", 0.0, 0.01);
		BusinessAccount businessAccountTwo = (BusinessAccount) accountFive;
		double loanAmountOne = 100.0;
		
		BusinessAccount businessAccountThree;
		SavingsAccount savingsAccountOne;
		double loanAmountTwo;
		
		System.out.println("Business Account #3 is an Account");
		System.out.println(accountFive);
		System.out.println();
		
		System.out.println("Downcasting Account #3 to Business Account #3");
		System.out.println(businessAccountTwo);
		System.out.println();
		
		System.out.println("Loaning $" + String.format("%.2f", loanAmountOne) + " to Business Account #3");
		businessAccountTwo.loan(100.0);
		System.out.println();
		
		System.out.println("Business Account #3");
		System.out.println(businessAccountTwo);
		System.out.println();
		
		System.out.println("Savings Account #2 is an Account");
		System.out.println(accountSix);
		System.out.println();
		
		if (accountSix instanceof BusinessAccount) {
			businessAccountThree = (BusinessAccount) accountSix;
			loanAmountTwo = 200.0;
			
			System.out.println("Downcasting Account #3 to Business Account #4");
			System.out.println(businessAccountThree);
			System.out.println();
			
			System.out.println("Loaning $" + String.format("%.2f", loanAmountTwo) + " to Business Account #4");
			businessAccountTwo.loan(100.0);
			System.out.println();
			
			System.out.println("Business Account #4");
			System.out.println(businessAccountThree);
			System.out.println();
		}
		
		if (accountSix instanceof SavingsAccount) {
			savingsAccountOne = (SavingsAccount) accountSix;
			
			System.out.println("Downcasting Account #3 to Savings Account #3");
			System.out.println(savingsAccountOne);
			System.out.println();
			
			savingsAccountOne.updateBalance();
			System.out.println("Updating Savings Account #3 balance");
			System.out.println(savingsAccountOne);
			System.out.println();
		}
	}
	
	public static void withdrawFromSavingsAccount() {
		
		Account accountSeven = new Account(1007, "Paul", 1000.0);
		Account accountEight = new SavingsAccount(1008, "George", 1000.0, 0.01);
		double withdrawOne = 200.0;
		
		System.out.println("Account #3");
		System.out.println(accountSeven);
		System.out.println();
		
		accountSeven.withdraw(withdrawOne);
		System.out.println("Withdrawing $" + withdrawOne + " from Account #3");
		System.out.println(accountSeven);
		System.out.println();
		
		System.out.println("Savings Account #3 is an Account");
		System.out.println(accountEight);
		System.out.println();
		
		accountEight.withdraw(withdrawOne);
		System.out.println("Withdrawing $" + withdrawOne + " from Savings Account #3");
		System.out.println(accountEight);
		System.out.println();
	}
	
	public static void withdrawFromBusinessAccount() {
		Account accountNine = new Account(1009, "Ringo", 1000.0);
		Account accountTen = new BusinessAccount(1010, "Mick", 1000.0, 2000.0);
		double withdrawOne = 200.0;
		
		System.out.println("Account #4");
		System.out.println(accountNine);
		System.out.println();
		
		accountNine.withdraw(withdrawOne);
		System.out.println("Withdrawing $" + withdrawOne + " from Account #4");
		System.out.println(accountNine);
		System.out.println();
		
		System.out.println("Business Account #5 is an Account");
		System.out.println(accountTen);
		System.out.println();
		
		accountTen.withdraw(withdrawOne);
		System.out.println("Withdrawing $" + withdrawOne + " from Business Account #5");
		System.out.println(accountTen);
		System.out.println();
	}
}
