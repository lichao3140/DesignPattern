package com.lichao.visitor.model;

/**
 * Visitor类型
 * @author LiChao
 *
 */
public interface Visitor {

	//访客工程师类型
	public void visit(Engineer engineer);
	
	//访客经理类型
	public void visit(Manager leader);
}
