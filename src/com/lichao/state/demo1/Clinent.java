package com.lichao.state.demo1;

public class Clinent {
	public static void main(String[] args) {
		TvController tvController = new TvController();
		//���ÿ���״̬
		tvController.powerOn();
		//��һƵ��
		tvController.nextChannel();
		//��������
		tvController.turnUp();
		//���ùػ�״̬
		tvController.powerOff();
		//��������,��ʱ������Ч
		tvController.turnUp();
	}
}
