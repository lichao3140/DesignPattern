package com.lichao.visitor.model;

import java.util.Random;

/**
 * ����ʦ��
 * @author LiChao
 *
 */
public class Engineer extends Staff {

	public Engineer(String aName) {
		super(aName);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	//����ʦһ��д�Ĵ�������
	public int getCodeLines() {
		return new Random().nextInt(10 * 10000);
	}

}
