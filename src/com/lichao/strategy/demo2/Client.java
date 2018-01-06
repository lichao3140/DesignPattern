package com.lichao.strategy.demo2;

public class Client {
	public static void main(String[] args) {
		IContext context;
		
		System.out.println("----------�յ����ʹ�õ�һ������---------------");
	    context = new IContext(new BackDoor());
	    context.operate();
	    System.out.println("\n");

	    System.out.println("----------�����ֲ�˼��ʹ�õڶ�������---------------");
	    context.setStrategy(new GivenGreenLight());
	    context.operate();
	    System.out.println("\n");

	    System.out.println("----------��Ȩ��׷�����ˣ�ʹ�õ���������---------------");
	    context.setStrategy(new BlackEnemy());
	    context.operate();
	    System.out.println("\n");
	}
}
