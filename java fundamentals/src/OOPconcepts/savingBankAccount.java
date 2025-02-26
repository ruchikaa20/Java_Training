package OOPconcepts;
import java.util.Scanner;

public class savingBankAccount extends bankAccount {
	private double interestRate;
	private double interest;
	private int time;

	public savingBankAccount(String name, String accNo, double bal, double inRate, int time) {
		// TODO Auto-generated constructor stub
		super(name, accNo, bal);
		this.interestRate = inRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	Scanner sc = new Scanner(System.in);
	
    public double interest( double amt, double inrate, int time){
		
	    System.out.println("Enter Interest rate:");
	    inrate = sc.nextDouble();
	
	    System.out.println("Enter time :");
	    time = sc.nextInt();
		setInterestRate(inrate);
		amt = getbalance();
		double interest = (amt*inrate*time) / 100;
		setInterest(interest);
		System.out.println("Interest added: " +interest);
		return (interest) ;
	}
	
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
        interest(getbalance(), interestRate, time);
		
		setbalance(getbalance() + interest);
		
		System.out.println("updated amount after adding interest: " +getbalance());
		
	}
	
	@Override
	 public void details() {
		super.details();
		
	}
	
	@Override
	public void deposit(double... amounts) {
		
		for(double amount: amounts) {
			
			System.out.println("deposit amount are: " +amount);
		}
		
		super.deposit(amounts);
		
		interest(getbalance(), interestRate, time);
		
		setbalance(getbalance() + interest);
		
		System.out.println("updated amount after adding interest: " +getbalance());
	}

}
