package com.lichao.handler.demo1;

/**
 * ����������쵼��
 * @author LiChao
 *
 */
public class Director extends Leader {

	@Override
	public int limit() {
		return 5000;
	}

	@Override
	public void handle(int money) {
		System.out.println("������������" + money + "Ԫ");
	}

}
