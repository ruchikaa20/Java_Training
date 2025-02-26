package javaBasics;

class InsufficientFundException extends Exception {
	public InsufficientFundException(String message) {
		super(message);
	}
}


public class withdrawCustomException {
	
	static void checkFund(int amount) throws InvalidAgeException{
		
		double balance = 1000;
		if(amount > balance) {
			throw new ArithmeticException("Insufficient Balance");
		}
		System.out.println("sufficient Balance");
		balance -= amount;
		System.out.println("updated balance :"+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkFund(100);
		}
		catch (InvalidAgeException e) {
			System.out.println("Exception Caught :"+e.getMessage());
		}
	}

}
