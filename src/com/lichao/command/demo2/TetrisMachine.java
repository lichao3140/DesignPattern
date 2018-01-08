package com.lichao.command.demo2;

/**
 * 接收者角色
 * @author LiChao
 *
 */
public class TetrisMachine {
	/**
	 * 真正处理“向左”操作的逻辑代码
	 */
	public void toLeft() {
		System.out.println("向左");
	}
	
	/**
	 * 真正处理“向右”操作的逻辑代码
	 */
	public void toRight() {
		System.out.println("向右");
	}
	
	/**
	 * 真正处理“快速下落”操作的逻辑代码
	 */
	public void fastToButtom() {
		System.out.println("快速下落");
	}
	
	/**
	 * 真正处理“改变形状”操作的逻辑代码
	 */
	public void transform() {
		System.out.println("改变形状");
	}
}
