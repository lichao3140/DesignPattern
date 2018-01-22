package com.lichao.visitor.model;

/**
 * CTO������
 * @author LiChao
 *
 */
public class CTOVistor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("����ʦ:" + engineer.name + " ����:" + engineer.getCodeLines());
	}

	@Override
	public void visit(Manager leader) {
		System.out.println("����:" + leader.name + " ��Ʒ����:" + leader.getProducts());
	}

}
