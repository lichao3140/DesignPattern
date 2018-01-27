package com.lichao.subject.demo2;

public class Client {
	public static void main(String[] args) {
		People people_1 =new People();
		people_1.setCash(60000);
		people_1.setUsername("jeck");
		
		People people_2 =new People();
		people_2.setCash(40000);
		people_2.setUsername("rose");
		
		People people_3 =new People();
		people_3.setCash(0);
		people_3.setVip("vip");
		people_3.setUsername("tom");
		
		ProxyClass proxy_buy = new ProxyClass();
		proxy_buy.setPeople(people_1);
		proxy_buy.buy_mycar();
		
		proxy_buy.setPeople(people_2);
		proxy_buy.buy_mycar();
		
		proxy_buy.setPeople(people_3);
		proxy_buy.buy_mycar();
	}
}
