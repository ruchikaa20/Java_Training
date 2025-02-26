package javaBasics;


class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

	
class UseCustomException {
		static void validateAge(int age) throws InvalidAgeException{
			if(age < 18) {
				throw new ArithmeticException("Not eligible for to open bank account");
			}
			System.out.println("eligible for to open bank account");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(22);
		}
		catch (InvalidAgeException e) {
			System.out.println("Exception Caught :"+e.getMessage());
		}
	}

}
