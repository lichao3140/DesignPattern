package com.lichao.visitor.demo1;

/**
 * ����ࣺ�������ǻ�ƣ���Ҫ��¼ÿ�ʵ���
 * @author LiChao
 *
 */
public class CPA implements AccountBookView {
	int count = 0;

	// �鿴���ѵĵ���
	@Override
	public void view(ConsumerBill consumerBill) {
		count++;
        if (consumerBill.getItem().equals("����")) {
            System.out.println("��" + count + "�����������ˣ�" + consumerBill.getAmount());
        }
	}

	// �鿴���뵥��
	@Override
	public void view(IncomeBill incomeBill) {
		if (incomeBill.getItem().equals("����")) {
            System.out.println("��" + count + "�����������ˣ�" + incomeBill.getAmount());
        }
	}

}
