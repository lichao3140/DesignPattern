package com.lichao.component.model;

public class Client {

	public static void main(String[] args) {
		//构造一个根节点
		Component root = new Composite("Root");
		
		//构造两个枝干节点
		Component branch1 = new Composite("Branch1");
		Component branch2 = new Composite("Branch2");
		
		//构造两个叶子节点
		Leaf leaf1 = new Leaf("Leaf1");
		Leaf leaf2 = new Leaf("Leaf2");
		
		//将叶子节点添加到枝干节点
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		
		//将枝干节点添加到根节点
		root.addChild(branch1);
		root.addChild(branch2);
		
		//执行方法
		root.diSomething();
	}
}
