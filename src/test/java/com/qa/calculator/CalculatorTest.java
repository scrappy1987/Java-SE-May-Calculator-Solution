package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.qa.math.operations.Adder;
import com.qa.math.operations.Divider;
import com.qa.math.operations.Multiplier;
import com.qa.math.operations.Subtracter;

public class CalculatorTest {

	@Test
	public void addTest() {
		Adder adder = new Adder();
		Calculator addCalc = new Calculator(adder);
		double actual = addCalc.executeMathOperation(5, 5);
		Assert.assertEquals(10.0, actual, 0.001);
	}
	
	@Test
	public void divideTest() {
		Divider divider = new Divider();
		Calculator divideCalc = new Calculator(divider);
		double actual = divideCalc.executeMathOperation(5, 5);
		Assert.assertEquals(1, actual, 0.001);
	}
	
	@Test
	public void multiplyTest() {
		Multiplier multiply = new Multiplier();
		Calculator multiplyCalc = new Calculator(multiply);
		double actual = multiplyCalc.executeMathOperation(5, 5);
		Assert.assertEquals(25, actual, 0.001);
	}
	
	@Test
	public void subtractTest() {
		Subtracter subtracter = new Subtracter();
		Calculator subtractCalc = new Calculator(subtracter  );
		double actual = subtractCalc.executeMathOperation(5, 5);
		Assert.assertEquals(0, actual, 0.001);

	}
}
	
	
	
	
	

	
