package com.lichao.mediator.model;

/**
 * ����ͬ��A
 * @author LiChao
 *
 */
public class ConcreteColleagueA extends Colleague {
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void action() {
		System.out.println("ColleagueA ����Ϣ�ݽ����н��ߴ���");
	}

}
