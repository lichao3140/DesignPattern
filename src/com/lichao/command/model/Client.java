package com.lichao.command.model;

public class Client {
	
	public static void main(String[] args) {
		//����һ�������߶���
		Receiver receiver = new Receiver();
		
		//���ݽ����߶�����һ���������
		Command command = new ConcreteCommand(receiver);
		
		//���ݾ���Ķ����������߶���
		Invoker invoker = new Invoker(command);
		
		//ִ�����󷽷�
		invoker.acttion();
	}
}
