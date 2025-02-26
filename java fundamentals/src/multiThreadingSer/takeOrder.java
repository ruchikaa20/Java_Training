package multiThreadingSer;

public class takeOrder extends Thread{
	public void run() {
	
		System.out.println("Taking orders: ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("Order Taken "+Thread.currentThread().getName() );
	}
}
