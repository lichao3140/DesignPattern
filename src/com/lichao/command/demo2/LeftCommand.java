package com.lichao.command.demo2;

/**
 * 具体命令者  向左移的命令类
 * @author LiChao
 *
 */
public class LeftCommand implements Command {
	//次有一个接收者俄罗斯方块有些对象的引用
	private TetrisMachine machine;
	
	public LeftCommand(TetrisMachine machine) {
		this.machine = machine;
	}

	@Override
	public void execute() {
		// 调用游戏机的具体方法执行操作
		machine.toLeft();
	}
}
