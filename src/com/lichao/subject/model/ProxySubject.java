package com.lichao.subject.model;

/**
 * 代理类
 * @author LiChao
 *
 */
public class ProxySubject extends Subject {
	//持有真实主题的饮用
	private RealSubject mSubject;
	
	public ProxySubject(RealSubject mSubject) {
		this.mSubject = mSubject;
	}

	@Override
	public void visit() {
		mSubject.visit();
	}

}
