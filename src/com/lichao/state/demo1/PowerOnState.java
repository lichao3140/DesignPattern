package com.lichao.state.demo1;

/**
 * ����״̬����ʱ�ٴ����������ܲ����κβ���
 * @author LiChao
 *
 */
public class PowerOnState implements TvState{

	@Override
	public void nextChannel() {
		System.out.println("��һƵ��");
	}

	@Override
	public void prevChannel() {
		System.out.println("��һƵ��");
	}

	@Override
	public void turnUp() {
		System.out.println("��������");
	}

	@Override
	public void turnDown() {
		System.out.println("��������");
	}

}
