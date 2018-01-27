package com.lichao.mediator.demo2;

/**
 * ��������н���ConcreteMediator,
 * �����н���ͨ��Э����ͬ�¶���ʵ��Э����Ϊ,�˽Ⲣά�����ĸ���ͬ�¡�
 * @author LiChao
 *
 */
public class ConcreteMediator extends Mediator {
	ColleagueA collA;
	ColleagueB collB;
	
	@Override
	public void contact(String content, Colleague coll) {
		if (coll == collA) {
			collB.getMessage(content);
		} else {
			collA.getMessage(content);
		}
	}

	public ColleagueA getCollA() {
		return collA;
	}

	public void setCollA(ColleagueA collA) {
		this.collA = collA;
	}

	public ColleagueB getCollB() {
		return collB;
	}

	public void setCollB(ColleagueB collB) {
		this.collB = collB;
	}
}
