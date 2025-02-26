package multiThreadingSer;

public class testThread2 extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is running from thread class "+Thread.currentThread().getName() );
		
	}
}
