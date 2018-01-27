package com.lichao.mediator.demo2;

/**
 * �������Colleagueclass
 * @author LiChao
 *
 */
public class ColleagueA extends Colleague {

	public ColleagueA(String name, Mediator mediator) {
		super(name, mediator);
	}
	
	public void getMessage(String message) {
		System.out.println("ͬ��A" + name + "�����Ϣ:" + message);
	}
	
	/**
	 * ͬ��A���н���ͨ��
	 * @param message
	 */
	public void contact(String message) {
		mediator.contact(message, this);
	}
}
