package com.lichao.command.model;

/**
 * 请求者类
 * @author LiChao
 *
 */
public class Invoker {
	//持有一个对相应命令对象的引用
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void acttion() {
		//调用具体命名对象的相关方法，执行具体命令
		command.execute();
	}
}
