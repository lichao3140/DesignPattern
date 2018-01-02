package com.lichao.factory.demo2;

public abstract class ExportOperate {
	
	/**
	 * ʵ����ExportFileApi
	 * @return
	 */
	public abstract ExportFileApi newFileApi();
	
	/**
	 * ��������
	 * @param data
	 */
	public void export(String data) {
		ExportFileApi file = newFileApi();
		file.export(data);
	}
}
