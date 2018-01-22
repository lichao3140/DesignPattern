package com.lichao.visitor.model;

import java.util.Random;

/**
 * ��������
 * @author LiChao
 *
 */
public class Manager extends Staff {
	public int products;//��Ʒ����

	public Manager(String aName) {
		super(aName);
		products = new Random().nextInt(10);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	//һ�������Ĳ�Ʒ����
	public int getProducts() {
		return products;
	}
}
