package com.cognizant.designPrinciples.adapterPattern;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}

	@org.junit.jupiter.api.Test
	void test2() {
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getPrice(), 456.5, 0.00001);
	}
}
