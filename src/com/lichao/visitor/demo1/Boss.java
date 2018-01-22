package com.lichao.visitor.demo1;

/**
 * �ϰ��ࣺ���������ϰ壬��Ҫ�鿴��֧����������
 * @author LiChao
 *
 */
public class Boss implements AccountBookView {
	private double totalConsumer;
    private double totalIncome;

    // �鿴���ѵĵ���
	@Override
	public void view(ConsumerBill consumerBill) {
		 totalConsumer = totalConsumer + consumerBill.getAmount();
	}

	// �鿴���뵥��
	@Override
	public void view(IncomeBill incomeBill) {
		totalIncome = totalIncome + incomeBill.getAmount();
	}
	
	public void getTotalConsumer() {
        System.out.println("�ϰ�һ��������" + totalConsumer);
    }

    public void getTotalIncome() {
        System.out.println("�ϰ�һ��������" + totalIncome);
    }
}
