package multiThreadingSer;

public class assignDA extends Thread{
	
	public void run() {
		System.out.println("Assigning delivery agent ");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("Delivery partner assigned "+Thread.currentThread().getName() );
	}
}
