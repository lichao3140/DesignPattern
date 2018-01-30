package com.lichao.adapter.model1;

/**
 * 类适配器模式
 * @author LiChao
 *
 */
public class Client {
	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter();
		System.out.println("输出电压:" + adapter.getVolt5());
	}
}
