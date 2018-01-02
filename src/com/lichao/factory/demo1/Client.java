package com.lichao.factory.demo1;

public class Client {
	
	public static void main(String[] args) {
		//����һ�����������Ĺ�������
		AudiCarFactory factory = new AudiCarFactory();
		
		//����Q3������
		AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
		audiQ3.drive();
		audiQ3.selfNavigation();
		
		//����Q5������
		AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
		audiQ5.drive();
		audiQ5.selfNavigation();
		
		//����Q5������
		AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
		audiQ7.drive();
		audiQ7.selfNavigation();
	}
}
