package com.zero_jun.ioc1;

public class KiaMaker implements CarMaker{
	
	@Override
	public Car sell(Money money) {
		System.out.println("금액 : " + money.getAmount());
		return new Car("kia K5");
	}
}
