package com.lichao.builder.demo1;

public class Client {
	public static void main(String[] args) {
		//构建器
		Builder builder = new MacbookBuilder();
		
		Director pcDirector = new Director(builder);
		//封装构建过程
		pcDirector.construct("英特尔主板", "Retina显示器");
		
		System.out.println("computer info:" + builder.create().toString());
	}
}
