package com.lichao.command.demo2;

/**
 * 请求者类  命令由按钮发起
 * @author LiChao
 *
 */
public class Buttons {
	private LeftCommand leftCommand;
	private RightCommand rightCommand;
	private FallCommand fallCommand;
	private TransformCommand transformCommand;
	
	/**
	 * 设置向左移动的命令
	 * @param leftCommand  向左移动的命令对象
	 */
	public void setLeftCommand(LeftCommand leftCommand) {
		this.leftCommand = leftCommand;
	}
	
	/**
	 * 设置向右移动的命令
	 * @param rightCommand  向右移动的命令对象
	 */
	public void setRightCommand(RightCommand rightCommand) {
		this.rightCommand = rightCommand;
	}
	
	/**
	 * 设置快速下落的命令
	 * @param fallCommand  快速下落的命令对象
	 */
	public void setFallCommand(FallCommand fallCommand) {
		this.fallCommand = fallCommand;
	}
	
	/**
	 * 设置改变形状的命令对象
	 * @param transformCommand 改变形状的命令对象
	 */
	public void setTransformCommand(TransformCommand transformCommand) {
		this.transformCommand = transformCommand;
	}
	
	/**
	 * 按下按钮向左移动
	 */
	public void toLeft() {
		leftCommand.execute();
	}
	
	/**
	 * 按下按钮向右移动
	 */
	public void toRight() {
		rightCommand.execute();
	}
	
	/**
	 * 按下按钮快速下落
	 */
	public void fall() {
		fallCommand.execute();
	}
	
	/**
	 * 按下按钮改变形状
	 */
	public void transform() {
		transformCommand.execute();
	}
}
