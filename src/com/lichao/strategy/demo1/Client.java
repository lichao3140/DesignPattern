package com.lichao.strategy.demo1;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		//设置计算策略
		client.setStrategy(new BusStrategy());
		//计算价格
		System.out.println("乘公交16公里:" + client.calculatePrice(16));
	}
	
	CalculateStrategy mStrategy;
	public void setStrategy(CalculateStrategy mStrategy) {
		this.mStrategy = mStrategy;
	}
	
	public int calculatePrice(int km) {
		return mStrategy.calculatePrice(km);
	}
}
