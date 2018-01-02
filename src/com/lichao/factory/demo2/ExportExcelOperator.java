package com.lichao.factory.demo2;

public class ExportExcelOperator extends ExportOperate{

	@Override
	public ExportFileApi newFileApi() {
		return new ExportExcelFile();
	}

}
