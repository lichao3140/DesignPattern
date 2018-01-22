package com.lichao.visitor.model;

import java.util.Random;

/**
 * 员工基类
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
	
	//接受Visitor的访问
	public abstract void accept(Visitor visitor);
}
