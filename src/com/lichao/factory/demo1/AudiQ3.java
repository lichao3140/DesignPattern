package com.lichao.factory.demo1;

public class AudiQ3 extends AudiCar{

	@Override
	public void drive() {
		System.out.println("Q3 启动了");
	}

	@Override
	public void selfNavigation() {
		System.out.println("Q3 开始自动巡航");
	}

}
