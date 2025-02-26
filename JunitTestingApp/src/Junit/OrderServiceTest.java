package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class OrderServiceTest {
	
	OrderService orderService = new OrderService();
	
	@Test
	void testCalTotal() {
		double total = orderService.calPrice(100.00,2); //actual result -> 200,180
		assertEquals(180, total, "Total should be 180 after 10% discount");
	}
	
	
	@Test
	void testSufficientStock() {
		OrderService os = new OrderService();
		boolean result = os.placeOrder(5);
		assertTrue(result, "Order should be placed successfully");
		assertEquals(5, os.getStock(), "stock should be reduced by the ordered quantity");
	}
	
	@Test
	void testInsufficientStock() {
		OrderService os = new OrderService();
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
				() -> orderService.placeOrder(15), "should throw exception for insufficient stock");
		assertEquals("Insufficient stock", thrown.getMessage());
	}

	@ParameterizedTest
	@CsvSource ({
		"500, 7, 3150",
		"300, 6, 1620",
		"700, 5, 3150",
		"800, 9, 6480"
	})
	
	void testcalculatePrice(double price, int quantity, double expected) {
		OrderService os = new OrderService();
		assertEquals(expected, orderService.calPrice(price, quantity) );
	}  
	
	
	@Test
	void testCalTotalZeroQuantity() {
		OrderService os = new OrderService();
		double total = orderService.calPrice(100.00, 0);
		assertEquals(0, total, "total should be 0 when quantity is 0");
	}
	
	
	@Test
	void testTimeout() {
		OrderService os = new OrderService();
		assertTimeout(java.time.Duration.ofMillis(1000),() -> {
			Thread.sleep(500);
			os.calPrice(50, 10);
		});
	}
	
	
	@Test
	void test0() {
		OrderService os = new OrderService();
		assertEquals(0, os.calPrice(50, 0));
	}
	
	

	@Test
	void testPlaceOrderMultithread() throws InterruptedException {
		Thread thread1 = new Thread(() -> orderService.placeOrder(2));
		Thread thread2 = new Thread(() -> orderService.placeOrder(1));
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		assertEquals(7, orderService.getStock());	
		
	}	
}
