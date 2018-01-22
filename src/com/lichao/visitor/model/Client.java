package com.lichao.visitor.model;

public class Client {

	public static void main(String[] args) {
		//构建报表
		BusinessReport report = new BusinessReport();
		System.out.println("--------给CEO看的报表--------");
		
		report.showReport(new CEOVisitor());
		System.out.println("--------给CTO看的报表--------");
		report.showReport(new CTOVistor());
	}
}
