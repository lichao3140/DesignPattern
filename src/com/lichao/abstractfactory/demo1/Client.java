package com.lichao.abstractfactory.demo1;

/**
 * �ͻ���
 * @author LiChao
 *
 */
public class Client {
	public static void main(String[] args) {
		//����һ������Q3�Ĺ���
		CarFactory factoryQ3 = new Q3Factory();
		factoryQ3.createTire().tire();
		factoryQ3.createEngine().engine();
		factoryQ3.createBrake().brake();
		
		System.out.println("----------------------");
		
		//����һ������Q7�Ĺ���
		CarFactory factoryQ7 = new Q7Factory();
		factoryQ7.createTire().tire();
		factoryQ7.createEngine().engine();
		factoryQ7.createBrake().brake();
	}
}
