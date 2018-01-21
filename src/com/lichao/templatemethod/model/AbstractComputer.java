package com.lichao.templatemethod.model;

/**
 * 抽象的Computer
 * @author LiChao
 *
 */
public abstract class AbstractComputer {
	
	protected void powerOn() {
		System.out.println("开启电源");
	}
	
	protected void checkHardware() {
		System.out.println("硬件检查");
	}
	
	protected void loadOS() {
		System.out.println("载入操作系统");
	}
	
	protected void login() {
		System.out.println("直接登录操作系统");
	}
	
	//启动计算机方法，步骤固定为开启电源、系统检查、加载操作系统、用户登录。
	//该方法为final，防止算法框架被复写
	public final void startUP() {
		System.out.println("-----开机Start-----");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("-----开机End-----");
	}
}
