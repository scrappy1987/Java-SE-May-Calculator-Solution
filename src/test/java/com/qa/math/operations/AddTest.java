package com.qa.math.operations;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {

	@Test
	public void addTest() {
		Adder adder = new Adder();
		double actual = adder.mathOperation(5, 5);
		Assert.assertEquals(10.0, actual, 0.001);
	}

}
