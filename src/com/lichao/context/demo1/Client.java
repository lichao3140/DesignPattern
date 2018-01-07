package com.lichao.context.demo1;

public class Client {

	public static void main(String[] args) {
		Calculator c = new Calculator("1 + 3 + 8 - 2");
		System.out.println(c.calculate());
	}
}
