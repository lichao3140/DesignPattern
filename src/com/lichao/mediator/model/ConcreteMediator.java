package com.lichao.mediator.model;

/**
 * �����н���
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
