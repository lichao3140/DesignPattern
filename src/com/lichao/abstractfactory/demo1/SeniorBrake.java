package com.lichao.abstractfactory.demo1;

/**
 * 高级制动
 * @author LiChao
 *
 */
public class SeniorBrake implements IBrake {

	@Override
	public void brake() {
		System.out.println("高级制动");
	}
}
