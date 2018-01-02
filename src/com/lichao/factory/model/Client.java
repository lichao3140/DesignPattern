package com.lichao.factory.model;

/**
 * ¿Í»§Àà
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
