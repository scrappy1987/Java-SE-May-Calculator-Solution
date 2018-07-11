package com.qa.calculator;

import com.qa.math.operations.IMathOperation;

public class Calculator {

	private IMathOperation mathOperation;
	
	public Calculator(IMathOperation mathOperation) 
	{
		this.mathOperation = mathOperation;
	}
	
	public double executeMathOperation(int num1, int num2) 
	{
		return mathOperation.mathOperation(num1, num2);
	}

	public IMathOperation getMathOperation() {
		return mathOperation;
	}

	public void setMathOperation(IMathOperation mathOperation) {
		this.mathOperation = mathOperation;
	}
}
