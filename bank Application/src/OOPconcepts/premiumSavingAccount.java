package OOPconcepts;

//multilevel inheritance
public class premiumSavingAccount extends savingBankAccount{
	private double bonusInterest;
    private double bonusInterestRate;
    private int Btime;

	public premiumSavingAccount(String name, String accNo, double bal, double inRate, int time, double bonusInterestRate, int Btime) {
		super(name, accNo, bal, inRate, time);
		this.bonusInterestRate = bonusInterestRate;
		// TODO Auto-generated constructor stub
	}

	public double getBonusInterest() {
		return bonusInterest;
	}

	public void setBonusInterest(double bonusInterest) {
		this.bonusInterest = bonusInterest;
	}
	
	public double setbonusInterestRate() {
		return bonusInterestRate;
	}

	public void getbonusInterestRate(double bonusInterest) {
		this.bonusInterest = bonusInterestRate;
	}
	
	public int setBtime() {
		return Btime;
	}

	public void getBtime(int Btime) {
		this.Btime = Btime;
	}
	
	public double bonusInterest( double amt, double inrate, int time){
			
		    System.out.println("Enter Bonus Interest rate:");
		    inrate = sc.nextDouble();
		
		    System.out.println("Enter time :");
		    time = sc.nextInt();
		    setBonusInterest(inrate);
			amt = getbalance();
			double bonusInterest = (amt*inrate*time) / 100;
			setBonusInterest(bonusInterest);
			System.out.println("Interest added: " +bonusInterest);
			return (bonusInterest) ;
		}
	
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		
		bonusInterest(getbalance(), bonusInterestRate, Btime);
		
		setbalance(getbalance() + bonusInterest);
		
		System.out.println("updated amount after adding interest: " +getbalance());
		
		setbalance(getbalance() + bonusInterest);
		
	}
	
	@Override
	 public void details() {
		super.details();
		System.out.println("Bonus interest rate is: " +bonusInterestRate);
		System.out.println("Bonus Interest is: " +bonusInterest);
		System.out.println("updated amount after adding interest: " +getbalance());
	}

}
