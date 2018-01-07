package com.lichao.handler.demo1;

/**
 * 各个具体的领导者
 * @author LiChao
 *
 */
public class Boss extends Leader {

	@Override
	public int limit() {
		return Integer.MAX_VALUE;
	}

	@Override
	public void handle(int money) {
		System.out.println("老板批复报销" + money + "元");
	}

}
