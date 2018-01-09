package com.lichao.iterator.modle;

/**
 * �����ӿ�
 * @author LiChao
 *
 */
public interface Aggregate<T> {
	/**
	 * ���һԪ��
	 * @param obj
	 */
	void add(T obj);
	
	/**
	 * �Ƴ�һ��Ԫ��
	 * @param obj
	 */
	void remove(T obj);
	
	/**
	 * ��ȡ�����ĵ�����
	 * @return ����������
	 */
	Iterator<T> iterator();
}
