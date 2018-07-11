package com.qa.math.operations;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest {

	@Test
	public void dividerTest() {
		Divider divider = new Divider();
		double actual = divider.mathOperation(5, 5);
		Assert.assertEquals(1, actual, 0.001);
	}

}
