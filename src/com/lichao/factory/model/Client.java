package com.lichao.factory.model;

/**
 * �ͻ���
 * @author LiChao
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		Product product = factory.creteProduct();
		product.method();
	}
}
