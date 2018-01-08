package com.lichao.observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * ���屻�۲��ߣ�ConcreteSubject��
 * @author LiChao
 *
 */
public class SubscriptionSubject implements Subject {
	//���涩�Ĺ��ںŵ�΢���û�
    private List<Observer> weixinUserlist = new ArrayList<Observer>();


	@Override
	public void attach(Observer observer) {
		weixinUserlist.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		 weixinUserlist.remove(observer);
	}

	@Override
	public void notify(String message) {
		 for (Observer observer : weixinUserlist) {
			 observer.update(message);
		 }
	}
	
}
