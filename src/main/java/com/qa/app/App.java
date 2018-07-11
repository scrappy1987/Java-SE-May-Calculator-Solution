package com.qa.app;

import com.qa.calculator.Calculator;
import com.qa.math.operations.Adder;
import com.qa.math.operations.Divider;
import com.qa.math.operations.Multiplier;
import com.qa.math.operations.Subtracter;

public class App {

	public static void main(String[] args) {
		Adder adder = new Adder();
		Calculator addCalc = new Calculator(adder);
		System.out.println("Adder " + addCalc.executeMathOperation(5, 5));
		
		Divider divider = new Divider();
		Calculator divideCalc = new Calculator(divider);
		System.out.println("Divider " + divideCalc.executeMathOperation(5, 5));
		
		Multiplier multiply = new Multiplier();
		Calculator multiplyCalc = new Calculator(multiply);
		System.out.println("Multiply " + multiplyCalc.executeMathOperation(5, 5));
		
		Subtracter subtracter = new Subtracter();
		Calculator subtractCalc = new Calculator(subtracter  );
		System.out.println("Subtract " + subtractCalc.executeMathOperation(5, 5));
	}

}
