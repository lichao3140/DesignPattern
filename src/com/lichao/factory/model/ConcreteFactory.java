package com.lichao.factory.model;

/**
 * ���幤����
 * @author LiChao
 *
 */
public class ConcreteFactory extends Factory {

	@Override
	public Product creteProduct() {
		return new ConcreteProductA();
	}

}
