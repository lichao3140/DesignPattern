package com.lichao.templatemethod.demo1;

/**
 * 
 * @author LiChao
 *
 */
public abstract class AbstractPerson {
	//�����ǲ�ͬ�����������������ɵľ��岽��  
	protected abstract void dressUp();
	protected abstract void eatBreakfast();
	protected abstract void takeThings();
	
	//�����ඨ���������̹Ǽ�
	public void prepareGotoSchool() {
		dressUp();
        eatBreakfast();
        takeThings();
	}
}
