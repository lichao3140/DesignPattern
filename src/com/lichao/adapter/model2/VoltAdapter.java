package com.lichao.adapter.model2;

/**
 * Adapter ��ɫ����220V�ĵ�ѹת����5V�ĵ�ѹ
 * @author LiChao
 *
 */
public class VoltAdapter implements FiveVolt {
	
	Volt220 mVolt220;
	
	public VoltAdapter(Volt220 adapter) {
		mVolt220 = adapter;
	}
	
	public int getVolt220() {
		return mVolt220.getVolt220();
	}

	public int getVolt5() {
		return 5;
	}

}
