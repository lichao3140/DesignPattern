package com.lichao.adapter.model2;

/**
 * 对象适配器模式
 * @author LiChao
 *
 */
public class Client {
	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter(new Volt220());
		System.out.println("输出电压:" + adapter.getVolt5());
	}
}
