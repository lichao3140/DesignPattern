package com.lichao.visitor.model;

/**
 * CTO访问类
 * @author LiChao
 *
 */
public class CTOVistor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师:" + engineer.name + " 代码:" + engineer.getCodeLines());
	}

	@Override
	public void visit(Manager leader) {
		System.out.println("经理:" + leader.name + " 产品数量:" + leader.getProducts());
	}

}
