package com.lichao.handler.model;

/**
 * ���崦����1
 * @author LiChao
 *
 */
public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(String condition) {
		if (condition.equals("ConcreteHandler1")) {
			System.out.println("ConcreteHandler1 handled");
			return;
		} else {
			successor.handleRequest(condition);
		}
		
	}

}
