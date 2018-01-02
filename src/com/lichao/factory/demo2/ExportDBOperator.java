package com.lichao.factory.demo2;

public class ExportDBOperator extends ExportOperate {

	@Override
	public ExportFileApi newFileApi() {
		
		return new ExportDBFile();
	}
}
