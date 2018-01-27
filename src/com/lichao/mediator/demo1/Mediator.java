package com.lichao.mediator.demo1;

/**
 * 抽象中介者
 * @author LiChao
 *
 */
public abstract class Mediator {

	/**
	 * 同事对象改变时通知中介者的方法
	 * 在同事对象改变时由中介者通知其他的同事对象
	 * @param c
	 */
	public abstract void changed(Colleague c);
}
