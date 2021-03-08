
public class BankAccount {

	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber, double balance) {
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
	}
	public BankAccount() {
		this(1,0);
	}
	
	//getters
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	
	//setters
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//toString
	public String toString() {
		return ("The account number is " + accountNumber + " and the balance is " + balance);
	}
}
