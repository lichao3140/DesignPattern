package com.lichao.handler.demo1;

/**
 * ����������쵼��
 * @author LiChao
 *
 */
public class GroupLeader extends Leader {

	@Override
	public int limit() {
		return 1000;
	}

	@Override
	public void handle(int money) {
		System.out.println("�鳤��������" + money + "Ԫ");
	}

}
