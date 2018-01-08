package com.lichao.command.demo2;

/**
 * ����������  �����Ƶ�������
 * @author LiChao
 *
 */
public class RightCommand implements Command {
	//����һ�������߶���˹������Щ���������
	private TetrisMachine machine;
	
	public RightCommand(TetrisMachine machine) {
		this.machine = machine;
	}

	@Override
	public void execute() {
		// ������Ϸ���ľ��巽��ִ�в���
		machine.toRight();
	}
}
