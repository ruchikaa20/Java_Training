package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {

	@Test  //annotation
	void testAdd() {
		Calculator calc = new Calculator();  
		//assertions -> match in expected and actual result 
		assertEquals(10, calc.add(4, 6));  //test case for add method
	}

	@Test
	void testSub() {
		Calculator calc = new Calculator();  
		assertEquals(4, calc.sub(10, 6));
	}
	
	//assert true (condition) -> verify condition is true
	//assert false (condition) -> verify condition is false
	
	@Test
	void testConditionT() {
		Calculator calc = new Calculator();  
		assertTrue(calc.add(2, 9)>0);
	}
	
	@Test
	void testConditionF() {
		Calculator calc = new Calculator();  
		assertFalse(calc.sub(8, 6)<0);
	}
	
	@Test
	void testNull() {
		Calculator calc = new Calculator();  
		assertNull(calc.add(null, null));
	}
	
	@Disabled("This is curretly disabled")   //ignore testcase
	@Test
	void testNotNull() {
		Calculator calc = new Calculator();  
		assertNotNull(calc.add(2, 8));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {12,15,16,17})
	void testAddParam(int number) {
		Calculator calc = new Calculator();
		assertEquals(number+10, calc.add(number, 10));
	}
	
	@ParameterizedTest
	@CsvSource ({
		"5, 7, 12",
		"3, 6, 9",
		"7, 5, 12",
		"20, 13, 33"
	})
	
	
	void testAddParamCsv(int a, int b, int expected) {
		Calculator calc = new Calculator();
		assertEquals(expected, calc.add(a, b) );
	}  //run for 4 sets
	
	//timeout for tests
	//fail -> longer time
	@Test
	void testTimeout() {
		assertTimeout(java.time.Duration.ofMillis(1000),() -> {
			Thread.sleep(500);
			Calculator calc = new Calculator();
			calc.add(2,3);
		});
	}
	
	
	//testing exceptions
	//assertThrows(Exception class) -> method call
	//pass -> if exception is thrown
	@Test
	void testException() {
		Calculator calc = new Calculator();
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
		calc.div(12,0);
	});
	
	}
	

}
