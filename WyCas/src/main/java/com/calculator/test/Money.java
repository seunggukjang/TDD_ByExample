package com.calculator.test;


abstract public class Money {
	abstract Money times(int multiplier);
	
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
	static Money franc(int amount) {
		return new Franc(amount);
	}
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}
	
	protected int amount; // 10 = 5 * 2 중복!
}
