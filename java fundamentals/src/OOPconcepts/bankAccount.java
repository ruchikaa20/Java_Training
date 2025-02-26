package OOPconcepts;

public class bankAccount {
	private String accountHoldername;
	private String accountNumber;
	private double balance;
	
	public bankAccount() {
		
	}
	
	//constructor
	public bankAccount(String name, String accNo, double bal ) {
		this.accountHoldername = name;
		this.accountNumber = accNo;
		this.balance = bal;
	}
	
	//getter
	public String getaccountHoldername() {
		return accountHoldername;
	}
	public String getaccountNumber() {
		return accountNumber;
	}
	public Double getbalance() {
		return balance;
	}
	
	
	//setter
	public void setaccountHoldername(String name) {
		this.accountHoldername = name;
	}
	public void setaccountNumber(String accNum) {
		this.accountNumber = accNum;
	}
	public void setbalance(Double bal) {
		this.balance = bal;
		if(bal<=0) {
			System.out.println("balance should not be negative");
		}
	}
	
	
	//methods
	public void deposit(double amount) {
		if(amount >0 ) {
			balance += amount;
			System.out.println("Amount deposited: "+ amount);
			System.out.println("Balance after deposit: "+ balance);
		}
		else {
			System.out.println("Amount should be greater then 0");
		}
	}
	
	//method overloading concept
	// (...) -> mutliple input -> it is taken as a array
	
	public void deposit(double... amounts) {
		//check1, check2, check3......
		double totDeposit = 0;
		for(double amount : amounts) {
			if(amount > 0) {
				totDeposit += amount;
			}
			else {
				System.out.println("Amount should be greater then 0");
			}
		}
		balance += totDeposit;
		System.out.println("Balance after deposit: "+ balance);
	}
	
	public void transfer(double amount, bankAccount target) {
		if(amount <= 0) {
			System.out.println("Invalid amount");
		}
		else if(amount > balance) {
			System.out.println("Insufficient amount");
		}
		else {
			balance -=amount;
			target.deposit(amount);
			System.out.println("Amount of "+amount+ " is transferred to "+target.getaccountNumber());
		}
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Balance after withdrawal: "+ balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void checkBalance() {
		System.out.print("Account Number: "+ accountNumber );
		if(balance <= 0) {
			System.out.println("Minimum balance should be 500");
		}
		System.out.println(" has current balance:"+ balance);
		
	}
	
	
	
	public void details() {
		
		System.out.println("-------------------------------------------");
		System.out.println("Account Holder Name: "+ accountHoldername);
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Balance: "+ balance);
		
	}

}

