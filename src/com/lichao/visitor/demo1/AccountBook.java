package com.lichao.visitor.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * �˵��ࣺ��������˵�����Ϊÿһ���˵���ӷ�����
 * @author LiChao
 *
 */
public class AccountBook {
	private List<Bill> listBill = new ArrayList<Bill>();
	
	// ��ӵ���
    public void add(Bill bill) {
        listBill.add(bill);
    }

    // Ϊÿ���˵���ӷ�����
    public void show(AccountBookView viewer) {
        for (Bill b : listBill) {
            b.accept(viewer);
        }
    }
}
