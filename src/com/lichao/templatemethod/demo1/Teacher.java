package com.lichao.templatemethod.demo1;

/**
 * ������ConcreteClass
 * @author LiChao
 *
 */
public class Teacher extends AbstractPerson {

	@Override
	protected void dressUp() {
		System.out.println("��������"); 
	}

	@Override
	protected void eatBreakfast() {
		System.out.println("���緹���չ˺��ӳ��緹");
	}

	@Override
	protected void takeThings() {
		System.out.println("��������׼���Ŀ���"); 
	}

}
