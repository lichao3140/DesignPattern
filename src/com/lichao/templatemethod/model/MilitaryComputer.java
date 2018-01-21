package com.lichao.templatemethod.model;

/**
 * 军用计算机
 * @author LiChao
 *
 */
public class MilitaryComputer extends AbstractComputer {
	
	@Override
	protected void checkHardware() {
		super.checkHardware();
		System.out.println("检查硬件防火墙");
	}

	@Override
	protected void login() {
		System.out.println("进行指纹识别等复杂的用户验证");
	}

}
