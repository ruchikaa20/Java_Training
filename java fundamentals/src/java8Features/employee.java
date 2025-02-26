package java8Features;

public class employee {
	
	private String name;
	private int empID;
	
	public employee(String name, int empID) {
		super();
		this.name = name;
		this.empID = empID;
		System.out.println("Two parameters constructor called ");
	}
	
	public employee(String name) {
		super();
		this.name = name;
		System.out.println("Name created : "+name);
	}
	
	public employee() {
		System.out.println("No parameter constructor callled");
	}
	


}
