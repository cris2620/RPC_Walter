package com.srpc.test;

import com.srpc.transport.RpcClient;

public class OtroTest {

	public static void main(String[] args) {
		RpcClient client = new RpcClient("http://localhost:70/simpleRPC");		
		Calculator cal = (Calculator)client.getProxy(Calculator.class, "CalculatorService");
		int result = cal.sum2Num(8, 5);
		System.out.println(result);
		result = cal.sum2Num(-10, 5);
		System.out.println(result);
		client.stop();
	}
}
