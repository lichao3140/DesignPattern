package com.lichao.command.demo2;

public class Clinent {

	public static void main(String[] args) {
		//首先要有俄罗斯方块游戏
		TetrisMachine machine = new TetrisMachine();
		
		//根据游戏构造4种命令
		LeftCommand leftCommand = new LeftCommand(machine);
		RightCommand rightCommand = new RightCommand(machine);
		FallCommand fallCommand = new FallCommand(machine);
		TransformCommand transformCommand = new TransformCommand(machine);
		
		//按钮执行不用的命令
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setFallCommand(fallCommand);
		buttons.setTransformCommand(transformCommand);
		
		//具体按下那个按钮由玩家决定
		buttons.toLeft();
		buttons.toRight();
		buttons.fall();
		buttons.transform();
	}
}
