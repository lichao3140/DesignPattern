package com.lichao.builder.demo2;

public class Client {
	
	public static void main(String[] args) {    
	    Build worker = new WorkBuilder(); //获取工人对象   
	    Designer designer = new Designer();   //获取设计师对象 
	    designer.order(worker);    //设计师指挥工人工作
	    System.out.println(worker.getRoom());;   //工人交房 
 }   
}
