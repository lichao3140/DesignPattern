package com.lichao.abstractfactory.demo1;

/**
 * ���󳵳���
 * @author LiChao
 *
 */
public abstract class CarFactory {
	/**
	 * ������̥
	 * @return ��̥
	 */
	public abstract ITire createTire();
	
	/**
	 * ����������
	 * @return ������
	 */
	public abstract IEngine createEngine();
	
	/**
	 * �����ƶ�ϵͳ
	 * @return �ƶ�ϵͳ
	 */
	public abstract IBrake createBrake();
}
