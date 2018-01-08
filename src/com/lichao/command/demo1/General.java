package com.lichao.command.demo1;

public class General {
	private Command undoCommand;
	private Command attackCommand;
	
	public General() {
		//构建士兵
		Soldier soldier = new Soldier();
		//建立军队
		Army army = new Army(soldier);
		undoCommand = new UndoCommand(army);
		attackCommand = new AttachCommand(army);
	}
	
	/**
	 * 皇帝调用大臣攻击方法
	 */
	public void attach() {
		attackCommand.excute();
	}
	
	/**
	 * 皇帝调用大臣撤退方法
	 */
	public void undo() {
		undoCommand.back();
	}
}
