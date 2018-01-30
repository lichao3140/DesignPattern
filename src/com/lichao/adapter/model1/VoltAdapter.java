package com.lichao.adapter.model1;

/**
 * Adapter 角色，将220V的电压转换成5V的电压
 * @author LiChao
 *
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

	public int getVolt5() {
		return 5;
	}

}
