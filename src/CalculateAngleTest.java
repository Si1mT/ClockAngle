package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateAngleTest {

	CalculateAngle angle = new CalculateAngle();
	
	@Test
	void test() {
		assertNotNull(angle.calculateAngle("09:50"));
		assertNotNull(angle.calculateAngle("2400"));
		assertFalse(angle.calculateAngle("test"));
	}
}
