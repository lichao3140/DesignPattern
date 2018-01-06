package com.lichao.strategy.demo2;

/**
 * 实现类---ConcreteStrategy
 * @author LiChao
 *
 */
public class BackDoor implements IStrategy{

	@Override
	public void operate() {
		System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
	}

}
