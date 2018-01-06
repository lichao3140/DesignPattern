package com.lichao.strategy.demo1;

/**
 * �������۸�������
 * @author LiChao
 *
 */
public class BusStrategy implements CalculateStrategy {

	/**
	 * 10����֮��1Ԫ������10����֮��ÿ��1Ԫ���Գ�5����
	 */
	@Override
	public int calculatePrice(int km) {
		// ����10������ܾ���
		int extraTotal = km - 10;
		// �����ľ�����5����ı���
		int extraFactor = extraTotal / 10;
		// �����ľ����5����ȡ��
		int fraction = extraTotal % 5;
		// �۸����
		int price = 1 + extraFactor * 1;
		return fraction > 0 ? ++price : price;
	}

}
