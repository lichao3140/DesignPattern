package com.lichao.adapter.model2;

/**
 * ����������ģʽ
 * @author LiChao
 *
 */
public class Client {
	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter(new Volt220());
		System.out.println("�����ѹ:" + adapter.getVolt5());
	}
}
