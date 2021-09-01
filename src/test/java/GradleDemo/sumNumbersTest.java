package GradleDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumNumbersTest {
	sumNumbers obj = new sumNumbers();
	@Test
	void testSum() {
		assertEquals(10, obj.sum(4,6));
		//fail("Not yet implemented");
	}
	@Test
	void testNegative(){
		assertEquals(3, obj.sum(2, 1));
	}

}
