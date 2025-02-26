package OOPconcepts;

public class dematAccount extends bankAccount{
	
	private int stockHoldings;
	
	public dematAccount() {
		super();
	}

	public dematAccount(String name, String accNo, double bal, int stocks) {
		super(name, accNo, bal);
		// TODO Auto-generated constructor stub
		this.stockHoldings = stocks;
	}
	
	public void buyStocks(int quantity, double pricePerStock) {
		double totalCost = quantity*pricePerStock;
		if(getbalance() >= totalCost) {
			setbalance(getbalance()-totalCost);
			stockHoldings += quantity;
//			System.out.println("Stocks buyed: "+quantity);
			System.out.println("Amount to buy "+quantity+ " stocks is :"+totalCost);
			System.out.println("Bank Balance: "+ getbalance());
		}
		else {
			System.out.println("Insuffuicient money to buy stocks");
		}
	}
	
	public void sellStocks(int quantity, double pricePerStock) {
		double earning = 0; 
		if(quantity < stockHoldings) {
			earning = quantity*pricePerStock;
			setbalance(getbalance() + earning);
			stockHoldings -= quantity;
			System.out.println("Amount to sell "+quantity+ " stocks is :"+earning);
			System.out.println("Bank Balance: "+ getbalance());
		}
		else {
			System.out.println("Insuffuicient stocks to sell");
		}
	}
	
	@Override
	public void details() {
		super.details();
		System.out.println("Total stocks: "+ stockHoldings);
		
	}

}
