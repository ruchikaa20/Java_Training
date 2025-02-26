package Junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
//	OrderServiceTest.class,
	OrderService2Test.class,
	OrderServiceTestThread.class
})

public class OrderServiceTestSuite {

}
