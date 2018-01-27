package com.lichao.mediator.model;

/**
 * ����ͬ��
 * @author LiChao
 *
 */
public abstract class Colleague {
	//�н��߶���
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	/**
	 * ͬ�½�ɫ�ľ�����Ϊ��������ȥʵ��
	 */
	public abstract void action();
}
