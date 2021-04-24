package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Account account;
		String holder;
		double initialDeposit;
		char hasInitialDeposit;
		int number;
		
		System.out.println("Bank Account Manager");
		System.out.println("=========================================");
		
		System.out.print("Account Number: ");
		number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Holder Name: ");
		holder = scanner.nextLine();
		
		System.out.println("Is there any initial deposit? (y/n)");
		hasInitialDeposit = scanner.next().charAt(0);
		
		if (hasInitialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = scanner.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.print(account);
		
		System.out.println();
		System.out.println("Enter a deposit value:");
		System.out.print("> ");
		account.deposit(scanner.nextDouble());
		
		System.out.println();
		System.out.println("Updated Account Data:");
		System.out.print(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		System.out.print("> ");
		account.withdraw(scanner.nextDouble());
		
		System.out.println();
		System.out.println("Updated Account Data:");
		System.out.print(account);
		
		scanner.close();
	}
}
