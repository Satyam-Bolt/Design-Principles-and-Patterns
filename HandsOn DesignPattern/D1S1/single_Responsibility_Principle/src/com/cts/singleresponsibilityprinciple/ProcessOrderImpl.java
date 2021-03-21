package com.cts.singleresponsibilityprinciple;

public class ProcessOrderImpl implements ProcessOrder{
	@Override
	public void processOrder(String modelName) {
		System.out.println(String.format("%s order accepted!",modelName));
	}
}
