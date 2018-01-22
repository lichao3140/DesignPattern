package com.lichao.visitor.demo1;

public class Client {
	
	public static void main(String[] args) {
		// 创建消费和收入单子
        Bill consumerBill = new ConsumerBill("消费", 3000);
        Bill incomeBill = new IncomeBill("收入", 5000);
        Bill consumerBill2 = new ConsumerBill("消费", 4000);
        Bill incomeBill2 = new IncomeBill("收入", 8000);
        // 添加单子
        AccountBook accountBook = new AccountBook();
        accountBook.add(consumerBill);
        accountBook.add(incomeBill);
        accountBook.add(consumerBill2);
        accountBook.add(incomeBill2);
        // 创建访问者
        AccountBookView boss = new Boss();
        AccountBookView cpa = new CPA();

        // 接受访问者
        accountBook.show(boss);
        accountBook.show(cpa);
        // boss查看总收入和总消费
        ((Boss) boss).getTotalConsumer();
        ((Boss) boss).getTotalIncome();
	}
}
