package com.lichao.abstractfactory.demo1;

/**
 * ��ͨ�ƶ�
 * @author LiChao
 *
 */
public class NormalBrake implements IBrake {

	@Override
	public void brake() {
		System.out.println("��ͨ�ƶ�");
	}
}
