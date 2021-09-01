package GradleDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class lifeCycleMethodTest {
	private sumNumbers obj;
	@BeforeAll
	void setUpBeforeClass() throws Exception {
		obj = new sumNumbers();
		System.out.println("Before Everything");
	}

	@AfterAll
	void tearDownAfterClass() throws Exception {
		obj = null;
		System.out.println("After Everything");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test");
	}
	
	@RepeatedTest(20)
	void testSum() {
		assertEquals(10, obj.sum(4,6));
		//fail("Not yet implemented");
	}
	
	@RepeatedTest(20)
	void testNegative(){
		assertEquals(3, obj.sum(2, 1));
	}
	@RepeatedTest(20)
	//@Test
	void testError() {
		Exception exception = assertThrows(Exception.class,()->obj.sum(20, 9));
		assertEquals("Value should be less than 10", exception.getMessage());
	}

}
