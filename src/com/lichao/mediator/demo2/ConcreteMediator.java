package com.lichao.mediator.demo2;

/**
 * 定义具体中介者ConcreteMediator,
 * 具体中介者通过协调各同事对象实现协作行为,了解并维护它的各个同事。
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
