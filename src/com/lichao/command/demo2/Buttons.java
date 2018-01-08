package com.lichao.command.demo2;

/**
 * ��������  �����ɰ�ť����
 * @author LiChao
 *
 */
public class Buttons {
	private LeftCommand leftCommand;
	private RightCommand rightCommand;
	private FallCommand fallCommand;
	private TransformCommand transformCommand;
	
	/**
	 * ���������ƶ�������
	 * @param leftCommand  �����ƶ����������
	 */
	public void setLeftCommand(LeftCommand leftCommand) {
		this.leftCommand = leftCommand;
	}
	
	/**
	 * ���������ƶ�������
	 * @param rightCommand  �����ƶ����������
	 */
	public void setRightCommand(RightCommand rightCommand) {
		this.rightCommand = rightCommand;
	}
	
	/**
	 * ���ÿ������������
	 * @param fallCommand  ����������������
	 */
	public void setFallCommand(FallCommand fallCommand) {
		this.fallCommand = fallCommand;
	}
	
	/**
	 * ���øı���״���������
	 * @param transformCommand �ı���״���������
	 */
	public void setTransformCommand(TransformCommand transformCommand) {
		this.transformCommand = transformCommand;
	}
	
	/**
	 * ���°�ť�����ƶ�
	 */
	public void toLeft() {
		leftCommand.execute();
	}
	
	/**
	 * ���°�ť�����ƶ�
	 */
	public void toRight() {
		rightCommand.execute();
	}
	
	/**
	 * ���°�ť��������
	 */
	public void fall() {
		fallCommand.execute();
	}
	
	/**
	 * ���°�ť�ı���״
	 */
	public void transform() {
		transformCommand.execute();
	}
}
