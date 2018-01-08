package com.lichao.command.demo2;

public class Clinent {

	public static void main(String[] args) {
		//����Ҫ�ж���˹������Ϸ
		TetrisMachine machine = new TetrisMachine();
		
		//������Ϸ����4������
		LeftCommand leftCommand = new LeftCommand(machine);
		RightCommand rightCommand = new RightCommand(machine);
		FallCommand fallCommand = new FallCommand(machine);
		TransformCommand transformCommand = new TransformCommand(machine);
		
		//��ťִ�в��õ�����
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setFallCommand(fallCommand);
		buttons.setTransformCommand(transformCommand);
		
		//���尴���Ǹ���ť����Ҿ���
		buttons.toLeft();
		buttons.toRight();
		buttons.fall();
		buttons.transform();
	}
}
