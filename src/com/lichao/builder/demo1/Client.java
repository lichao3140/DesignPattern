package com.lichao.builder.demo1;

public class Client {
	public static void main(String[] args) {
		//������
		Builder builder = new MacbookBuilder();
		
		Director pcDirector = new Director(builder);
		//��װ��������
		pcDirector.construct("Ӣ�ض�����", "Retina��ʾ��");
		
		System.out.println("computer info:" + builder.create().toString());
	}
}
