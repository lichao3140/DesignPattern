package com.lichao.handler.model;

/**
 * 具体处理者2
 * @author LiChao
 *
 */
public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(String condition) {
		if (condition.equals("ConcreteHandler2")) {
			System.out.println("ConcreteHandler2 handled");
			return;
		} else {
			successor.handleRequest(condition);
		}
		
	}

}
