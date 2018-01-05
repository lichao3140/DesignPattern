package com.lichao.abstractfactory.model;

/**
 * ���幤����1
 * @author LiChao
 *
 */
public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}
}
