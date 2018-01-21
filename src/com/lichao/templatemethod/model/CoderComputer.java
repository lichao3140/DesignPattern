package com.lichao.templatemethod.model;

/**
 * 程序员计算机
 * @author LiChao
 *
 */
public class CoderComputer extends AbstractComputer {

	@Override
	protected void login() {
		System.out.println("程序员只需要进行用户名和密码验证登录");
	}

}
