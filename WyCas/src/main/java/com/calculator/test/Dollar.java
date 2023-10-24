package com.calculator.test;

public class Dollar {

	public Dollar(int amount) {
		this.amount = amount;
	}
	void times(int multiplier) {
		amount *= multiplier;
	}
	int amount = 0; // 10 = 5 * 2 중복!
}
