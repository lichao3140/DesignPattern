package com.lichao.factory.demo1;

public abstract class AudiFactory {

	/**
	 * ĳ���͵Ĺ�������
	 * @param clz �����SUV�ͺ�����
	 * @return    �����ͺŵ�SUV������
	 */
	public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
