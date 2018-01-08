package com.lichao.command.demo2;

/**
 * ����������  ���������������
 * @author LiChao
 *
 */
public class FallCommand implements Command {
	//����һ�������߶���˹������Щ���������
	private TetrisMachine machine;
	
	public FallCommand(TetrisMachine machine) {
		this.machine = machine;
	}

	@Override
	public void execute() {
		// ������Ϸ���ľ��巽��ִ�в���
		machine.fastToButtom();
	}
}
