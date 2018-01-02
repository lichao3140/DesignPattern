package com.lichao.factory.demo1;

public class AudiQ7 extends AudiCar{

	@Override
	public void drive() {
		System.out.println("Q7 启动了");
	}

	@Override
	public void selfNavigation() {
		System.out.println("Q7 开始自动巡航");
	}

}
