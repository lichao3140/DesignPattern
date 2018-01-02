package com.lichao.factory.model;

/**
 * 具体工厂类
 * @author LiChao
 *
 */
public class ConcreteFactory extends Factory {

	@Override
	public Product creteProduct() {
		return new ConcreteProductA();
	}

}
