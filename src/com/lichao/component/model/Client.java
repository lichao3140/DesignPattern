package com.lichao.component.model;

public class Client {

	public static void main(String[] args) {
		//����һ�����ڵ�
		Component root = new Composite("Root");
		
		//��������֦�ɽڵ�
		Component branch1 = new Composite("Branch1");
		Component branch2 = new Composite("Branch2");
		
		//��������Ҷ�ӽڵ�
		Leaf leaf1 = new Leaf("Leaf1");
		Leaf leaf2 = new Leaf("Leaf2");
		
		//��Ҷ�ӽڵ���ӵ�֦�ɽڵ�
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		
		//��֦�ɽڵ���ӵ����ڵ�
		root.addChild(branch1);
		root.addChild(branch2);
		
		//ִ�з���
		root.diSomething();
	}
}
