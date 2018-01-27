package com.lichao.mediator.model;

/**
 * 具体同事A
 * @author LiChao
 *
 */
public class ConcreteColleagueA extends Colleague {
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void action() {
		System.out.println("ColleagueA 将信息递交给中介者处理");
	}

}
