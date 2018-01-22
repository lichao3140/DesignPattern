package com.lichao.visitor.demo1;

public class Client {
	
	public static void main(String[] args) {
		// �������Ѻ����뵥��
        Bill consumerBill = new ConsumerBill("����", 3000);
        Bill incomeBill = new IncomeBill("����", 5000);
        Bill consumerBill2 = new ConsumerBill("����", 4000);
        Bill incomeBill2 = new IncomeBill("����", 8000);
        // ��ӵ���
        AccountBook accountBook = new AccountBook();
        accountBook.add(consumerBill);
        accountBook.add(incomeBill);
        accountBook.add(consumerBill2);
        accountBook.add(incomeBill2);
        // ����������
        AccountBookView boss = new Boss();
        AccountBookView cpa = new CPA();

        // ���ܷ�����
        accountBook.show(boss);
        accountBook.show(cpa);
        // boss�鿴�������������
        ((Boss) boss).getTotalConsumer();
        ((Boss) boss).getTotalIncome();
	}
}
