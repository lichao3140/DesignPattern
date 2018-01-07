package com.lichao.handler.model;

/**
 * 抽象处理者
 * @author LiChao
 *
 */
public abstract class Handler {
	//下一节点的处理者
	protected Handler successor;
	
	/**
	 * 请求处理
	 * @param condition 请求条件
	 */
	public abstract void handleRequest(String condition);
}
