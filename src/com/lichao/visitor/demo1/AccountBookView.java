package com.lichao.visitor.demo1;

/**
 * 访问者接口
 * @author LiChao
 *
 */
public interface AccountBookView {
	// 查看消费的单子
    void view(ConsumerBill consumerBill);

    // 查看收入单子
    void view(IncomeBill incomeBill);
}
