package com.lichao.visitor.demo1;

/**
 * ����һ���˵��ӿڣ��н��շ����ߵĹ���
 * @author LiChao
 *
 */
public interface Bill {
	void accept(AccountBookView viewer);
}
