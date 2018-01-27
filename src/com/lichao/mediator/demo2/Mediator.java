package com.lichao.mediator.demo2;

/**
 * 定义抽象Mediator,可以与同时们进行联络
 * @author LiChao
 *
 */
public abstract class Mediator {

	public abstract void contact(String content, Colleague coll);
}
