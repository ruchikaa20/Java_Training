package multiThreadingSer;

public class testThread implements Runnable {

	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is running from runnable class "+Thread.currentThread().getName());
		
	}

}
