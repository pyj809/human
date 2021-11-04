package com.zero_jun.ioc2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Setter
@Service
public class OrderManager {
	@Qualifier("kiaMaker")
//	@Resource
	@Autowired
	private CarMaker maker;
	@Autowired
	private Money money;
	
	public void order() {
		Car car = maker.sell(money);
		System.out.println("차량이름 : " + car.getName());
	}
}
