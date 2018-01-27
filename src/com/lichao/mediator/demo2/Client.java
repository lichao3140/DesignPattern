package com.lichao.mediator.demo2;

public class Client {
	public static void main(String[] args) {
		// �����н���
		ConcreteMediator mediator = new ConcreteMediator();
		// �������ͬ����
		ColleagueA colleagueA = new ColleagueA("����", mediator);
		ColleagueB colleagueB = new ColleagueB("����", mediator);
		// �н���֪��ÿһ�������Colleague��
		mediator.setCollA(colleagueA);
		mediator.setCollB(colleagueB);
		colleagueA.contact("����A, ��Ҫ��ͬ��B˵˵����������");
		colleagueB.contact("����B, ��������ʱ��,����������");
	}
}
