package com.lichao.mediator.demo1;

/**
 * 抽象同事
 * @author LiChao
 *
 */
public abstract class Colleague {
	//每一个同事都该知道其中中介者
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
