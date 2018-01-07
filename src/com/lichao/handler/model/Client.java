package com.lichao.handler.model;

public class Client {
	
	public static void main(String[] args) {
		//����һ��ConcreteHandler1����
		ConcreteHandler1 handler1 = new ConcreteHandler1();
		//����һ��ConcreteHandler2����
		ConcreteHandler2 handler2 = new ConcreteHandler2();
		//����handler1����һ���ڵ�
		handler1.successor = handler2;
		//����handler2����һ���ڵ�
		handler2.successor = handler1;
		//��������
		handler1.handleRequest("ConcreteHandler1");
	}

}
