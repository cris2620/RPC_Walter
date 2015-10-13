package com.srpc.test;

import com.srpc.service.Service;

public class CalculatorImpl  extends Service implements Calculator {

	public CalculatorImpl( ) {
		super("CalculatorService");
    }
	
	@Override
	public int sum2Num(int a, int b) {
		return a + b;
	}
}
