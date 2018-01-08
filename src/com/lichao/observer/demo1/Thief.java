package com.lichao.observer.demo1;

/**
 * 具体的观察者---强盗 
 * @author LiChao
 *
 */
public class Thief implements Watcher{

	@Override
	public void update() {
		System.out.println("运输车有行动，强盗准备动手");
	}
}
