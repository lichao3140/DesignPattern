package com.lichao.mediator.demo1;

/**
 * ����ͬ��
 * @author LiChao
 *
 */
public abstract class Colleague {
	//ÿһ��ͬ�¶���֪�������н���
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
