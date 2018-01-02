package com.lichao.factory.demo1;

public class AudiQ5 extends AudiCar{

	@Override
	public void drive() {
		System.out.println("Q5 启动了");
	}

	@Override
	public void selfNavigation() {
		System.out.println("Q5 开始自动巡航");
	}

}
