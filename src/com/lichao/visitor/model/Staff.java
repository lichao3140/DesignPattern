package com.lichao.visitor.model;

import java.util.Random;

/**
 * Ա������
 * @author LiChao
 *
 */
public abstract class Staff {
	public String name;
	
	public int kpi;
	
	public Staff(String aName) {
		this.name = aName;
		kpi = new Random().nextInt(10);
	}
	
	//����Visitor�ķ���
	public abstract void accept(Visitor visitor);
}
