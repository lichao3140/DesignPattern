package com.lichao.handler.demo1;

/**
 * ����������쵼��
 * @author LiChao
 *
 */
public class Manager extends Leader {

	@Override
	public int limit() {
		return 10000;
	}

	@Override
	public void handle(int money) {
		System.out.println("������������" + money + "Ԫ");
	}

}
