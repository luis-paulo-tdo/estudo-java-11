package entities;

public class Account {
	
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Number: " + number + "\n");
		stringBuilder.append("Holder: " + holder + "\n");
		stringBuilder.append("Balance: $" + String.format("%.2f", balance));
		return stringBuilder.toString();
	}
}
