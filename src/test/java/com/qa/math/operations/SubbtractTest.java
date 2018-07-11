package com.qa.math.operations;

import org.junit.Assert;
import org.junit.Test;

public class SubbtractTest {

	@Test
	public void subtractTest() {
		Subtracter subtract = new Subtracter();
		double actual = subtract.mathOperation(5, 5);
		Assert.assertEquals(0, actual, 0.001);
	}

}
