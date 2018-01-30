package com.lichao.adapter.model2;

/**
 * Adapter 角色，将220V的电压转换成5V的电压
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
