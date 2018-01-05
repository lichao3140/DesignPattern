package com.lichao.abstractfactory.demo1;

/**
 * 普通制动
 * @author LiChao
 *
 */
public class NormalBrake implements IBrake {

	@Override
	public void brake() {
		System.out.println("普通制动");
	}
}
