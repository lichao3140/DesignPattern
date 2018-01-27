package com.lichao.mediator.demo2;

/**
 * �������Colleagueclass
 * @author LiChao
 *
 */
public class ColleagueB extends Colleague {

	public ColleagueB(String name, Mediator mediator) {
		super(name, mediator);
	}
	
	public void getMessage(String message) {
		System.out.println("ͬ��B" + name + "�����Ϣ:" + message);
	}
	
	/**
	 * ͬ��B���н���ͨ��
	 * @param message
	 */
	public void contact(String message) {
		mediator.contact(message, this);
	}
}
