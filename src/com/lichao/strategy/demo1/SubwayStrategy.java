package com.lichao.strategy.demo1;

/**
 * �����۸�������
 * @author LiChao
 *
 */
public class SubwayStrategy implements CalculateStrategy {

	/**
	 * 6������3Ԫ��6~12����4Ԫ��12~22����5Ԫ��22~32����6Ԫ������Ϊ7Ԫ
	 */
	@Override
	public int calculatePrice(int km) {
		if (km <= 6) {
			return 3;
		} else if (km > 6 && km <= 12) {
			return 4;
		} else if (km > 12 && km <= 22) {
			return 5;
		} else if (km > 22 && km <= 32) {
			return 6;
		}
		return 7;
	}

}
