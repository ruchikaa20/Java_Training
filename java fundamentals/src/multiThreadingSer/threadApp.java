package multiThreadingSer;

public class threadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		counter objec = new counter();
		
//		testThread2 t1 = new testThread2();
//		testThread runnable = new testThread();
//		Thread t2 = new Thread(runnable);
		
//		Thread t3 = new Thread( () ->{
//		                             	for(int i=0; i<5; i++) {
//		                            	 objec.incrementCount();
//		                             	}
//		                             } );
//		
//		Thread t4 = new Thread( () ->{
//							         	for(int i=0; i<4; i++) {
//							        	 objec.incrementCount();
//							         	}
//							         } );
		
//		t1.start();
		
		takeOrder order = new takeOrder();
		payment pay = new payment();
		assignDA da = new assignDA();
		
		order.start();
		pay.start();
		da.start();
		
		try {
//			t1.join();  //Signaling the main program that wait -> t1 is running somewhere it will join 
			order.join();
			pay.join();
			da.join();
			
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
//		System.out.println(objec.getCount());
		System.out.println("Process completed");
	}

}
