package com.lichao.adapter.model1;

/**
 * Adapter ��ɫ����220V�ĵ�ѹת����5V�ĵ�ѹ
 * @author LiChao
 *
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

	public int getVolt5() {
		return 5;
	}

}
