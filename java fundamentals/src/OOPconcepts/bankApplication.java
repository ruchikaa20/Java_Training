package OOPconcepts;
import java.util.Scanner;

public class bankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bankAccount account1  = new bankAccount("Ruchika", "AXIS68329899", 50000.00);
		
		
//		account1.accountHoldername = "Ruchika";
//		account1.accountNumber = "AXIS68329899";
//		account1.balance = 50000.00;
		
//		bankAccount account2  = new bankAccount("Mahima", "ICICI17392920", 29000.00);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String Name = sc.next();
		
		System.out.println("Enter your Account Number:");
		String accNo = sc.next();
		
		System.out.println("Enter account balance:");
		double bal = sc.nextDouble();
		
		System.out.println("Enter your account type(Current/Saving): ");
		String accType = sc.next();
		bankAccount account1  = new bankAccount(Name, accNo , bal);
		double intRate=0;
		int time=0;
		double bonusIntRate=0;
		int btime=0;
		if(accType.equalsIgnoreCase("current")) {
//			account1.details();
//			
//			account1.checkBalance();
//			
//			account1.deposit(1000);
//			account1.checkBalance();
//			
//			account1.withdraw(5000);
//			account1.checkBalance();
			
			
			
//			account1.setaccountHoldername("Miss Ruchika");
//			account1.deposit(1000, 2500, 5500, 105000);
//			account1.details();
//			
//			account1.deposit(-1000, -2500, 5500, 105000);
			
//			 bankAccount p1 = new bankAccount("p1", "SBI31367237", 1000);
//			 p1.details();
//			 savingBankAccount p2 = new savingBankAccount("p2", "SBI68593232", 5000, 10, 2);
//			 p2.details();
//			 p2.transfer(500, p1);
//			 p1.checkBalance();
//			 p2.checkBalance();
			 
			 dematAccount account7 = new dematAccount("ruchika", "HDFC378327383", 55000, 10);
			 account7.buyStocks(4, 1000);
			 account7.sellStocks(2, 2000);
			 account7.details();
		}
		
		else if(accType.equalsIgnoreCase("saving")) {
			
			
			bankAccount account3 = new savingBankAccount(Name, accNo , bal, intRate, time);
	        //ref type                     child class object
			
			
	        // here we cannot directly access the child class method so we have to use typecasting	
//		    ((savingBankAccount) account3).interest(bal, intRate, time);
		 
//		    account3.details();
//		    account3.deposit(1000, 200, 800);
//		   
//		    account3.deposit(-89, 0, 76);
		    
//		    savingBankAccount account4 = new premiumSavingAccount(Name, accNo , bal, intRate, time, bonusIntRate, btime);
		    
		    savingBankAccount account5 = new premiumSavingAccount("ruchika", "BOI67278282", 12000, 10, 2, 5, 1);
		    
		    bankAccount account6 = new premiumSavingAccount("Khushi", "HDFC839434", 54000, 10, 5, 10, 2);
			
		    account5.deposit(4000);
		 
		    account5.details();
		    
		    
		    
		    
		}
	    
		
		
		sc.close();
		
		
		}

}
