package com.lichao.visitor.model;

/**
 * Visitor����
 * @author LiChao
 *
 */
public interface Visitor {

	//�ÿ͹���ʦ����
	public void visit(Engineer engineer);
	
	//�ÿ;�������
	public void visit(Manager leader);
}
