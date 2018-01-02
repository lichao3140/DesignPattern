package com.lichao.factory.model;

/**
 * 抽象工厂类
 * @author LiChao
 *
 */
public abstract class Factory {
	/**
	 * 抽象工厂方法
	 * 具体生成什么由子类去实现
	 * @return
	 */
	public abstract Product creteProduct();
}
