package com.lichao.mediator.model;

/**
 * 抽象同事
 * @author LiChao
 *
 */
public abstract class Colleague {
	//中介者对象
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	/**
	 * 同事角色的具体行为，由子类去实现
	 */
	public abstract void action();
}
