package OOPconcepts;
import java.util.Scanner;

public class bankApplication {
	private static bankAccount[] accounts;  //created an array
	
	private static int totalAccounts = 0;
	private static int maxAccounts = 5;
	
	public static void createAccount(Scanner sc) {
		if(totalAccounts > maxAccounts) {
			System.out.println("Cannot create more accounts");
			return;
		}
		System.out.println("Enter account Holder name: ");
		String accountName = sc.nextLine();
		
		System.out.println("Enter account No: ");
		String accountNo = sc.nextLine();
		
		System.out.println("Enter intial amount: ");
		double accountBalance = sc.nextDouble();
		sc.nextLine();
		
		
		System.out.println("Enter account type: ");
		
		System.out.println("Press 1: Current bank account");
		System.out.println("Press 2: Saving bank account");
		System.out.println("Press 3: Premium saving bank account");
		System.out.println("Press 4: Demat bank account");
		
		int accountType = sc.nextInt();
		
		switch(accountType) {
		case 1:
			accounts[totalAccounts] = new bankAccount(accountName, accountNo, accountBalance);
			System.out.println("Account created Successfully !");
			totalAccounts++;
			break;
		
		case 2:
			System.out.println("Enter Interest rate:");
			double interestRate = sc.nextDouble();
			
			System.out.println("Enter minimum no of years you want to keep your money:");
			int time = sc.nextInt(); 
			accounts[totalAccounts] = new savingBankAccount(accountName, accountNo, accountBalance, interestRate, time);
			totalAccounts++;
			break;
			 
		case 3:
			System.out.println("Enter Interest rate:");
			double interestRate1 = sc.nextDouble();
			
			System.out.println("Enter minimum no of years you want to keep your money:");
			int time1 = sc.nextInt(); 
			
			System.out.println("Enter Bonus Interest rate:");
			double bonusInterestRate = sc.nextDouble();
			
			System.out.println("Enter minimum no of years you want to keep your money:");
			int Btime = sc.nextInt(); 
			accounts[totalAccounts] = new premiumSavingAccount(accountName, accountNo, accountBalance, interestRate1, time1, bonusInterestRate, Btime);
			totalAccounts++;
			break;
			
		case 4:
			System.out.println("Enter current stock holdings :");
			int stockHoldings = sc.nextInt(); 
			accounts[totalAccounts] = new dematAccount(accountName, accountNo, accountBalance, stockHoldings);
			totalAccounts++;
			break;
			
		default :
			System.out.println("Invalid choice, Enter from 1-4");
			
		}
		
	}
	
	public static void displayAllAccount() {
		if(totalAccounts == 0) {
			System.out.println("No Account Available");
			return;
		}
		for(int i=0; i<totalAccounts; i++) {
			accounts[i].details();
		}
	}
	
	public static bankAccount findAccount(String accountNumber) {
		for(int i=0; i<totalAccounts; i++) {
			if(accounts[i].getaccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	
	public static void depositMoney(Scanner sc) {
		System.out.println("Enter account No: ");
		String accNum = sc.nextLine();
		bankAccount account = findAccount(accNum);
		if(account != null) {
			System.out.println("Enter no of deposit amounts: ");
			int numDeposit = sc.nextInt();
			double[] amounts = new double[numDeposit];
			System.out.println("Enter deposit amounts: ");
			for(int i=0; i<numDeposit; i++) {
				amounts[i]=sc.nextDouble();
			}
			account.deposit(amounts);	
		}
		else {
			System.out.println("Account not found ");
		}	
	}

	
	public static void withdrawMoney(Scanner sc) {
		System.out.println("Enter account No: ");
		String accNum = sc.nextLine();
		
		System.out.println("Enter amount to be withdrawn: ");
		double amount = sc.nextDouble();
		
		bankAccount account = findAccount(accNum);
		if(account != null) {
			account.withdraw(amount);
		}
		else {
			System.out.println("Account not found ");
		}
	}
	
	public static void transferMoney(Scanner sc) {
		System.out.println("Enter your account no: ");
		String acc1 = sc.nextLine();
		
		System.out.println("Enter account no to transfer money: ");
		String acc2 = sc.nextLine();
		
		System.out.println("Enter amount to be transferred: ");
		double amount = sc.nextDouble();
		
		bankAccount sender = findAccount(acc1);
		bankAccount reciever = findAccount(acc2);
		
		if(sender != null && reciever != null) {
			sender.withdraw(amount);
			reciever.deposit(amount);
		}
		else if(sender == null) {
			System.out.println("Sender account not found ");
		}
		else if(reciever == null) {
			System.out.println("reciever account not found ");
		}
		else {
			System.out.println("Invalid Account no");
		}
	}
	
	public static void buyStocks(Scanner sc) {
		System.out.println("Enter your account no: ");
		String accNum = sc.nextLine();
		
		System.out.println("No of stocks to buy: ");
		int stock = sc.nextInt();
		
		System.out.println("Price per stock: ");
		double price = sc.nextDouble();
		
		bankAccount account = findAccount(accNum);
		if(account != null) {
			((dematAccount) account).buyStocks(stock, price);
			return;
		}
		else {
			System.out.println("Account not found or account is not demat ");
		}
	}
	
	public static void sellStocks(Scanner sc) {
		System.out.println("Enter your account no: ");
		String accNum = sc.nextLine();
		
		System.out.println("No of stocks to sell: ");
		int stock = sc.nextInt();
		
		System.out.println("Price per stock: ");
		double price = sc.nextDouble();
		
		bankAccount account = findAccount(accNum);
		if(account != null) {
			((dematAccount) account).sellStocks(stock, price);
			return;
		}
		else {
			System.out.println("Account not found or account is not demat ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		accounts = new bankAccount[5];
		
		while(true) {
			System.out.println("Bank Application menu");
			System.out.println("Press 1: To create an account");
			System.out.println("Press 2: Display all account");
			System.out.println("Press 3: Deposit Money");
			System.out.println("Press 4: Withdraw money");
			System.out.println("Press 5: Transfer money");
			System.out.println("Press 6: Buy Stocks");
			System.out.println("Press 7: Sell Stocks");
			System.out.println("Press 8: Exist");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				createAccount(sc);
				break;
			case 2:
				displayAllAccount();
				break;
			case 3:
				depositMoney(sc);
				break;
			case 4:
				withdrawMoney(sc);
				break;
			case 5:
				transferMoney(sc);
				break;
			case 6:
				buyStocks(sc);
				break;
			case 7:
				sellStocks(sc);
				break;
			case 8:
				System.out.println("Thank You !! Exiting from the system");
				break;
			default :
				System.out.println("Invalid choice, Enter from 1-6");
				sc.close();
			}
		}

	}

}
