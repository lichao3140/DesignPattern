package com.lichao.visitor.demo1;

/**
 * 创建一个账单接口，有接收访问者的功能
 * @author LiChao
 *
 */
public interface Bill {
	void accept(AccountBookView viewer);
}
