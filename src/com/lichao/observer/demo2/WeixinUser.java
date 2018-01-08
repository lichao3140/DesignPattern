package com.lichao.observer.demo2;

/**
 * ����۲��ߣ�ConcrereObserver��
 * @author LiChao
 *
 */
public class WeixinUser implements Observer {
	// ΢���û���
    private String name;
    public WeixinUser(String name) {
        this.name = name;
    }

	@Override
	public void update(String message) {
		System.out.println(name + "-" + message);	
	}

}
