package com.lichao.mediator.model;

/**
 * 抽象中介者
 * @author LiChao
 *
 */
public abstract class Mediator {
	protected ConcreteColleagueA colleagueA;
	protected ConcreteColleagueB colleagueB;
	
	
	/**
	 * 抽象中介方法、子类实现
	 */
	public abstract void method();
	
	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}
	
	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}
}
