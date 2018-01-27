package com.lichao.mediator.demo1;

/**
 * ����ͬ��
 * @author LiChao
 *
 */
public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ��Ƶ����
	 * @param data
	 */
	public void soundPlay(String data) {
		System.out.println("��Ƶ��" + data);
	}
}
