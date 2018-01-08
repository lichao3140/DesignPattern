package com.lichao.command.demo1;

/**
 * ����
 * ����ִ�й�������
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
	 * ����
	 */
	public void attack() {
		soldier.setAttach("����  ���");
		System.out.println("����  ���");
	}
	
	/**
	 * ����
	 */
	public void back() {
		soldier.setBack("ǰ�����²���Ͻ�����");
		System.out.println("ǰ�����²���Ͻ�����");
	}
	
	/**
	 * ԭ������
	 */
	public void undo() {
		soldier.setBack("ԭ·����");
		System.out.println("ԭ·����");
	}
}
