package com.lichao.mediator.demo1;

/**
 * CPUͬ��
 * @author LiChao
 *
 */
public class CPU extends Colleague {
	private String dataSound;//��Ƶ����
	private String dataVideo;//��Ƶ����

	public CPU(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ��ȡ��Ƶ����
	 * @return
	 */
	public String getDataSound() {
		return dataSound;
	}

	/**
	 * ��ȡ��Ƶ����
	 * @return
	 */
	public String getDataVideo() {
		return dataVideo;
	}
	
	/**
	 * ��������
	 * @param data
	 */
	public void decodeData(String data) {
		//�ָ�����Ƶ����
		String[] temp = data.split(",");
		
		//��������Ƶ����
		dataVideo = temp[0];
		dataSound = temp[1];
		
		//�����н�������״̬�ı�
		mediator.changed(this);
	}

}
