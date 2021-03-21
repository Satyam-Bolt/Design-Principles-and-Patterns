package com.cts.interfaceSegregation;

public class OrderRepair implements IOrder, IPhoneRepair, IAccessoryRepair {

	@Override
	public void processOrder(String modelName) {
		System.out.println(String.format("%s order accepted!",modelName));
	}

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(String.format("%s repair accepted!",modelName));
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(String.format("%s repair accepted!",accessoryType));
	}

}
