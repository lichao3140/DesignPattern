package com.lichao.templatemethod.model;

/**
 * ���ü����
 * @author LiChao
 *
 */
public class MilitaryComputer extends AbstractComputer {
	
	@Override
	protected void checkHardware() {
		super.checkHardware();
		System.out.println("���Ӳ������ǽ");
	}

	@Override
	protected void login() {
		System.out.println("����ָ��ʶ��ȸ��ӵ��û���֤");
	}

}
