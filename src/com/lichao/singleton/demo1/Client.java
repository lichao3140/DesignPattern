package com.lichao.singleton.demo1;

public class Client {
	public static void main(String[] args) {
		EnumManager.SDCardManager.getSingleton();
	}
}
