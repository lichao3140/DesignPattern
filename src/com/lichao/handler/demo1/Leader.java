package com.lichao.handler.demo1;

/**
 * 抽象领导者
 * @author LiChao
 *
 */
public abstract class Leader {
	//上一级领导处理者
	protected Leader nextHandler;
	
	/**
	 * 处理报账请求
	 * @param money
	 */
	public final void handleRequest(int money) {
		if (money <= limit()) {
			handle(money);
		} else {
			if (null != nextHandler) {
				nextHandler.handleRequest(money);
			}
		}
	}
	
	/**
	 * 自身能批复的额度权限
	 * @return 额度
	 */
	public abstract int limit();
	
	/**
	 * 处理报账行为
	 * @param money 具体金额
	 */
	public abstract void handle(int money);
}
