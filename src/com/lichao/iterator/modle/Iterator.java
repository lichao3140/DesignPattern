package com.lichao.iterator.modle;

/**
 * �������ӿ�
 * @author LiChao
 *
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * �Ƿ�����һ��Ԫ��
	 * @return  true�У�falseû��
	 */
	boolean hasNext();
	
	/**
	 * ���ص�ǰλ�õ�Ԫ�ز���λ��������һλ
	 * @return
	 */
	T next();
}
