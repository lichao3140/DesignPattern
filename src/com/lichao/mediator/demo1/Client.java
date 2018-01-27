package com.lichao.mediator.demo1;

public class Client {
	public static void main(String[] args) {
		//�����������
		MainBoard mediator = new MainBoard();
		
		//�ֱ�������㲿��
		CDDevice cd = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		GraphicsCard vc = new GraphicsCard(mediator);
		SoundCard sc = new SoundCard(mediator);
		
		//�������㲿����װ������
		mediator.setCDDevice(cd);
		mediator.setCPU(cpu);
		mediator.setGraphicsCard(vc);
		mediator.setSoundCard(sc);
		
		//��ɺ�Ϳ��Կ�ʼ������
		cd.load();
	}
}