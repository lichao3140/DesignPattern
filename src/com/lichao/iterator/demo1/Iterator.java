package com.lichao.iterator.demo1;

public interface Iterator {
	/**
	 * �Ƿ�����һ��Ԫ��
	 * @return true�У�falseû��
	 */
	boolean hasNext();
	
	/**
	 * ���ص�ǰԪ�أ�����λ������һλ
	 * @return
	 */
	Object next();
}
