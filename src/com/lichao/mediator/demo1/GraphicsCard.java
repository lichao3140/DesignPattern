package com.lichao.mediator.demo1;

/**
 * �Կ�ͬ��
 * @author LiChao
 *
 */
public class GraphicsCard extends Colleague {

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ��Ƶ����
	 * @param data
	 */
	public void videoPlay(String data) {
		System.out.println("��Ƶ��" + data);
	}
}
