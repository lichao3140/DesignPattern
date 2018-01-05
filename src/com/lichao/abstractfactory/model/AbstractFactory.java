package com.lichao.abstractfactory.model;

/**
 * ���󹤳���
 * @author LiChao
 *
 */
public abstract class AbstractFactory {
	
	/**
	 * ������ƷA�ķ���
	 * @return ��ƷA����
	 */
	public abstract AbstractProductA createProductA();
	
	/**
	 * ������ƷB�ķ���
	 * @return ��ƷB����
	 */
	public abstract AbstractProductB createProductB();
}
