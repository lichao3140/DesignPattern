package com.lichao.mediator.model;

/**
 * �����н���
 * @author LiChao
 *
 */
public abstract class Mediator {
	protected ConcreteColleagueA colleagueA;
	protected ConcreteColleagueB colleagueB;
	
	
	/**
	 * �����н鷽��������ʵ��
	 */
	public abstract void method();
	
	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}
	
	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}
}
