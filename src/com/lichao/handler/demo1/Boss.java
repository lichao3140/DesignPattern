package com.lichao.handler.demo1;

/**
 * ����������쵼��
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
		System.out.println("�ϰ���������" + money + "Ԫ");
	}

}
