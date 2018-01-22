package com.lichao.visitor.demo1;

/**
 * 会计类：访问者是会计，主要记录每笔单子
 * @author LiChao
 *
 */
public class CPA implements AccountBookView {
	int count = 0;

	// 查看消费的单子
	@Override
	public void view(ConsumerBill consumerBill) {
		count++;
        if (consumerBill.getItem().equals("消费")) {
            System.out.println("第" + count + "个单子消费了：" + consumerBill.getAmount());
        }
	}

	// 查看收入单子
	@Override
	public void view(IncomeBill incomeBill) {
		if (incomeBill.getItem().equals("收入")) {
            System.out.println("第" + count + "个单子收入了：" + incomeBill.getAmount());
        }
	}

}
