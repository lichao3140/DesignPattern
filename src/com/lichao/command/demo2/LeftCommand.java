package com.lichao.command.demo2;

/**
 * ����������  �����Ƶ�������
 * @author LiChao
 *
 */
public class LeftCommand implements Command {
	//����һ�������߶���˹������Щ���������
	private TetrisMachine machine;
	
	public LeftCommand(TetrisMachine machine) {
		this.machine = machine;
	}

	@Override
	public void execute() {
		// ������Ϸ���ľ��巽��ִ�в���
		machine.toLeft();
	}
}
