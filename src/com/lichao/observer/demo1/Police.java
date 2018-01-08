package com.lichao.observer.demo1;

/**
 * 具体的观察者---警察 
 * @author LiChao
 *
 */
public class Police implements Watcher{

	@Override
	public void update() {
		System.out.println("运输车有行动，警察护航");
	}
}
