package com.lichao.handler.model;

/**
 * ��������
 * @author LiChao
 *
 */
public abstract class Handler {
	//��һ�ڵ�Ĵ�����
	protected Handler successor;
	
	/**
	 * ������
	 * @param condition ��������
	 */
	public abstract void handleRequest(String condition);
}
