package com.lichao.visitor.model;

import java.util.Random;

/**
 * 工程师类
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
	
	//工程师一年写的代码数量
	public int getCodeLines() {
		return new Random().nextInt(10 * 10000);
	}

}
