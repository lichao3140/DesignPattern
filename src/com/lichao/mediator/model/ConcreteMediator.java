package com.lichao.mediator.model;

/**
 * 具体中介者
 * @author LiChao
 *
 */
public class ConcreteMediator extends Mediator {

	@Override
	public void method() {
		colleagueA.action();
		colleagueB.action();
	}
	
}
