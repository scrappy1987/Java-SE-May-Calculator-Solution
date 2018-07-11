package com.qa.math.operations;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {

	@Test
	public void multiplyTest() {
		Multiplier multiplier = new Multiplier();
		double actual = multiplier.mathOperation(5, 5);
		Assert.assertEquals(25, actual, 0.001);
	}

}
