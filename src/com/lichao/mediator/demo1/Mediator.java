package com.lichao.mediator.demo1;

/**
 * �����н���
 * @author LiChao
 *
 */
public abstract class Mediator {

	/**
	 * ͬ�¶���ı�ʱ֪ͨ�н��ߵķ���
	 * ��ͬ�¶���ı�ʱ���н���֪ͨ������ͬ�¶���
	 * @param c
	 */
	public abstract void changed(Colleague c);
}
