package com.lichao.command.demo1;

/**
 * 军队
 * 具体执行攻打任务
 * @author LiChao
 *
 */
public class Army {
	private Soldier soldier;
	
	public Army(Soldier soldier) {
		super();
		this.soldier = soldier;
	}
	
	/**
	 * 进攻
	 */
	public void attack() {
		soldier.setAttach("攻击  齐国");
		System.out.println("攻击  齐国");
	}
	
	/**
	 * 撤退
	 */
	public void back() {
		soldier.setBack("前方大事不妙，赶紧撤退");
		System.out.println("前方大事不妙，赶紧撤退");
	}
	
	/**
	 * 原来撤退
	 */
	public void undo() {
		soldier.setBack("原路撤退");
		System.out.println("原路撤退");
	}
}
