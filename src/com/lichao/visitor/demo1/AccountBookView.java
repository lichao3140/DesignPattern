package com.lichao.visitor.demo1;

/**
 * �����߽ӿ�
 * @author LiChao
 *
 */
public interface AccountBookView {
	// �鿴���ѵĵ���
    void view(ConsumerBill consumerBill);

    // �鿴���뵥��
    void view(IncomeBill incomeBill);
}
