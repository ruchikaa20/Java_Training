package multiThreadingSer;

public class payment extends Thread{
	public void run() {
		System.out.println("Payment done ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("Payment done"+Thread.currentThread().getName() );
	}
}
