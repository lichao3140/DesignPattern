package com.lichao.component.model;

/**
 * ������ڵ�
 * @author LiChao
 *
 */
public abstract class Component {
	/**
	 * �ڵ���
	 */
	protected String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	/**
	 * ������߼�����������ʵ��
	 */
	public abstract void diSomething();
	
	/**
	 * ����ӽڵ�
	 * @param child
	 */
	public abstract void addChild(Component child);
	
	/**
	 * �Ƴ��ӽڵ�
	 * @param child
	 */
	public abstract void removeChild(Component child);
	
	/**
	 * ��ȡ�ӽڵ�
	 * @param index
	 */
	public abstract Component getChildren(int index);
	
}
