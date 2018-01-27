package com.lichao.mediator.model;

/**
 * 具体同事B
 * @author LiChao
 *
 */
public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void action() {
		System.out.println("ColleagueB 将信息递交给中介者处理");
	}

}
