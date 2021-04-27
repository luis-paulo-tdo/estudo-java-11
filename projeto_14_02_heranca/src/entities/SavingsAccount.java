package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Number: " + number + "\n");
		stringBuilder.append("Holder: " + holder + "\n");
		stringBuilder.append("Balance: $" + String.format("%.2f", balance) + "\n");
		stringBuilder.append("Interest Rate: " + String.format("%.2f", interestRate) + "%");
		return stringBuilder.toString();
	}
}
