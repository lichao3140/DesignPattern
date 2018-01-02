package com.lichao.factory.demo2;

public class ExportDBFile implements ExportFileApi{

	@Override
	public void export(String data) {
		System.out.println("导出数据到数据库文件...");
	}

}
