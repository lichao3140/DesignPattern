package com.lichao.command.model;

/**
 * 具体命令类
 * @author LiChao
 *
 */
public class ConcreteCommand implements Command {
	//持有一个对接收者对象的引用
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// 调用接收者的相关方法来执行具体逻辑
		receiver.action();
	}

}
