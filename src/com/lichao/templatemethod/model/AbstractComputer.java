package com.lichao.templatemethod.model;

/**
 * �����Computer
 * @author LiChao
 *
 */
public abstract class AbstractComputer {
	
	protected void powerOn() {
		System.out.println("������Դ");
	}
	
	protected void checkHardware() {
		System.out.println("Ӳ�����");
	}
	
	protected void loadOS() {
		System.out.println("�������ϵͳ");
	}
	
	protected void login() {
		System.out.println("ֱ�ӵ�¼����ϵͳ");
	}
	
	//�������������������̶�Ϊ������Դ��ϵͳ��顢���ز���ϵͳ���û���¼��
	//�÷���Ϊfinal����ֹ�㷨��ܱ���д
	public final void startUP() {
		System.out.println("-----����Start-----");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("-----����End-----");
	}
}
