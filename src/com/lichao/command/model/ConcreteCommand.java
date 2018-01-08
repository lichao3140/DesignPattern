package com.lichao.command.model;

/**
 * ����������
 * @author LiChao
 *
 */
public class ConcreteCommand implements Command {
	//����һ���Խ����߶��������
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// ���ý����ߵ���ط�����ִ�о����߼�
		receiver.action();
	}

}
