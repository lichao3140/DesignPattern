package com.lichao.builder.demo2;

public class Client {
	
	public static void main(String[] args) {    
	    Build worker = new WorkBuilder(); //��ȡ���˶���   
	    Designer designer = new Designer();   //��ȡ���ʦ���� 
	    designer.order(worker);    //���ʦָ�ӹ��˹���
	    System.out.println(worker.getRoom());;   //���˽��� 
 }   
}
