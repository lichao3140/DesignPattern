package com.lichao.subject.model;

/**
 * ������
 * @author LiChao
 *
 */
public class ProxySubject extends Subject {
	//������ʵ���������
	private RealSubject mSubject;
	
	public ProxySubject(RealSubject mSubject) {
		this.mSubject = mSubject;
	}

	@Override
	public void visit() {
		mSubject.visit();
	}

}
