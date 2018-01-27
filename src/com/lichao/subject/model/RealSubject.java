package com.lichao.subject.model;

/**
 * 实现抽象主题的真实主题类
 * @author LiChao
 *
 */
public class RealSubject extends Subject {

	@Override
	public void visit() {
		System.out.println("Real subject!");
	}

}
