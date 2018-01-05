package com.lichao.abstractfactory.model;

/**
 * 具体工厂类2
 * @author LiChao
 *
 */
public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}
}
