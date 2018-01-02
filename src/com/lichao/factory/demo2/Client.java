package com.lichao.factory.demo2;

public class Client {

	public static void main(String[] args) {
		String data = "我的数据";
		ExportDBOperator op = new ExportDBOperator();
		op.export(data);

		ExportExcelOperator op2 = new ExportExcelOperator();
		op2.export(data);
	}

}
