package com.lichao.command.model;

/**
 * ��������
 * @author LiChao
 *
 */
public class Invoker {
	//����һ������Ӧ������������
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void acttion() {
		//���þ��������������ط�����ִ�о�������
		command.execute();
	}
}
