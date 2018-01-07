package com.lichao.handler.demo1;

/**
 * �����쵼��
 * @author LiChao
 *
 */
public abstract class Leader {
	//��һ���쵼������
	protected Leader nextHandler;
	
	/**
	 * ����������
	 * @param money
	 */
	public final void handleRequest(int money) {
		if (money <= limit()) {
			handle(money);
		} else {
			if (null != nextHandler) {
				nextHandler.handleRequest(money);
			}
		}
	}
	
	/**
	 * �����������Ķ��Ȩ��
	 * @return ���
	 */
	public abstract int limit();
	
	/**
	 * ��������Ϊ
	 * @param money ������
	 */
	public abstract void handle(int money);
}
