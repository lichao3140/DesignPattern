package com.lichao.strategy.demo1;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		//���ü������
		client.setStrategy(new BusStrategy());
		//����۸�
		System.out.println("�˹���16����:" + client.calculatePrice(16));
	}
	
	CalculateStrategy mStrategy;
	public void setStrategy(CalculateStrategy mStrategy) {
		this.mStrategy = mStrategy;
	}
	
	public int calculatePrice(int km) {
		return mStrategy.calculatePrice(km);
	}
}
