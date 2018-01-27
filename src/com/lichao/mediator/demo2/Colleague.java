package com.lichao.mediator.demo2;

/**
 * �������Colleague
 * @author LiChao
 *
 */
public class Colleague {
	protected String name;
	protected Mediator mediator;
	 
    public Colleague(String name, Mediator mediator) {
        this.name = name;
	    this.mediator = mediator;
	}
}
