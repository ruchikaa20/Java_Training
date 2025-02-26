package package1;

public class testbaseClass {
	protected String name;
	protected double income;
	
	protected testbaseClass(){
		
	}
	
	testbaseClass(String n, double i){
		this.name = n;
		this.income = i;
	}
	
	public void totIncome(double income) {
		double totalIncome = income*12;
		System.out.println("Annually Incomne of "+name+ " is :"+totalIncome);
	}
    
	
}
