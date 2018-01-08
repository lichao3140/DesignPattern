package com.lichao.command.demo2;

/**
 * ����������  �ı���״��������
 * @author LiChao
 *
 */
public class TransformCommand implements Command {
	//����һ�������߶���˹������Щ���������
	private TetrisMachine machine;
	
	public TransformCommand(TetrisMachine machine) {
		this.machine = machine;
	}

	@Override
	public void execute() {
		// ������Ϸ���ľ��巽��ִ�в���
		machine.transform();
	}
}
